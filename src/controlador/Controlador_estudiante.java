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

    Registro_Estudiante view_Est = new Registro_Estudiante();
    modelo_estudiante model_Est= new modelo_estudiante();
    Ventana_Inicial inicio_prin = new Ventana_Inicial();

    public Controlador_estudiante(Registro_Estudiante view_Est, modelo_estudiante model_Est, personas objp){
        this.view_Est= view_Est;
        this.model_Est= model_Est;
        this.objp = objp;
        this.objme = objme;
        this.objre = objre;
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

                                               if (objme.RegistrarEst(objp))
                                               {
                                                   JOptionPane.showMessageDialog(null, "Registro Exitoso");
                                               }
                                               else {
                                                   JOptionPane.showMessageDialog(null, "Registro Exitoso");
                                               }
                }

            }

} );
}
        public void iniciar (){
        objre.setVisible(true);
        }
}