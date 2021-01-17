package controlador;

import modelo.personas;
import modelo.modelo_funcionario;
import vista.Registro_Funcionario;
import vista.Ventana_Inicial;
import javax.swing.*;
import java.util.Objects;

public class Controlador_funcionario {

    public Controlador_funcionario (personas objp, modelo_funcionario objm, Registro_Funcionario objr,Ventana_Inicial ventana_in){
        objr.button_finalizarFun.addActionListener((e -> {

            //Se guardan los datos del registro funcionario en la base de datos
            objp.setNombre(objr.txt_nombreFun.getText());
            objp.setDireccion(objr.txt_direccionFun.getText());
            objp.setGenero(Objects.requireNonNull(objr.box_generoFun.getSelectedItem()).toString());
            objp.setCorreo(objr.txt_correoFun.getText());
            objp.setCodigo(objr.txt_codigoFun.getText());
            objp.setFacultad(Objects.requireNonNull(objr.box_facultadFun.getSelectedItem()).toString());
            objp.setCargo(Objects.requireNonNull(objr.box_cargoFun.getSelectedItem()).toString());
            objp.setVacunado("No vacunado");

            if(objm.Registro_funcionario(objp)){
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            }else{
                JOptionPane.showMessageDialog(null, "Error al guardar");
            }
            objp.resetPuntaje();

            ventana_in.setVisible(true);
            objr.dispose();
        }));
    }
}