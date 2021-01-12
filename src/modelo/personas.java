package modelo;

public class personas {
    private String nombre;
    private String codigo;
    private char genero;
    private String correo;
    private String facultad;
    private String cargo;
    private int puntaje;
    private int puntajeSum;
    private int resultado;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getPuntajeSum() {
        return puntajeSum;
    }

    public void setPuntajeSum(int puntajeSum) {
        this.puntajeSum = puntajeSum;
    }

    public void sumarpuntaje(int puntajeSum){
        this.puntajeSum = puntajeSum;
        this.puntaje += this.puntajeSum;
    }
    public void resetPuntaje(){
        this.puntaje = 0;
    }
}
