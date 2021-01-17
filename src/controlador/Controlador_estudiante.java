package controlador;

import modelo.modelo_estudiante;
import modelo.personas;
import vista.Registro_Estudiante;
import vista.Ventana_Inicial;
import javax.swing.*;
import java.util.Objects;

public class Controlador_estudiante {

    public Controlador_estudiante(Registro_Estudiante objre, modelo_estudiante objme, personas objp,Ventana_Inicial ventana_in){
        objre.finalizar_EstButton.addActionListener((e -> {

            //Se guardan los datos de los campos de texto en la ventana  en la base de datos
            objp.setCodigo (objre.txt_codigoEst.getText());
            objp.setNombre (objre.txt_nombreEst.getText());
            objp.setGenero (Objects.requireNonNull(objre.box_generoEst.getSelectedItem()).toString());
            objp.setDireccion(objre.txt_direccionEst.getText());
            objp.setCorreo(objre.txt_correoEst.getText());
            objp.setFacultad(Objects.requireNonNull(objre.BoxFacultadEst.getSelectedItem()).toString());
            objp.setCargo("Estudiante");
            objp.setVacunado("No vacunado");

            if(objme.RegistrarEst(objp)){
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            }else{
                JOptionPane.showMessageDialog(null, "Error al guardar");
            }
            objp.resetPuntaje();

            ventana_in.setVisible(true);
            objre.dispose(); //el dispose se usa para cerrar la ventana anterior
        }));
    }
}