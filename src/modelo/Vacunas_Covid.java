package modelo;

public class Vacunas_Covid {
    private int Vacunas_totales = 0;
    private int Vacunas_a_sumar= 0;
    public int getVacunas_totales() {
        return Vacunas_totales;
    }

    public void setVacunas_totales(int vacunas_totales) {
        Vacunas_totales = vacunas_totales;

    }
    public void sumarVacunas(int Cantidad_vacunas ){
        this.Vacunas_a_sumar = Cantidad_vacunas;
        this.Vacunas_totales += this.Vacunas_a_sumar;
    }

    public void restarVacunas(int Cantidad_vacunas ){
        this.Vacunas_a_sumar = Cantidad_vacunas;
        this.Vacunas_totales -= this.Vacunas_a_sumar;
    }
}
