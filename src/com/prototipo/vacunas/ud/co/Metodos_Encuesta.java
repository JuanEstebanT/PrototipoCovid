/*
 Esta clase es para conectar la interfaz de encuesta y la logica y con esta obtener un puntaje el cual
 se utilizara para la obtencion de la priorizacion de la vacuna para la persona
 */

package com.prototipo.vacunas.ud.co;

import javax.swing.*;

public class Metodos_Encuesta {
    /**
     * Atributos
     */
    int Puntos;
    int ultimate_puntos;

    /**
     *  Ver puntos
     * @return ver puntos
     */
    public String Puntaje_total(){
        return "Puntos de riegos totales son: "+Puntos;
    }
    /**
     * Edades es para sacar puntos segun en el rango de edad en la que esta
     * @param boton identifica el Jspinner
     */

    public void Edades(JSpinner boton){
        int comparador;
        comparador = Integer.parseInt(boton.getValue().toString());
        if (comparador == 0 || comparador <= 18 ){
            Puntos+= 1;
        }else if(comparador >= 19 && comparador <= 25){
            Puntos +=2;
        }else if (comparador >= 26 && comparador <= 39){
            Puntos += 3;
        }else if (comparador >= 39 && comparador <= 60){
            Puntos +=4;
        }else if (comparador > 61){
            Puntos +=5;
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
    public void Personas_en_Hogar(JRadioButton boton1,JRadioButton boton2,JRadioButton boton3,JRadioButton boton4){
        if(boton1.isSelected()){
            Puntos += 0;
        }
        if(boton2.isSelected()){
            Puntos += 1;
        }
        if(boton3.isSelected()){
            Puntos += 2;
        }
        if(boton4.isSelected()){
            Puntos += 3;
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
    public void Personas_saliendo(JRadioButton boton1,JRadioButton boton2,JRadioButton boton3,JRadioButton boton4){
        if(boton1.isSelected()){
            Puntos += 1;
        }
        if(boton2.isSelected()){
            Puntos += 2;
        }
        if(boton3.isSelected()){
            Puntos += 3;
        }
        if(boton4.isSelected()){
            Puntos += 5;
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
    public void Enfermedades_Res(JRadioButton boton1,JRadioButton boton2){
        if(boton1.isSelected()){
            Puntos += 5;
        }
        boton1.setEnabled(false);
        boton2.setEnabled(false);
    }

    /**
     *  Reinicia los puntos
     */
    public void reiniciopuntos(){
        Puntos = 0;
    }

    /**
     * ultimos puntos guardados
     * @return
     */
    public int Ultimos_puntos(){
        ultimate_puntos = Puntos;
        return ultimate_puntos;
    }

    /**
     * Localidades Obtiene un puntaje según la localidad escogida debido a que algunas
     * tienen un foco de contagio mayor
     * @param Box LocalidadesBox1
     */
    public void Localidades(JComboBox Box){
        String localidad;
        localidad = Box.getSelectedItem().toString();
        if (localidad == "11-Suba" || localidad == "08-Kennedy" || localidad == "10-Engativá" || localidad == "11-Suba"){
            Puntos +=5;
        }
        if (localidad == "07-Bosa" || localidad == "19-Ciudad Bolívar" || localidad == "09-Fontibón" || localidad == "04-San Cristóbal"){
            Puntos +=4;
        }
        if (localidad == "18-Rafael Uribe Uribe" || localidad == "16-Puente Aranda" || localidad == "02-Chapinero" || localidad == "05-Usme"){
            Puntos +=3;
        }
        if (localidad == "13-Teusaquillo" || localidad == "12-Barrios Unidos" || localidad == "06-Tunjuelito" || localidad == "03-Santa Fe"){
            Puntos +=2;
        }
        if (localidad == "14-Los Mártires" || localidad == "15-Antonio Nariño" || localidad == "17-La Candelaria" || localidad == "20-Sumapaz"|| localidad == "21-Fuera de Bogota"){
            Puntos +=1;
        }
        Box.setEnabled(false);
    }

    /**
     * Trabajador Da un puntaje de riesgo si alguno de la familia es trabajador
     * de la salud
     * @param boton1
     * @param boton2
     */
    public void Trabajador(JRadioButton boton1,JRadioButton boton2){
        if(boton1.isSelected()){
            Puntos += 8;
        }
        boton1.setEnabled(false);
        boton2.setEnabled(false);
    }

    /**
     * Transporte da un puntaje si el individuo usa el transporte publico
     * @param boton1
     * @param boton2
     */
    public void Transporte(JRadioButton boton1,JRadioButton boton2){
        if(boton1.isSelected()){
            Puntos += 8;
        }
        boton1.setEnabled(false);
        boton2.setEnabled(false);
    }

    /**
     * Ropa Da un puntaje si el usuario no desinfecta su ropa al llegar a su casa
     * @param boton1
     * @param boton2
     */
    public void Ropa(JRadioButton boton1,JRadioButton boton2){
        if(boton2.isSelected()){
            Puntos += 3;
        }
        boton1.setEnabled(false);
        boton2.setEnabled(false);
    }

    /**
     * ViajeInt da un puntaje si el usuario realizo un viaje internacional
     * @param boton1
     * @param boton2
     */
    public void ViajeInt(JRadioButton boton1,JRadioButton boton2){
        if(boton1.isSelected()){
            Puntos += 9;
        }
        boton1.setEnabled(false);
        boton2.setEnabled(false);
    }

    /**
     * ViajeNal da un puntaje si el usuario realizo un viaje nacional
     * @param boton1
     * @param boton2
     */
    public void ViajeNal(JRadioButton boton1,JRadioButton boton2){
        if(boton1.isSelected()){
            Puntos += 5;
        }
        boton1.setEnabled(false);
        boton2.setEnabled(false);
    }

    /**
     * Distancia Da un puntaje si no hace caso a mantener distancia social
     * @param boton1
     * @param boton2
     */
    public void Distancia(JRadioButton boton1,JRadioButton boton2){
        if(boton1.isSelected()){
            Puntos += 3;
        }
        if (boton2.isSelected()){
            Puntos += 7;
        }
        boton1.setEnabled(false);
        boton2.setEnabled(false);
    }

    /**
     * Eventos Da puntaje si asistio a eventos sociales ultimamente
     * @param boton1
     * @param boton2
     */
    public void Eventos(JRadioButton boton1,JRadioButton boton2){
        if(boton1.isSelected()){
            Puntos += 8;
        }
        boton1.setEnabled(false);
        boton2.setEnabled(false);
    }

    /**
     * Manos Da puntaje si no se desinfecta las manos seguido
     * @param boton1
     * @param boton2
     */
    public void Manos(JRadioButton boton1,JRadioButton boton2){
        if(boton2.isSelected()){
            Puntos += 8;
        }
        boton1.setEnabled(false);
        boton2.setEnabled(false);
    }

    /**
     * Tapabocas da puntaje depende del material que use el individuo
     * @param boton1
     * @param boton2
     */
    public void Tapabocas(JRadioButton boton1,JRadioButton boton2){
        if(boton1.isSelected()){
            Puntos += 1;
        }
        if (boton2.isSelected()){
            Puntos += 3;
        }
        boton1.setEnabled(false);
        boton2.setEnabled(false);
    }

    /**
     * Contacto Da puntos si tuvo contacto con personas con los sintomas
     * @param boton1
     * @param boton2
     */
    public void Contacto(JRadioButton boton1,JRadioButton boton2){
        if(boton1.isSelected()){
            Puntos += 10;
        }
        boton1.setEnabled(false);
        boton2.setEnabled(false);
    }

    public void LavaManos(JComboBox Box){
        String frecuencia;
        frecuencia = Box.getSelectedItem().toString();
        if (frecuencia == "1. Siempre"){
            Puntos += 1;
        }
        if (frecuencia == "2. Casi siempre"){
            Puntos += 2;
        }
        if (frecuencia == "3. Frecuentemente"){
            Puntos += 3;
        }
        if (frecuencia == "4. De vez en cuando"){
            Puntos += 4;
        }
        if (frecuencia == "5. Nunca"){
            Puntos += 8;
        }
        Box.setEnabled(false);
    }

    public void DesinfectaManos(JComboBox Box){
        String frecuencia;
        frecuencia = Box.getSelectedItem().toString();
        if (frecuencia == "1. Siempre"){
            Puntos += 1;
        }
        if (frecuencia == "2. Casi siempre"){
            Puntos += 2;
        }
        if (frecuencia == "3. Frecuentemente"){
            Puntos += 3;
        }
        if (frecuencia == "4. De vez en cuando"){
            Puntos += 4;
        }
        if (frecuencia == "5. Nunca"){
            Puntos += 8;
        }
        Box.setEnabled(false);
    }

    public void ObjetosLimpios(JComboBox Box){
        String frecuencia;
        frecuencia = Box.getSelectedItem().toString();
        if (frecuencia == "1. Siempre"){
            Puntos += 2;
        }
        if (frecuencia == "2. Casi siempre"){
            Puntos += 2;
        }
        if (frecuencia == "3. Frecuentemente"){
            Puntos += 3;
        }
        if (frecuencia == "4. De vez en cuando"){
            Puntos += 4;
        }
        if (frecuencia == "5. Nunca"){
            Puntos += 8;
        }
        Box.setEnabled(false);
    }

    public void LavaTapabocas(JComboBox Box){
        String frecuencia;
        frecuencia = Box.getSelectedItem().toString();
        if (frecuencia == "1. Siempre"){
            Puntos += 2;
        }
        if (frecuencia == "2. Casi siempre"){
            Puntos += 2;
        }
        if (frecuencia == "3. Frecuentemente"){
            Puntos += 3;
        }
        if (frecuencia == "4. De vez en cuando"){
            Puntos += 4;
        }
        if (frecuencia == "5. Nunca"){
            Puntos += 8;
        }
        Box.setEnabled(false);
    }

    public void Enfermedades(JCheckBox fiebre,JCheckBox tos,JCheckBox garganta
            ,JCheckBox congestion,JCheckBox fatiga,JCheckBox respirar,JCheckBox frio,
                             JCheckBox musculos,JCheckBox ninguna){
        if (fiebre.isSelected()){
            Puntos += 9;
        }
        if (garganta.isSelected()){
            Puntos += 8;
        }
        if (congestion.isSelected()){
            Puntos += 6;
        }
        if (tos.isSelected()){
            Puntos += 2;
        }if (respirar.isSelected()){
            Puntos += 5;
        }
        if (fatiga.isSelected()){
            Puntos += 1;
        }
        if (frio.isSelected()){
            Puntos += 3;
        }
        if (musculos.isSelected()){
            Puntos += 2;
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
}
