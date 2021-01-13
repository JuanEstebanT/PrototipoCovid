package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.personas;
import modelo.modelo_funcionario;
import vista.Registro_Funcionario;

import javax.swing.*;

public class Controlador_funcionario {

    private personas objp;
    private modelo_funcionario objm;
    private Registro_Funcionario objr;

    public Controlador_funcionario (personas objp, modelo_funcionario objm, Registro_Funcionario objr){
        this.objp = objp;
        this.objm = objm;
        this.objr = objr;
        this.objr.button_finalizarFun.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == objr.button_finalizarFun){
                    objp.setNombre(objr.txt_nombreFun.getText());
                    objp.setDireccion(objr.txt_direccionFun.getText());
                    objp.setGenero(objr.box_generoFun.getSelectedItem().toString());
                    objp.setCorreo(objr.txt_correoFun.getText());
                    objp.setCodigo(objr.txt_codigoFun.getText());
                    objp.setFacultad(objr.box_facultadFun.getSelectedItem().toString());
                    objp.setCargo(objr.box_cargoFun.getSelectedItem().toString());

                    if(objm.Registro_funcionario(objp)){
                        JOptionPane.showMessageDialog(null, "Registro exitoso");
                    }else{
                        JOptionPane.showMessageDialog(null, "Error al guardar");
                    }
                }
            }
        }));
    }
    public void inciar(){
        objr.setVisible(true);
    }
}
