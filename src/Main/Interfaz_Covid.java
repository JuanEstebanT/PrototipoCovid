package Main;

// Para importar las clases
import controlador.Controlador_listados;
import controlador.Controlador_prin;
import modelo.modelo_listados;
import modelo.modelo_principal;
import vista.Ventana_Inicial;
import modelo.personas;
import vista.Ventana_listados;

public class Interfaz_Covid {
    public static void main(String[] args){
        Ventana_Inicial inicio = new Ventana_Inicial();
        modelo_principal model = new modelo_principal();
        personas per = new personas();
        Controlador_prin crtl = new Controlador_prin(model,inicio,per); //Para darle accion a los botones
    }
}
