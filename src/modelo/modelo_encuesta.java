package modelo;

import javax.swing.*;

public class modelo_encuesta {
    /**
     * Atributos
     */
    static personas per = new personas();

    /**
     * Edades es para sacar puntos segun en el rango de edad en la que esta
     * @param boton identifica el Jspinner
     */

    public static void Edades(JSpinner boton){
        int comparador;
        comparador = Integer.parseInt(boton.getValue().toString());
        if (comparador == 0 || comparador <= 18 ){
            per.sumarpuntaje(1);
        }else if(comparador >= 19 && comparador <= 25){
            per.sumarpuntaje(2);
        }else if (comparador >= 26 && comparador <= 39){
            per.sumarpuntaje(3);
        }else if (comparador >= 39 && comparador <= 60){
            per.sumarpuntaje(4);
        }else if (comparador > 61){
            per.sumarpuntaje(5);
        }
        boton.setEnabled(false);
    }

    /**
     *  Personas en horgar es para sumar puntos segun cuantas personas vivan con el individuo
     * @param boton1 PersonasButton1
     * @param boton2 Persona_1Button2
     * @param boton3 Personas_2Button3
     * @param boton4 Personas_3Button4
     */
    public static void Personas_en_Hogar(JRadioButton boton1, JRadioButton boton2, JRadioButton boton3, JRadioButton boton4){
        if(boton1.isSelected()){
            per.sumarpuntaje(0);
        }
        if(boton2.isSelected()){
            per.sumarpuntaje(1);
        }
        if(boton3.isSelected()){
            per.sumarpuntaje(2);
        }
        if(boton4.isSelected()){
            per.sumarpuntaje(3);
        }
        boton1.setEnabled(false);
        boton2.setEnabled(false);
        boton3.setEnabled(false);
        boton4.setEnabled(false);
    }

    /**
     * Personas_saliendo es para calcular puntanje segun personas que tengan que salir de la casa del individuo
     * @param boton1 SalirButton1
     * @param boton2 SalirButton1
     * @param boton3 SalirButton1
     * @param boton4 SalirButton1
     */
    public static void Personas_saliendo(JRadioButton boton1, JRadioButton boton2, JRadioButton boton3, JRadioButton boton4){
        if(boton1.isSelected()){
            per.sumarpuntaje(1);
        }
        if(boton2.isSelected()){
            per.sumarpuntaje(2);
        }
        if(boton3.isSelected()){
            per.sumarpuntaje(3);
        }
        if(boton4.isSelected()){
            per.sumarpuntaje(5);
        }
        boton1.setEnabled(false);
        boton2.setEnabled(false);
        boton3.setEnabled(false);
        boton4.setEnabled(false);
    }
    /**
     * Enfermedades_Res dar puntaje de riesgo si sufre de enfermedades respiratorias
     * @param boton1 EnfermedadButton1
     * @param boton2 EnfermedadButton2
     */
    public static void Enfermedades_Res(JRadioButton boton1, JRadioButton boton2){
        if(boton1.isSelected()){
            per.sumarpuntaje(5);
        }
        boton1.setEnabled(false);
        boton2.setEnabled(false);
    }

    /**
     * Localidades Obtiene un puntaje según la localidad escogida debido a que algunas
     * tienen un foco de contagio mayor
     * @param Box LocalidadesBox1
     */
    public static void Localidades(JComboBox Box){
        String localidad;
        localidad = Box.getSelectedItem().toString();
        if (localidad == "11-Suba" || localidad == "08-Kennedy" || localidad == "10-Engativá" || localidad == "11-Suba"){
            per.sumarpuntaje(5);
        }
        if (localidad == "07-Bosa" || localidad == "19-Ciudad Bolívar" || localidad == "09-Fontibón" || localidad == "04-San Cristóbal"){
            per.sumarpuntaje(4);
        }
        if (localidad == "18-Rafael Uribe Uribe" || localidad == "16-Puente Aranda" || localidad == "02-Chapinero" || localidad == "05-Usme"){
            per.sumarpuntaje(3);
        }
        if (localidad == "13-Teusaquillo" || localidad == "12-Barrios Unidos" || localidad == "06-Tunjuelito" || localidad == "03-Santa Fe"){
            per.sumarpuntaje(2);
        }
        if (localidad == "14-Los Mártires" || localidad == "15-Antonio Nariño" || localidad == "17-La Candelaria" || localidad == "20-Sumapaz"|| localidad == "21-Fuera de Bogota"){
            per.sumarpuntaje(1);
        }
        Box.setEnabled(false);
    }

