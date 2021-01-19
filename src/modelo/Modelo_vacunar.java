package modelo;

import Main.conector;
import vista.Vista_vacunar;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.sql.*;

public class Modelo_vacunar extends conector {

    conector con = new conector();
    Connection conexion = con.conexion();
    DefaultTableModel modelo = new DefaultTableModel();

    public void Vista_vacunos(Vista_vacunar vista_v){

        try{

            TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo);
            vista_v.vacunar_table.setRowSorter(sorter);

            PreparedStatement ps;
            ResultSet rs;
            String query = "Select Codigo, Nombre, Genero, Direccion, Correo, Facultad, Cargo, Puntaje, Vacunado FROM datos_personas";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();

            vista_v.vacunar_table.setModel(modelo);
            vista_v.vacunar_table.setRowSorter(sorter);

            ResultSetMetaData rsmd = rs.getMetaData();
            int columnas = rsmd.getColumnCount();

            modelo.addColumn("Codigo");
            modelo.addColumn("Nombre");
            modelo.addColumn("Genero");
            modelo.addColumn("Direccion");
            modelo.addColumn("Correo");
            modelo.addColumn("Facultad");
            modelo.addColumn("Cargo");
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
}