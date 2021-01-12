package controlador;

import modelo.Vacunas_Covid;
import modelo.modelo_principal;
import vista.Ventana_Inicial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador_prin{
    private modelo_principal modelo_prin;
    private Ventana_Inicial view_prin;
    private Vacunas_Covid vacun;
    public Controlador_prin(modelo_principal modelo,Ventana_Inicial view){
        this.modelo_prin = modelo;
        this.view_prin = view;
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


    }
}