    /**
     * Trabajador Da un puntaje de riesgo si alguno de la familia es trabajador
     * de la salud
     * @param boton1
     * @param boton2
     */
    public static void Trabajador(JRadioButton boton1, JRadioButton boton2){
        if(boton1.isSelected()){
            per.sumarpuntaje(8);
        }
        boton1.setEnabled(false);
        boton2.setEnabled(false);
    }

    /**
     * Transporte da un puntaje si el individuo usa el transporte publico
     * @param boton1
     * @param boton2
     */
    public static void Transporte(JRadioButton boton1, JRadioButton boton2){
        if(boton1.isSelected()){
            per.sumarpuntaje(8);
        }
        boton1.setEnabled(false);
        boton2.setEnabled(false);
    }

    /**
     * Ropa Da un puntaje si el usuario no desinfecta su ropa al llegar a su casa
     * @param boton1
     * @param boton2
     */
    public static void Ropa(JRadioButton boton1, JRadioButton boton2){
        if(boton2.isSelected()){
            per.sumarpuntaje(3);
        }
        boton1.setEnabled(false);
        boton2.setEnabled(false);
    }

    /**
     * ViajeInt da un puntaje si el usuario realizo un viaje internacional
     * @param boton1
     * @param boton2
     */
    public static void ViajeInt(JRadioButton boton1, JRadioButton boton2){
        if(boton1.isSelected()){
            per.sumarpuntaje(9);
        }
        boton1.setEnabled(false);
        boton2.setEnabled(false);
    }

    /**
     * ViajeNal da un puntaje si el usuario realizo un viaje nacional
     * @param boton1
     * @param boton2
     */
    public static void ViajeNal(JRadioButton boton1, JRadioButton boton2){
        if(boton1.isSelected()){
            per.sumarpuntaje(5);
        }
        boton1.setEnabled(false);
        boton2.setEnabled(false);
    }

    /**
     * Distancia Da un puntaje si no hace caso a mantener distancia social
     * @param boton1
     * @param boton2
     */
    public static void Distancia(JRadioButton boton1, JRadioButton boton2){
        if(boton1.isSelected()){
            per.sumarpuntaje(3);
        }
        if (boton2.isSelected()){
            per.sumarpuntaje(7);
        }
        boton1.setEnabled(false);
        boton2.setEnabled(false);
    }

    /**
     * Eventos Da puntaje si asistio a eventos sociales ultimamente
     * @param boton1
     * @param boton2
     */
    public static void Eventos(JRadioButton boton1, JRadioButton boton2){
        if(boton1.isSelected()){
            per.sumarpuntaje(8);
        }
        boton1.setEnabled(false);
        boton2.setEnabled(false);
    }

    /**
     * Manos Da puntaje si no se desinfecta las manos seguido
     * @param boton1
     * @param boton2
     */
    public static void Manos(JRadioButton boton1, JRadioButton boton2){
        if(boton2.isSelected()){
            per.sumarpuntaje(8);
        }
        boton1.setEnabled(false);
        boton2.setEnabled(false);
    }

    /**
     * Tapabocas da puntaje depende del material que use el individuo
     * @param boton1
     * @param boton2
     */
    public static void Tapabocas(JRadioButton boton1, JRadioButton boton2){
        if(boton1.isSelected()){
            per.sumarpuntaje(1);
        }
        if (boton2.isSelected()){
            per.sumarpuntaje(3);
        }
        boton1.setEnabled(false);
        boton2.setEnabled(false);
    }

    /**
     * Contacto Da puntos si tuvo contacto con personas con los sintomas
     * @param boton1
     * @param boton2
     */
    public static void Contacto(JRadioButton boton1, JRadioButton boton2){
        if(boton1.isSelected()){
            per.sumarpuntaje(10);
        }
        boton1.setEnabled(false);
        boton2.setEnabled(false);
    }

    /**
     * Da puntaje si no se lava las manos con frecuencia
     * @param Box
     */
    public static void LavaManos(JComboBox Box){
        String frecuencia;
        frecuencia = Box.getSelectedItem().toString();
        if (frecuencia == "1. Siempre"){
            per.sumarpuntaje(1);
        }
        if (frecuencia == "2. Casi siempre"){
            per.sumarpuntaje(2);
        }
        if (frecuencia == "3. Frecuentemente"){
            per.sumarpuntaje(3);
        }
        if (frecuencia == "4. De vez en cuando"){
            per.sumarpuntaje(4);
        }
        if (frecuencia == "5. Nunca"){
            per.sumarpuntaje(8);
        }
        Box.setEnabled(false);
    }

