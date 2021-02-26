package modelo;

import Main.conector;
import vista.Vista_vacunar;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.sql.*;

public class Modelo_vacunar extends conector {

    conector con = new conector();
    Connection conexion = con.conexion();
    DefaultTableModel modelo;
    int Vac_actuales = 0;

    public boolean Suficientes(int restar){
            int prevencion;
            boolean sepuede = false;

            try {
                PreparedStatement ps = null;
                ResultSet rs = null;
                String query = "SELECT NumeroVacunas FROM datos_vacunas WHERE ID = 1";
                ps = conexion.prepareStatement(query);
                rs = ps.executeQuery();
                if (rs.next()) {
                    Vac_actuales = rs.getInt("NumeroVacunas");
                } else {
                    System.err.println("Error");
                }
            } catch (SQLException a) {
                a.printStackTrace();
            }
            prevencion = Vac_actuales - restar;

            if(prevencion < 0){
                JOptionPane.showMessageDialog(null,"No hay vacunas");
                sepuede = false;
            }else{
                try {
                    PreparedStatement ps = null;
                    ResultSet rs = null;
                    Vac_actuales -= restar;
                    String query2 = "UPDATE datos_vacunas SET NumeroVacunas = ? WHERE ID = 1";
                    ps = conexion.prepareStatement(query2);
                    ps.setInt(1, Vac_actuales);
                    ps.executeUpdate();
                    sepuede = true;
                } catch (SQLException b) {
                    b.printStackTrace();
                }
            }
            return sepuede;
    }

