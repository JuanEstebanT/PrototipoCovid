package controlador;

import com.prototipo.vacunas.ud.co.conector;
import modelo.modelo_estudiante;
import modelo.modelo_principal;
import vista.Registro_Estudiante;
import vista.Ventana_Inicial;
import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador_estudiante {
    Registro_Estudiante view_Est = new Registro_Estudiante();
    modelo_estudiante model_Est= new modelo_estudiante();
    Ventana_Inicial inicio_prin = new Ventana_Inicial();
    public Controlador_estudiante(Registro_Estudiante view_Est, modelo_estudiante model_Est, Ventana_Inicial inicio_prin){
        this.view_Est= view_Est;
        this.model_Est= model_Est;
        this.inicio_prin = inicio_prin;

        this.view_Est.finalizar_EstButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conector con = new conector();
                Connection conexion =con.conxion();
                try {
                    String query = "INSERT INTO datos_personas (Nombre) values(?)";
                    PreparedStatement statement = conexion.prepareStatement (query);
                    statement.setString(1, view_Est.txt_nombreEst.getText());
                    statement.executeUpdate();

            }catch (Exception a) {
                    Ventana_Inicial view= new Ventana_Inicial();
                    modelo_principal model = new modelo_principal();
                    Controlador_prin crtl = new Controlador_prin(model, view);
                    view_Est.dispose();
                }
    }

} );
}
}