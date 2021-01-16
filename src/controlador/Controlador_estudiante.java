package controlador;

import modelo.modelo_estudiante;
import modelo.personas;
import vista.Registro_Estudiante;
import vista.Ventana_Inicial;
import javax.swing.*;

public class Controlador_estudiante {
    private final Registro_Estudiante objre;

    public Controlador_estudiante(Registro_Estudiante objre, modelo_estudiante objme, personas objp,Ventana_Inicial ventana_in){
        this.objre= objre;
        this.objre.finalizar_EstButton.addActionListener((e -> {

            objp.setCodigo (objre.txt_codigoEst.getText());
            objp.setNombre (objre.txt_nombreEst.getText());
            objp.setGenero (objre.box_generoEst.getSelectedItem().toString());
            objp.setDireccion(objre.txt_direccionEst.getText());
            objp.setCorreo(objre.txt_correoEst.getText());
            objp.setFacultad(objre.BoxFacultadEst.getSelectedItem().toString());
            objp.setCargo("Estudiante");
            objp.setVacunado("No vacunado");

            if(objme.RegistrarEst(objp)){
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            }else{
                JOptionPane.showMessageDialog(null, "Error al guardar");
            }
            ventana_in.setVisible(true);
            objre.dispose();
        }));
    }
}