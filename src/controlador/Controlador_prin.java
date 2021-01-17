package controlador;

import modelo.modelo_encuesta;
import modelo.modelo_listados;
import modelo.modelo_principal;
import modelo.personas;
import vista.Ventana_Encuesta;
import vista.Ventana_Inicial;
import vista.Ventana_listados;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador_prin{

    public Controlador_prin(modelo_principal modelo_prin,Ventana_Inicial view_prin,personas per){

        //Agrega la cantidad de vacunas
        view_prin.agregarVacunasButton.addActionListener(e -> {
            modelo_prin.add_vacunas(Integer.parseInt(view_prin.agg_vacunas.getValue().toString()));
            modelo_prin.actualizaranucio(view_prin.label_vacunas);
        });

        //Quita una cantidad de vacunas, no se puede eliminar una cantidad de vacunas mayor de la que hay
        view_prin.quitarVacunasButton.addActionListener(e -> {
            modelo_prin.remove_vacunas(Integer.parseInt(view_prin.remove_vac.getValue().toString()));
            modelo_prin.actualizaranucio(view_prin.label_vacunas);
        });

        //Activa el boton de registrar estudiante y abre la ventana correspondiente
        view_prin.Regist_estButton.addActionListener(e -> {
            modelo_encuesta obj = new modelo_encuesta();
            Ventana_Encuesta view_Ventana_encuesta = new Ventana_Encuesta();
            Controlador_encuesta crtl = new Controlador_encuesta(view_Ventana_encuesta,obj,per,view_prin);
            view_prin.dispose();
            view_prin.setTipo_cargo(true);
        });

        //Activa el boton de registrar funcionario y abre su ventana correspondiente
        view_prin.registroFuncionariosButton.addActionListener(e -> {
            modelo_encuesta obj = new modelo_encuesta();
            Ventana_Encuesta view_Ventana_encuesta = new Ventana_Encuesta();
            Controlador_encuesta crtl = new Controlador_encuesta(view_Ventana_encuesta,obj,per,view_prin);
            view_prin.dispose();
            view_prin.setTipo_cargo(false);
        });
        view_prin.listaDeRegistradosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo_listados model = new modelo_listados();
                Ventana_listados view = new Ventana_listados();
                Controlador_listados crtl = new Controlador_listados(model,view,per,view_prin);
            }
        });
    }
}
