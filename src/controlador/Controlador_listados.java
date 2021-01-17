package controlador;

import Main.conector;
import modelo.modelo_listados;
import modelo.personas;
import vista.Ventana_Inicial;
import vista.Ventana_listados;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Controlador_listados extends conector{
    public Controlador_listados(modelo_listados models_list, Ventana_listados ventana_lis,personas per,Ventana_Inicial ventana_ini){
        ventana_lis.buscarButton.addActionListener(e -> {
            conector con = new conector();
            con.conexion();
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
        });

        ventana_lis.jtPersonas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                conector con = new conector();
                con.conexion();

                if(models_list.Transferir_data()){
                    ventana_lis.label_statusMDF.setText("Registro Ok");
                    ventana_lis.txt_puntajeMDF.setEnabled(false);
                    ventana_lis.txt_vacunadoMDF.setEnabled(false);
                }
            }
        });

        ventana_lis.modificarButton.addActionListener(e -> {
            conector con = new conector();
            con.conexion();

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
            }else{
                ventana_lis.label_statusMDF.setText("Modificación no exitosa");
            }
            per.resetPuntaje();
        });

        ventana_lis.eliminarButton.addActionListener(e -> {
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
        });

        ventana_lis.regresarButton.addActionListener(e -> {
           ventana_ini.setVisible(true);
           ventana_lis.dispose();
        });
    }
}