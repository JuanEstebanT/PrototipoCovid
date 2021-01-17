package modelo;
import Main.conector;
import vista.Ventana_Vacunar; //llama a la ventana vacunar con los datos que estan alli
import controlador.Controlador_Vacunar;   //llama a el controlador vacunar con los datos que estan alli
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;


public class modelo_vacunar extends conector {
    conector con = new conector();
    Connection conexion = con.conexion();
    public void setContentPane() { //se supone se usa para que carguen todos los elementos
        /*try {
            DefaultTableModel modelo = new DefaultTableModel();  //objeto de la clase
           tabla_vacunar.setModel (modelo);  //se supone se llama a la tabla, con el nombre puesto en vista y se le envia el modelo ya creado, se esta creando el modelo de la tabla
        }catch (){

        }*/


    }


}
