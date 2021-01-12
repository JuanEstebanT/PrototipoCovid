package modelo;

import vista.Ventana_Inicial;

public class modelo_principal {

    Vacunas_Covid vacunas_covid = new Vacunas_Covid();
    private String nuevo;

    public void add_vacunas(int CantidadAgregar){
        vacunas_covid.sumarVacunas(CantidadAgregar);
        nuevo = "Cantidad de vacunas es: "+vacunas_covid.getVacunas_totales();
    }
    public void remove_vacunas(int CantidadesAgregar){
        vacunas_covid.restarVacunas(CantidadesAgregar);
    }

    public String actualizaranucio (){
        return nuevo;
    }


}
