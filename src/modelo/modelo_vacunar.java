package modelo;

import Main.conector;
import vista.Ventana_Vacunar; //llama a la ventana vacunar con los datos que estan alli
import controlador.Controlador_Vacunar;   //llama a el controlador vacunar con los datos que estan alli
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.xml.transform.Result;

public class modelo_vacunar extends conector {
    conector con = new conector();
    Connection conexion = con.conexion();
    private Ventana_Vacunar ventana_vacunar;
         public void tabla(Ventana_Vacunar ventana_vacunar) { //se usa para que carguen todos los elementos
         this.ventana_vacunar=ventana_vacunar;

         try {

         DefaultTableModel modelo = new DefaultTableModel();  //objeto de la clase
         this.ventana_vacunar.tabla_vacunar.setModel (modelo);  // se llama a la tabla, con el nombre puesto en vista y se le envia el modelo ya creado, se esta creando el modelo de la tabla

         PreparedStatement ps = null;
         ResultSet rs =null;

         String query = "SELECT Codigo, Nombre, Genero, Direccion, Correo, Facultad, Cargo, Puntaje, Vacunado FROM datos_personas ";
         ps= conexion.prepareStatement(query);
         rs = ps.executeQuery(); //trae los datos de la consulta

             ResultSetMetaData rsMd = rs.getMetaData(); //se pasa el resultado de la consulta

             int cantidadcolumnas = rsMd.getColumnCount();
             modelo.addColumn("Codigo");
             modelo.addColumn("Nombre");
             modelo.addColumn("Genero");
             modelo.addColumn("Direccion");
             modelo.addColumn("Correo");
             modelo.addColumn("Facultad");
             modelo.addColumn("Cargo");
             modelo.addColumn("Puntaje");
             modelo.addColumn("Vacunado");

                while (rs.next())
                {
                   Object[] filas = new Object[cantidadcolumnas];

                    for (int i = 0; i<cantidadcolumnas; i++  ){
                    filas [i]= rs.getObject(i+1);
                    }
                modelo.addRow(filas);
                }


         }catch (SQLException ex){
        System.err.println (ex.toString());
        }


    }


}
