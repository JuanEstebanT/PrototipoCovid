package modelo;

import vista.Ventana_Inicial;

public class modelo_principal {
    Ventana_Inicial ven = new Ventana_Inicial();
    Vacunas_Covid vacunas_covid = new Vacunas_Covid();
    public void add_vacunas(int CantidadAgregar){
        vacunas_covid.sumarVacunas(CantidadAgregar);
    }
    public void remove_vacunas(int CantidadesAgregar){
        vacunas_covid.restarVacunas(CantidadesAgregar);
    }

}