    /**
     * Da puntos si no se desinfecta las manos
     * @param Box
     */
    public static void DesinfectaManos(JComboBox Box){
        String frecuencia;
        frecuencia = Box.getSelectedItem().toString();
        if (frecuencia == "1. Siempre"){
            per.sumarpuntaje(1);
        }
        if (frecuencia == "2. Casi siempre"){
            per.sumarpuntaje(2);
        }
        if (frecuencia == "3. Frecuentemente"){
            per.sumarpuntaje(3);
        }
        if (frecuencia == "4. De vez en cuando"){
            per.sumarpuntaje(4);
        }
        if (frecuencia == "5. Nunca"){
            per.sumarpuntaje(8);
        }
        Box.setEnabled(false);
    }

    /**
     * si no limpia sus objetos (desinfecta) obtiene puntos
     * @param Box
     */
    public static void ObjetosLimpios(JComboBox Box){
        String frecuencia;
        frecuencia = Box.getSelectedItem().toString();
        if (frecuencia == "1. Siempre"){
            per.sumarpuntaje(1);
        }
        if (frecuencia == "2. Casi siempre"){
            per.sumarpuntaje(2);
        }
        if (frecuencia == "3. Frecuentemente"){
            per.sumarpuntaje(3);
        }
        if (frecuencia == "4. De vez en cuando"){
            per.sumarpuntaje(4);
        }
        if (frecuencia == "5. Nunca"){
            per.sumarpuntaje(8);
        }
        Box.setEnabled(false);
    }

    /**
     * Da puntaje si no lava el tapabocas
     * @param Box
     */
    public static void LavaTapabocas(JComboBox Box){
        String frecuencia;
        frecuencia = Box.getSelectedItem().toString();
        if (frecuencia == "1. Siempre"){
            per.sumarpuntaje(1);
        }
        if (frecuencia == "2. Casi siempre"){
            per.sumarpuntaje(2);
        }
        if (frecuencia == "3. Frecuentemente"){
            per.sumarpuntaje(3);
        }
        if (frecuencia == "4. De vez en cuando"){
            per.sumarpuntaje(4);
        }
        if (frecuencia == "5. Nunca"){
            per.sumarpuntaje(8);
        }
        Box.setEnabled(false);
    }

    /**
     * Da puntos segun los sintomas seleccionados
     * @param fiebre
     * @param tos
     * @param garganta
     * @param congestion
     * @param fatiga
     * @param respirar
     * @param frio
     * @param musculos
     * @param ninguna
     */
    public static void Enfermedades(JCheckBox fiebre, JCheckBox tos, JCheckBox garganta
            , JCheckBox congestion, JCheckBox fatiga, JCheckBox respirar, JCheckBox frio,
                                    JCheckBox musculos, JCheckBox ninguna){
        if (fiebre.isSelected()){
            per.sumarpuntaje(9);
        }
        if (garganta.isSelected()){
            per.sumarpuntaje(8);
        }
        if (congestion.isSelected()){
            per.sumarpuntaje(7);
        }
        if (tos.isSelected()){
            per.sumarpuntaje(2);
        }if (respirar.isSelected()){
            per.sumarpuntaje(5);
        }
        if (fatiga.isSelected()){
            per.sumarpuntaje(1);
        }
        if (frio.isSelected()){
            per.sumarpuntaje(3);
        }
        if (musculos.isSelected()){
            per.sumarpuntaje(2);
        }
        if (ninguna.isSelected()){
            fiebre.setEnabled(false);
            frio.setEnabled(false);
            congestion.setEnabled(false);
            musculos.setEnabled(false);
            tos.setEnabled(false);
            garganta.setEnabled(false);
            fatiga.setEnabled(false);
            respirar.setEnabled(false);
        }
        fiebre.setEnabled(false);
        frio.setEnabled(false);
        congestion.setEnabled(false);
        musculos.setEnabled(false);
        tos.setEnabled(false);
        garganta.setEnabled(false);
        fatiga.setEnabled(false);
        respirar.setEnabled(false);
        ninguna.setEnabled(false);
    }
    public static void getPuntos(){
        JOptionPane.showMessageDialog(null,"Puntaje : "+per.getPuntaje());
    }
}

