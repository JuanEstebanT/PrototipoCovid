package com.prototipo.vacunas.ud.co;

import controlador.Controlador_encuesta;
import controlador.Controlador_prin;
import modelo.modelo_encuesta;
import modelo.modelo_principal;
import vista.Registro_Estudiante;
import vista.Registro_Funcionario;
import vista.Ventana_Encuesta;
import vista.Ventana_Inicial;

import java.sql.Connection;

public class Interfaz_Covid {
    public static void main(String[] args){
        Ventana_Inicial inicio = new Ventana_Inicial();
        modelo_principal model = new modelo_principal();
        Controlador_prin crtl = new Controlador_prin(model,inicio);

        conector obj = new conector();
        obj.conxion();
    }
}