    public void Vista_vacunos(Vista_vacunar vista_v,String campo){
        try{
            modelo = new DefaultTableModel();

            String where = "";
            if(!"".equals(campo)){
                where = "WHERE Codigo = '"+ campo +"'";
            }else{
                if("".equals(campo)){
                }
            }

            TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo);
            vista_v.vacunar_table.setRowSorter(sorter);

            PreparedStatement ps;
            ResultSet rs;
            String query = "Select Codigo, Nombre, Correo, Facultad, Puntaje, Vacunado FROM datos_personas "+where;
            System.out.println(query);
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();

            vista_v.vacunar_table.setModel(modelo);
            vista_v.vacunar_table.setRowSorter(sorter);

            ResultSetMetaData rsmd = rs.getMetaData();
            int columnas = rsmd.getColumnCount();

            modelo.addColumn("Codigo");
            modelo.addColumn("Nombre");
            modelo.addColumn("Correo");
            modelo.addColumn("Facultad");
            modelo.addColumn("Puntaje");
            modelo.addColumn("Vacunado");

            while(rs.next()){
                Object[] filas = new Object[columnas];
                for(int i = 0; i < columnas; i++){
                    filas[i] = rs.getObject(i+1);
                }
                modelo.addRow(filas);
            }
        }catch(SQLException ignored){
        }


    }
    public void consultar_personas(String codigo,Vista_vacunar vista_v){
        if(codigo.equals("")){
            vista_v.text_nombre.setText("No hay codigo");
            vista_v.text_vacunas.setText("No hay codigo");
        }else{
            try{

                PreparedStatement ps;
                ResultSet rs;
                String query = "Select Nombre, Vacunado FROM datos_personas Where Codigo ="+codigo;
                ps = conexion.prepareStatement(query);
                rs = ps.executeQuery();

                if (rs.next()){
                    vista_v.text_nombre.setText(rs.getString(1));
                    vista_v.text_vacunas.setText(rs.getString(2));
                }else{
                    System.err.println("Registro no encontrado");
                    JOptionPane.showMessageDialog(null,"Registro no encontrado");
                }

            }catch (SQLException a){
                a.printStackTrace();
            }
        }
    }

    public boolean Verificador_dosis1(String codigo,Vista_vacunar vista_v,boolean cantidad){
        boolean verificador = false;

        if (cantidad){
            String where = "";
            if(!"".equals(codigo)){
                where = "WHERE Codigo = '"+ codigo +"'";
            }else{
                if("".equals(codigo)){
                }
            }
            try{

                PreparedStatement ps;
                ResultSet rs;
                String query = "SELECT Vacunado FROM datos_personas "+where;
                System.out.println(query);
                ps = conexion.prepareStatement(query);
                rs = ps.executeQuery();

                if(rs.next()){
                    if(rs.getString(1).equals("Vacunado Dosis 1")){
                        JOptionPane.showMessageDialog(null,"Error ya vacunado de primera dosis","JDJ Covidapp",JOptionPane.ERROR_MESSAGE);
                        verificador = false;
                    }else if (rs.getString(1).equals("Vacunado Dosis 2")){
                        JOptionPane.showMessageDialog(null,"Error ya vacunado de segunda dosis","JDJ Covidapp",JOptionPane.ERROR_MESSAGE);
                        verificador = false;
                    }else if (rs.getString(1).equals("No vacunado")){
                        verificador = true;
                    }
                }
            }catch (SQLException a){
                System.err.println("Vacuna sin exito");
                a.printStackTrace();
            }
        }else{
            verificador = false;
        }

        return verificador;
    }

    public void primera_dosis(String codigo,Vista_vacunar vista_v,boolean verificador_dosis1){
        if(verificador_dosis1){
            try{
                PreparedStatement ps;
                ResultSet rs;
                String query = "UPDATE datos_personas SET Vacunado = ? Where Codigo ="+codigo;
                ps = conexion.prepareStatement(query);
                ps.setString(1, "Vacunado Dosis 1");
                ps.executeUpdate();
                vista_v.label_status.setText("Vacunación exitosa");
            }catch (SQLException a){
                System.err.println("Error Vacunación");
                a.printStackTrace();
            }




        }else{
            JOptionPane.showMessageDialog(null,"Error");
        }


    }

    public boolean Verificador_dosis2(String codigo,Vista_vacunar vista_v,boolean cantidad){
        boolean verificador = false;
        if(cantidad){
            String where = "";
            if(!"".equals(codigo)){
                where = "WHERE Codigo = '"+ codigo +"'";
            }else{
                if("".equals(codigo)){
                }
            }

            try{

                PreparedStatement ps;
                ResultSet rs;
                String query = "SELECT Vacunado FROM datos_personas "+where;
                System.out.println(query);
                ps = conexion.prepareStatement(query);
                rs = ps.executeQuery();

                if(rs.next()){
                    if(rs.getString(1).equals("No vacunado")){
                        JOptionPane.showMessageDialog(null,"Error no vacunado primera dosis");
                        vista_v.label_status.setText("Error");
                        verificador = false;
                    }else if (rs.getString(1).equals("Vacunado Dosis 2")){
                        JOptionPane.showMessageDialog(null,"Error ya vacunado de segunda dosis");
                        verificador = false;
                        vista_v.label_status.setText("Error");
                    }else if (rs.getString(1).equals("Vacunado Dosis 1")){
                        verificador = true;
                    }
                }
            }catch (SQLException a){
                System.err.println("Vacuna sin exito");
                a.printStackTrace();
            }
        }else{
            verificador = false;
        }


        return verificador;
    }


    public void segunda_dosis(String codigo,Vista_vacunar vista_v,boolean verificador){
        if(verificador){
            try{
                PreparedStatement ps;
                ResultSet rs;
                String query = "UPDATE datos_personas SET Vacunado = ? Where Codigo ="+codigo;
                ps = conexion.prepareStatement(query);
                ps.setString(1, "Vacunado Dosis 2");
                ps.executeUpdate();
                vista_v.label_status.setText("Vacunado Exitosamente");
            }catch (SQLException a){
                System.err.println("Vacuna no exitosa");
                a.printStackTrace();
            }
        }else{
            vista_v.label_status.setText("Vacunado no exitosa");
        }


    }
}