package modelo;

import javax.swing.*;
import java.util.Objects;

public class modelo_encuesta {

    /**
     * Atributos
     */
    personas per;

    /**
     * Edades es para sacar puntos segun en el rango de edad en la que esta
     * @param boton identifica el Jspinner
     */
    public void Edades(JSpinner boton,personas per){
        int comparador;
        this.per = per;
        comparador = Integer.parseInt(boton.getValue().toString());
        if (comparador <= 18){
            per.sumarpuntaje(1);
        }else if(comparador <= 25){
            per.sumarpuntaje(2);
        }else if (comparador <= 39){
            per.sumarpuntaje(3);
        }else if (comparador <= 60){
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
    public void Personas_en_Hogar(JRadioButton boton1, JRadioButton boton2, JRadioButton boton3, JRadioButton boton4,personas per){
        this.per = per;
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
    public void Personas_saliendo(JRadioButton boton1, JRadioButton boton2, JRadioButton boton3, JRadioButton boton4,personas per){
        this.per = per;
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
    public void Enfermedades_Res(JRadioButton boton1, JRadioButton boton2,personas per){
        this.per = per;
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
    public void Localidades(JComboBox Box,personas per){
        this.per = per;
        String localidad;
        localidad = Objects.requireNonNull(Box.getSelectedItem()).toString();
        if (localidad.equals("11-Suba") || localidad.equals("08-Kennedy") || localidad.equals("10-Engativá")){
            per.sumarpuntaje(5);
        }
        if (localidad.equals("07-Bosa") || localidad.equals("19-Ciudad Bolívar") || localidad.equals("09-Fontibón") || localidad.equals("04-San Cristóbal")){
            per.sumarpuntaje(4);
        }
        if (localidad.equals("18-Rafael Uribe Uribe") || localidad.equals("16-Puente Aranda") || localidad.equals("02-Chapinero") || localidad.equals("05-Usme")){
            per.sumarpuntaje(3);
        }
        if (localidad.equals("13-Teusaquillo") || localidad.equals("12-Barrios Unidos") || localidad.equals("06-Tunjuelito") || localidad.equals("03-Santa Fe")){
            per.sumarpuntaje(2);
        }
        if (localidad.equals("14-Los Mártires") || localidad.equals("15-Antonio Nariño") || localidad.equals("17-La Candelaria") || localidad.equals("20-Sumapaz") || localidad.equals("21-Fuera de Bogota")){
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
    public void Trabajador(JRadioButton boton1, JRadioButton boton2,personas per){
        this.per = per;
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
    public void Transporte(JRadioButton boton1, JRadioButton boton2,personas per){
        this.per = per;
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
    public void Ropa(JRadioButton boton1, JRadioButton boton2,personas per){
        this.per = per;
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
    public void ViajeInt(JRadioButton boton1, JRadioButton boton2,personas per){
        this.per = per;
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
    public void ViajeNal(JRadioButton boton1, JRadioButton boton2,personas per){
        this.per = per;
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
    public void Distancia(JRadioButton boton1, JRadioButton boton2,personas per){
        this.per = per;
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
    public void Eventos(JRadioButton boton1, JRadioButton boton2,personas per){
        this.per = per;
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
    public void Manos(JRadioButton boton1, JRadioButton boton2,personas per){
        this.per = per;
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
    public void Tapabocas(JRadioButton boton1, JRadioButton boton2,personas per){
        this.per = per;
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
    public void Contacto(JRadioButton boton1, JRadioButton boton2,personas per){
        this.per = per;
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
    public void LavaManos(JComboBox Box,personas per){
        this.per = per;
        String frecuencia;
        frecuencia = Objects.requireNonNull(Box.getSelectedItem()).toString();
        if (frecuencia.equals("1. Cada 20 minutos")){
            per.sumarpuntaje(1);
        }
        if (frecuencia.equals("2. 10 veces al dia")){
            per.sumarpuntaje(2);
        }
        if (frecuencia.equals("3. 5 veces al dia")){
            per.sumarpuntaje(3);
        }
        if (frecuencia.equals("4. 3 veces al dia")){
            per.sumarpuntaje(4);
        }
        if (frecuencia.equals("5. 1 vez al dia")){
            per.sumarpuntaje(8);
        }
        Box.setEnabled(false);
    }

    /**
     * Da puntos si no se desinfecta las manos
     * @param Box
     */
    public void DesinfectaManos(JComboBox Box,personas per){
        this.per = per;
        String frecuencia;
        frecuencia = Objects.requireNonNull(Box.getSelectedItem()).toString();
        if (frecuencia.equals("1. Cada 20 minutos")){
            per.sumarpuntaje(1);
        }
        if (frecuencia.equals("2. 10 veces al dia")){
            per.sumarpuntaje(2);
        }
        if (frecuencia.equals("3. 5 veces al dia")){
            per.sumarpuntaje(3);
        }
        if (frecuencia.equals("4. 3 veces al dia")){
            per.sumarpuntaje(4);
        }
        if (frecuencia.equals("5. 1 vez al dia")){
            per.sumarpuntaje(8);
        }
        Box.setEnabled(false);
    }

    /**
     * si no limpia sus objetos (desinfecta) obtiene puntos
     * @param Box
     */
    public void ObjetosLimpios(JComboBox Box,personas per){
        this.per = per;
        String frecuencia;
        frecuencia = Objects.requireNonNull(Box.getSelectedItem()).toString();
        if (frecuencia.equals("1. Cada 20 minutos")){
            per.sumarpuntaje(1);
        }
        if (frecuencia.equals("2. 10 veces al dia")){
            per.sumarpuntaje(2);
        }
        if (frecuencia.equals("3. 5 veces al dia")){
            per.sumarpuntaje(3);
        }
        if (frecuencia.equals("4. 3 veces al dia")){
            per.sumarpuntaje(4);
        }
        if (frecuencia.equals("5. 1 vez al dia")){
            per.sumarpuntaje(8);
        }
        Box.setEnabled(false);
    }

    /**
     * Da puntaje si no lava el tapabocas
     * @param Box
     */
    public void LavaTapabocas(JComboBox Box,personas per){
        this.per = per;
        String frecuencia;
        frecuencia = Objects.requireNonNull(Box.getSelectedItem()).toString();
        if (frecuencia.equals(" 1. Todos los dias")){
            per.sumarpuntaje(1);
        }
        if (frecuencia.equals("2. Dia de pormedio")){
            per.sumarpuntaje(2);
        }
        if (frecuencia.equals("3. 3 veces a la semana")){
            per.sumarpuntaje(3);
        }
        if (frecuencia.equals("4. 1 vez a la semana")){
            per.sumarpuntaje(4);
        }
        if (frecuencia.equals(" 5. 1 vez cada 15 dias")){
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
    public void Enfermedades(JCheckBox fiebre, JCheckBox tos, JCheckBox garganta
            , JCheckBox congestion, JCheckBox fatiga, JCheckBox respirar, JCheckBox frio,
                                    JCheckBox musculos, JCheckBox ninguna,personas per){
        this.per = per;
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

    /**
     * Temperatura da puntos según la temperatura que registre la persona
     * @param temp
     * @param per
     */
    public void Temperarura(JTextField temp,personas per){
        this.per = per;
        float Grados = Integer.parseInt(temp.getText().trim());
        if(Grados < 37){
           per.sumarpuntaje(1);
        }else if (Grados>37.1){
            per.sumarpuntaje(5);
        }
    }

    public void getPuntos(){
        JOptionPane.showMessageDialog(null,"Puntaje : "+per.getPuntaje());
    }
}

