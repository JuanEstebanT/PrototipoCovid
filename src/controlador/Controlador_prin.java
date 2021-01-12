package controlador;

import modelo.modelo_principal;
import vista.Ventana_Inicial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador_prin{
    private modelo_principal modelo_prin;
    private Ventana_Inicial view_prin;
    public Controlador_prin(modelo_principal modelo,Ventana_Inicial view){
        this.modelo_prin = modelo;
        this.view_prin = view;
        this.view_prin.agregarVacunasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
