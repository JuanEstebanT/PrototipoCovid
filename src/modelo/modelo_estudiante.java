package modelo;

import Main.conector;
import modelo.modelo_estudiante;
import modelo.modelo_principal;
import vista.Registro_Estudiante;
import vista.Ventana_Inicial;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class modelo_estudiante extends conector{
    conector con = new conector();
    Connection conexion =con.conexion();

    public boolean RegistrarEst (personas per){

        try{
            String query = "INSERT INTO datos_personas (Codigo, Nombre, Genero, Direccion, Correo, Facultad, Cargo, Puntaje, Vacunado) values(?????????)";
            PreparedStatement statement = conexion.prepareStatement (query);
            statement.setString(1,per.getCodigo());
            statement.setString(2,per.getNombre());
            statement.setString(3,per.getGenero());
            statement.setString(4,per.getDireccion());
            statement.setString(5,per.getCorreo());
            statement.setString(6,per.getFacultad());
            statement.setString(7,per.getCargo());
            statement.setInt(8,per.getPuntaje());
            statement.setString(9,per.getVacunado());
        }catch(Exception a){

        System.err.println(a);
        return false;
        }finally {
                try {
                    conexion.close();
                }catch(Exception a){
                    System.err.println(a);
                }

        }


        return false;
    }
}
