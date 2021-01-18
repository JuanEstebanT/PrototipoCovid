package modelo;

import Main.conector;
import vista.Ventana_listados;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class modelo_listados extends conector {
    conector con = new conector();
    Connection conexion = con.conexion();
    private Ventana_listados ventana_lis;

    public boolean isEtiqueta_null() {
        return etiqueta_null;
    }

    public boolean isEtiqueta_nor() {
        return etiqueta_nor;
    }

    public boolean isEtiqueta_noenc() {
        return etiqueta_noenc;
    }

    public boolean etiqueta_null;
    public boolean etiqueta_nor;
    public boolean etiqueta_noenc;
    DefaultTableModel modelo_table;
    public boolean vista_listados (personas per, Ventana_listados ventana_lis,String campo){
    this.ventana_lis = ventana_lis;
    modelo_table = new DefaultTableModel();
            String where = "";
            if(!"".equals(campo)){
                where = "WHERE Codigo = '"+ campo +"'";
                etiqueta_null = false;
            }else{
                if("".equals(campo)){
                    etiqueta_null = true;
                }
            }
        try {

            ventana_lis.jtPersonas.setModel(modelo_table);
            ResultSet rs = null;
            String sql = "SELECT Codigo, Nombre, Correo, Facultad, Cargo FROM datos_personas "+where;
            modelo_table.addColumn("Codigo");
            modelo_table.addColumn("Nombre");
            modelo_table.addColumn("Correo");
            modelo_table.addColumn("Facultad");
            modelo_table.addColumn("Cargo");
            PreparedStatement ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMD = rs.getMetaData();
                int cantidadColumnas = rsMD.getColumnCount();
                    while (rs.next()) {
                        Object[] filas = new Object[cantidadColumnas];
                        for (int i = 0; i < cantidadColumnas; i++) {
                            filas[i] = rs.getObject(i + 1);
                        }
                        modelo_table.addRow(filas);
                    }
            rs = ps.executeQuery();
            if(rs.next()){
                ventana_lis.label_statusMDF.setText("Registro encontrado");
            }else{
                ventana_lis.label_statusMDF.setText("Registro no encontrado");
            }
            return true;
        }catch (SQLException a){
            return false;
        }

    }
    public boolean Transferir_data(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            int fila = ventana_lis.jtPersonas.getSelectedRow();
            String Codigo = ventana_lis.jtPersonas.getValueAt(fila,0).toString();

            ps = conexion.prepareStatement("SELECT Codigo, Nombre, Genero, Direccion, Correo, Facultad, Cargo, Puntaje, Vacunado FROM datos_personas WHERE Codigo = ?");
            ps.setString(1,Codigo);
            rs= ps.executeQuery();

            while (rs.next()){
                ventana_lis.txt_codigoMDF.setText(rs.getString("Codigo"));
                ventana_lis.txt_nombreMDF.setText(rs.getString("Nombre"));
                ventana_lis.txt_generoMDF.setText(rs.getString("Genero"));
                ventana_lis.txt_direccionMDF.setText(rs.getString("Direccion"));
                ventana_lis.txt_correoMDF.setText(rs.getString("Correo"));
                ventana_lis.txt_facultadMDF.setText(rs.getString("Facultad"));
                ventana_lis.txt_cargoMDF.setText(rs.getString("Cargo"));
                ventana_lis.txt_puntajeMDF.setText(rs.getString("Puntaje"));
                ventana_lis.txt_vacunadoMDF.setText(rs.getString("Vacunado"));
            }
            //ventana_lis.txt_vacunadoMDF.setEnabled(false);
            //ventana_lis.txt_puntajeMDF.setEnabled(false);
            return true;
        }catch (SQLException x){
            return  false;
        }

    }


    public boolean modificar_data(personas per){
        PreparedStatement ps = null;
        try {
            String lugar = ventana_lis.txt_buscarMDF.getText().trim();
            PreparedStatement statement = conexion.prepareStatement("UPDATE datos_personas SET  Codigo = ?,Nombre = ?, Genero = ?,Direccion = ?, Correo = ?,Facultad = ?, Cargo = ?, Puntaje = ?, Vacunado = ? where  Codigo = "+lugar);
            statement.setString(1, per.getCodigo());
            statement.setString(2, per.getNombre());
            statement.setString(3, per.getGenero());
            statement.setString(4, per.getDireccion());
            statement.setString(5, per.getCorreo());
            statement.setString(6, per.getFacultad());
            statement.setString(7, per.getCargo());
            statement.setInt(8, per.getPuntaje());
            statement.setString(9, per.getVacunado());
            statement.executeUpdate();
            return true;
           // "UPDATE registro_personas SET  Codigo = ?,Nombre = ?, Genero = ?,Direccion = ?, Correo = ?,Facultad = ?, Cargo = ?, Puntaje = ?, Vacunado = ? where  Codigo = "+lugar
        }catch (SQLException a){
            System.err.printf("nosse");
            a.printStackTrace();
            return false;
        }


    }
     public boolean eliminar_data(){
        PreparedStatement ps = null;
        try {
            String Codigo= "";
            int fila = ventana_lis.jtPersonas.getSelectedRow();
            Codigo = ventana_lis.jtPersonas.getValueAt(fila,0).toString();
                ps=conexion.prepareStatement("DELETE FROM datos_personas WHERE Codigo=?");
                ps.setString(1,Codigo);
                ps.execute();
                modelo_table.removeRow(fila);


            return true;
        }catch (SQLException a){
            a.printStackTrace();
            return false;
        }
     }


}
