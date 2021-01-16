package Main;

import javax.swing.*;   //Para JFrame
import java.sql.*;      //Para la base de datos

/**
 * Conector se utiliza para dar una coneccion entre la base datos y el programa
 */
public class conector {
    Connection con;
    public Connection conexion(){

        try{
            //Para decirle al programa que base de datos conectarse
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/covid_ud","root","");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Conexion no establecida");
        }

        return con;
    }
}