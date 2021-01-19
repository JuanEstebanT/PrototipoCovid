package controlador;

import Main.conector;
import modelo.Modelo_vacunar;
import vista.Vista_vacunar;

public class Controlador_vacunar extends conector{
    public Controlador_vacunar(Modelo_vacunar model,Vista_vacunar vista){
        model.Vista_vacunos(vista);
    }
}
