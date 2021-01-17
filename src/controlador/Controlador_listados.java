package controlador;

import Main.conector;
import modelo.modelo_listados;
import modelo.personas;
import vista.Ventana_Inicial;
import vista.Ventana_listados;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.util.Objects;

public class Controlador_listados extends conector{
    private Ventana_listados ventana_lis;
    private modelo_listados models_list;
    private personas per;
    private Ventana_Inicial ventana_ini;
    public Controlador_listados(modelo_listados models_list, Ventana_listados ventana_lis,personas per,Ventana_Inicial ventana_ini){
        this.models_list =models_list;
        this.per = per;
        this.ventana_ini = ventana_ini;
        this.ventana_lis = ventana_lis;
        this.ventana_lis.buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conector con = new conector();
                Connection conexion = con.conexion();
                String campo = ventana_lis.txt_buscarMDF.getText();

                if(models_list.vista_listados(per,ventana_lis,campo)){
                    if(models_list.isEtiqueta_null()){
                        ventana_lis.label_statusMDF.setText("Todos los registros");
                    }else{
                        if(models_list.isEtiqueta_nor()){
                            ventana_lis.label_statusMDF.setText("Busqueda Existosa");
                        }else{
                            if(models_list.isEtiqueta_noenc()){
                                ventana_lis.label_statusMDF.setText("Busqueda no Existosa");
                            }
                        }
                    }
                }else{
                    ventana_lis.label_statusMDF.setText("Error");
                }


            }
        });
        this.ventana_lis.jtPersonas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                conector con = new conector();
                Connection conexion = con.conexion();

                if(models_list.Transferir_data()){
                    ventana_lis.label_statusMDF.setText("Registro Ok");
                    ventana_lis.txt_puntajeMDF.setEnabled(false);
                    ventana_lis.txt_vacunadoMDF.setEnabled(false);
                }
            }
        });
        this.ventana_lis.modificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conector con = new conector();
                Connection conexion = con.conexion();

                per.setCodigo (ventana_lis.txt_codigoMDF.getText());
                per.setNombre (ventana_lis.txt_nombreMDF.getText());
                per.setGenero (ventana_lis.txt_generoMDF.getText());
                per.setDireccion(ventana_lis.txt_direccionMDF.getText());
                per.setCorreo(ventana_lis.txt_correoMDF.getText());
                per.setFacultad(ventana_lis.txt_facultadMDF.getText());
                per.setCargo(ventana_lis.txt_cargoMDF.getText());
                per.setVacunado(ventana_lis.txt_vacunadoMDF.getText());
                per.setPuntaje(Integer.parseInt(ventana_lis.txt_puntajeMDF.getText()));



                if(models_list.modificar_data(per)){
                    ventana_lis.label_statusMDF.setText("Modificación exitosa");
                    per.resetPuntaje();

                }else{
                    ventana_lis.label_statusMDF.setText("Modificación no exitosa");
                    per.resetPuntaje();

                }
            }
        });
        this.ventana_lis.eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(models_list.eliminar_data()){
                    ventana_lis.txt_vacunadoMDF.setText("");
                    ventana_lis.txt_puntajeMDF.setText("");
                    ventana_lis.txt_codigoMDF.setText("");
                    ventana_lis.txt_facultadMDF.setText("");
                    ventana_lis.txt_correoMDF.setText("");
                    ventana_lis.txt_direccionMDF.setText("");
                    ventana_lis.txt_generoMDF.setText("");
                    ventana_lis.txt_nombreMDF.setText("");
                    ventana_lis.txt_cargoMDF.setText("");

                    ventana_lis.label_statusMDF.setText("Eliminacion exitosa");
                    ventana_lis.txt_puntajeMDF.setEnabled(true);
                    ventana_lis.txt_vacunadoMDF.setEnabled(true);
                }else{
                    ventana_lis.label_statusMDF.setText("Eliminacion no exitosa");
                }
            }

        });
        this.ventana_lis.regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               ventana_ini.setVisible(true);
               ventana_lis.dispose();
            }
        });
    }
}
