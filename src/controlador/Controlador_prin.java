package controlador;

import modelo.Vacunas_Covid;
import modelo.modelo_encuesta;
import modelo.modelo_principal;
import modelo.personas;
import vista.Ventana_Encuesta;
import vista.Ventana_Inicial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador_prin{
    private modelo_principal modelo_prin;
    private Ventana_Inicial view_prin;
    private Vacunas_Covid vacun;
    private personas per;
    public Controlador_prin(modelo_principal modelo_prin,Ventana_Inicial view_prin,personas per){
        this.modelo_prin = modelo_prin;
        this.view_prin = view_prin;
        this.per = per;
        this.view_prin.agregarVacunasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo_prin.add_vacunas(Integer.parseInt(view_prin.agg_vacunas.getValue().toString()));
                modelo_prin.actualizaranucio(view_prin.label_vacunas);
            }

        });
        this.view_prin.quitarVacunasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo_prin.remove_vacunas(Integer.parseInt(view_prin.remove_vac.getValue().toString()));
                modelo_prin.actualizaranucio(view_prin.label_vacunas);
            }
        });
        this.view_prin.Regist_estButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo_encuesta obj = new modelo_encuesta();
                Ventana_Encuesta view_Ventana_encuesta = new Ventana_Encuesta();
                Controlador_encuesta crtl = new Controlador_encuesta(view_Ventana_encuesta,obj,per,view_prin);
                view_prin.dispose();
                view_prin.setTipo_cargo(true);
            }
        });
        this.view_prin.registroFuncionariosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo_encuesta obj = new modelo_encuesta();
                Ventana_Encuesta view_Ventana_encuesta = new Ventana_Encuesta();
                Controlador_encuesta crtl = new Controlador_encuesta(view_Ventana_encuesta,obj,per,view_prin);
                view_prin.dispose();
                view_prin.setTipo_cargo(false);
            }
        });

    }
}
