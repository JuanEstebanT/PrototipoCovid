package Main;

import controlador.Controlador_prin;
import modelo.modelo_principal;
import vista.Ventana_Inicial;

public class Interfaz_Covid {
    public static void main(String[] args){
        Ventana_Inicial inicio = new Ventana_Inicial();
        modelo_principal model = new modelo_principal();
        Controlador_prin crtl = new Controlador_prin(model,inicio);

        conector obj = new conector();
        obj.conexion();
    }
}
