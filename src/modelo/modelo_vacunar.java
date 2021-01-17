package modelo;
import Main.conector;
import vista.Ventana_Vacunar;
import controlador.Controlador_Vacunar;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;


public class modelo_vacunar extends conector {
    conector con = new conector();
    Connection conexion = con.conexion();
    public void setContentPane() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
           tabla_vacunar.setModel (modelo);
        }catch (){

        }


    }


}
