package modelo;

import Main.conector;
import vista.Ventana_Planes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class modelo_planVac {
    conector con = new conector();
    Connection conexion = con.conexion();
    LocalDate fechaDosis1 = null;
    LocalDate fechaDosis2 = null;
    LocalDate hoy = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String FechaActual = hoy.format(formatter);
    boolean formatocorrecto;

    public boolean Validar_fecha(int dia,int mes,int año) {
        try {
            fechaDosis1 = LocalDate.of(año,mes,dia);
            formatocorrecto = true;
            System.out.println(fechaDosis1);
        }catch (DateTimeException a){
            a.printStackTrace();
            formatocorrecto = false;
        }
        return formatocorrecto;
    }

    public boolean CompararFechas(boolean validador){
        boolean Confirmacion;
        if(validador){
           if(hoy.isBefore(fechaDosis1)){
               fechaDosis2 = fechaDosis1;
               Confirmacion = true;
           }else{
               System.out.println("Fecha antiguita");
               Confirmacion = false;
           }
        }else{
            System.out.println("fecha invalida");
            Confirmacion = false;
        }
        return Confirmacion;
    }

    public boolean ComprobarPlan(String plan){
        boolean comprobacion = true;
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            String query = "SELECT planes FROM planes_vacunas WHERE planes = ?";
            ps = conexion.prepareStatement(query);
            ps.setString(1,plan);
            rs = ps.executeQuery();
            if (rs.next()) {
                comprobacion = false;
            } else {
                comprobacion = true;
            }
        } catch (SQLException a) {
            a.printStackTrace();
            comprobacion = false;
        }
        return comprobacion;

    }

    public void agregarPlan(boolean comprobacion,String plan){
        if(comprobacion){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String fechafinal = fechaDosis1.format(formatter);
            String fecha2 = fechaDosis2.plusDays(15).format(formatter);
            try {
                PreparedStatement ps = null;
                ResultSet rs = null;
                String query = "INSERT INTO planes_vacunas (planes, Dosis_1,Dosis_2) Values (?,?,?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1,plan);
                ps.setString(2,fechafinal);
                ps.setString(3,fecha2);
                ps.executeUpdate();
                conexion.close();
            }catch (SQLException a){
                    a.printStackTrace();
            }
        }else{
            System.out.println("error");
        }
    }



}
