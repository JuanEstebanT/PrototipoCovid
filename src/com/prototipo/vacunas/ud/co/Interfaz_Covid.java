package com.prototipo.vacunas.ud.co;

import controlador.Controlador_encuesta;
import controlador.Controlador_prin;
import modelo.modelo_encuesta;
import modelo.modelo_principal;
import vista.Registro_Estudiante;
import vista.Registro_Funcionario;
import vista.Ventana_Encuesta;
import vista.Ventana_Inicial;

public class Interfaz_Covid {
    public static void main(String[] args){
        Ventana_Inicial botones = new Ventana_Inicial();
        /*modelo_encuesta obj = new modelo_encuesta();
        Ventana_Encuesta view_Ventana_encuesta = new Ventana_Encuesta();
        Controlador_encuesta crtl = new Controlador_encuesta(view_Ventana_encuesta,obj);*/
        modelo_principal obj = new modelo_principal();
        Controlador_prin poder = new Controlador_prin(obj,botones);

        Registro_Funcionario objrf = new Registro_Funcionario();
        Registro_Estudiante objre = new Registro_Estudiante();
    }
}
