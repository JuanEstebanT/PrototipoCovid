package modelo;

import vista.Ventana_Inicial;

import javax.swing.*;

public class modelo_principal {

    Vacunas_Covid vacunas_covid = new Vacunas_Covid();
    private String nuevo;

    public void add_vacunas(int CantidadAgregar){
        if(CantidadAgregar<=0){

            JOptionPane.showMessageDialog(null,"Error al agregar vacunas","Covid_UD aplha 0.1",JOptionPane.ERROR_MESSAGE);
        }
        if(CantidadAgregar>=1){
            vacunas_covid.sumarVacunas(CantidadAgregar);
            nuevo = "Cantidad de vacunas es: "+ vacunas_covid.getVacunas_totales();
        }

    }

    public void remove_vacunas(int CantidadQuitar){

        if(CantidadQuitar<=0){
            JOptionPane.showMessageDialog(null,"Error al quitar vacunas","Covid_UD aplha 0.1",JOptionPane.ERROR_MESSAGE);
        }
        if(CantidadQuitar>=1){
            if(CantidadQuitar > vacunas_covid.getVacunas_totales()){
                JOptionPane.showMessageDialog(null,"Error al quitar vacunas","Covid_UD aplha 0.1",JOptionPane.ERROR_MESSAGE);
            }else{
                vacunas_covid.restarVacunas(CantidadQuitar);
                nuevo = "Cantidad de vacunas es: "+ vacunas_covid.getVacunas_totales();
            }
        }
    }

    public void actualizaranucio (JLabel x){
        x.setText("Cantidad de vacunas disponibles :"+vacunas_covid.getVacunas_totales());
    }
}
