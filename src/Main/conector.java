package Main;
import javax.swing.*;
import java.sql.*;
public class conector {
    Connection con;
    public Connection conexion(){

        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/covid_ud","root","");
            JOptionPane.showMessageDialog(null,"Conexion establecida");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Conexion no establecida");
        }

        return con;
    }
}