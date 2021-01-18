package modelo;

import Main.conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class modelo_estudiante extends conector{

    conector con = new conector();
    Connection conexion = con.conexion();

    public boolean RegistrarEst (personas per){
        String query = "INSERT INTO datos_personas (Codigo, Nombre, Genero, Direccion, Correo, Facultad, Cargo, Puntaje, Vacunado) values(?,?,?,?,?,?,?,?,?)";
        try{

            PreparedStatement statement = conexion().prepareStatement (query);
            statement.setString(1,per.getCodigo());
            statement.setString(2,per.getNombre());
            statement.setString(3,per.getGenero());
            statement.setString(4,per.getDireccion());
            statement.setString(5,per.getCorreo());
            statement.setString(6,per.getFacultad());
            statement.setString(7,per.getCargo());
            statement.setInt(8,per.getPuntaje());
            statement.setString(9,per.getVacunado());
            statement.executeUpdate();
            return true;
        }catch(SQLException a){

        System.err.println(a);
        return false;
        }finally {
            try {
                conexion.close();
            }catch(SQLException a){
                System.err.println(a);
            }
        }
    }
}
