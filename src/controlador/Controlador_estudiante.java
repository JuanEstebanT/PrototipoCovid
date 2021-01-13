package controlador;

import Main.conector;
import modelo.modelo_estudiante;
import modelo.personas;
import modelo.modelo_principal;
import vista.Registro_Estudiante;
import vista.Ventana_Inicial;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador_estudiante {
    private personas objp;
    private modelo_estudiante objme;
    private Registro_Estudiante objre;


    public Controlador_estudiante(Registro_Estudiante objre, modelo_estudiante objme, personas objp){
        this.objre= objre;
        this.objme= objme;
        this.objp = objp;
        this.objre.finalizar_EstButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()== objre.finalizar_EstButton){

                    objp.setCodigo (objre.txt_codigoEst.getText());
                    objp.setNombre (objre.txt_nombreEst.getText());
                    objp.setGenero (objre.box_generoEst.getSelectedItem().toString());
                    objp.setDireccion(objre.txt_direccionEst.getText());
                    objp.setCorreo(objre.txt_correoEst.getText());
                    objp.setFacultad(objre.BoxFacultadEst.getSelectedItem().toString());
                    objp.setCargo("Estudiante");
                    objp.setVacunado("No vacunado");

                    JOptionPane.showMessageDialog(null, "Registro Exitoso");
                }

            }

} );
}
        public void iniciar (){
        objre.setVisible(true);
        }
}