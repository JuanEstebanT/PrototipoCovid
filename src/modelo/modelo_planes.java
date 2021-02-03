package modelo;

import Main.conector;
import vista.Ventana_Planes;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class modelo_planes extends conector {
    conector con = new conector();
    Connection conexion = con.conexion();
    private Ventana_Planes ventana_planes;
    DefaultTableModel modelo = new DefaultTableModel();

    public void vista_planes(Ventana_Planes ventana_planes){

        PreparedStatement ps;
        ResultSet rs;
        String query = "Select planes FROM planes_vacunas";
        try {
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery(query);
            ventana_planes.table1.setModel(modelo);
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnas = rsmd.getColumnCount();
            modelo.addColumn("Planes");

            while(rs.next()){
                Object[] filas = new Object[columnas];
                for(int i = 0; i < columnas; i++){
                    filas[i] = rs.getObject(i+1);
                }
                modelo.addRow(filas);
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
    public void labels(JLabel linea1,JLabel linea2,JLabel linea3,JTable tabla){
        PreparedStatement ps;
        ResultSet rs;
        int fila = tabla.getSelectedRow();
        String Plan =tabla.getValueAt(fila,0).toString();
        try {
            ps = conexion.prepareStatement("SELECT Planes, Dosis_1, Dosis_2 FROM planes_vacunas WHERE Planes = ?");
            ps.setString(1,Plan);
            rs= ps.executeQuery();
            while (rs.next()){
                linea1.setText("El "+rs.getString("Planes")+" se programo con las siguientes fechas");
                linea2.setText("La primera Dosis sera administrada el "+rs.getString("Dosis_1"));
                linea3.setText("La Segunda Dosis sera administrada el "+rs.getString("Dosis_2"));
            }
        } catch (SQLException a) {
            a.printStackTrace();
        }

    }
}
