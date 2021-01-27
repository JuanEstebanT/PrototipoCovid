package controlador;

import modelo.modelo_encuesta;
import modelo.modelo_estudiante;
import modelo.modelo_funcionario;
import modelo.personas;
import vista.Registro_Estudiante;
import vista.Registro_Funcionario;
import vista.Ventana_Encuesta;
import vista.Ventana_Inicial;

/**
 * Se ejecutan los metodos de la encuesta para sacar un determinado puntaje
 */

public class Controlador_encuesta{

    public Controlador_encuesta(Ventana_Encuesta vista_enc, modelo_encuesta modelo_enc,personas per,Ventana_Inicial ventana_in){
        vista_enc.siguienteButton.addActionListener(e -> {
            modelo_enc.Personas_en_Hogar(vista_enc.PersonasButton1,vista_enc.Persona_1Button2,vista_enc.Personas_2Button3,vista_enc.Personas_3Button4,per);
            modelo_enc.Personas_saliendo(vista_enc.SalirButton1,vista_enc.SalirButton2,vista_enc.SalirButton3,vista_enc.SalirButton4,per);
            modelo_enc.Enfermedades_Res(vista_enc.EnfermedadButton1,vista_enc.EnfermedadButton2,per);
            modelo_enc.Localidades(vista_enc.LocalidadesBox1,per);
            modelo_enc.Contacto(vista_enc.ContactoButton1,vista_enc.ContactoButton2,per);
            modelo_enc.Distancia(vista_enc.DistanciaButton1,vista_enc.DistanciaButton2,per);
            modelo_enc.Edades(vista_enc.spinner1,per);
            modelo_enc.Eventos(vista_enc.EventosButton1,vista_enc.EventosButton2,per);
            modelo_enc.Manos(vista_enc.ManosButton1,vista_enc.ManosButton2,per);
            modelo_enc.Ropa(vista_enc.RopaButton1,vista_enc.RopaButton2,per);
            modelo_enc.Tapabocas(vista_enc.desechableButton,vista_enc.reutilizableButton,per);
            modelo_enc.Trabajador(vista_enc.TrabajadorButton1,vista_enc.TrabajadorButton2,per);
            modelo_enc.ViajeInt(vista_enc.ViajeIntButton1,vista_enc.ViajeIntButton2,per);
            modelo_enc.ViajeNal(vista_enc.ViajeNalButton1,vista_enc.ViajeNalButton2,per);
            modelo_enc.Transporte(vista_enc.TransporteButton1,vista_enc.TransporteButton2,per);
            modelo_enc.DesinfectaManos(vista_enc.DesinfectaBox,per);
            modelo_enc.LavaManos(vista_enc.LavaManoBox,per);
            modelo_enc.LavaTapabocas(vista_enc.LavaTapabocasBox,per);
            modelo_enc.ObjetosLimpios(vista_enc.ObjetosLimpiosBox,per);
            modelo_enc.Enfermedades(vista_enc.fiebreCheckBox,vista_enc.tosCheckBox,vista_enc.dolorDeGargantaCheckBox,vista_enc.congestionCheckBox
                    ,vista_enc.fatigaCheckBox,vista_enc.dificultadParaRespirarCheckBox,vista_enc.escalofrioCheckBox,vista_enc.dolorDeMusculosCheckBox,vista_enc.ningunaDeLasAnterioresCheckBox,per);
            modelo_enc.Temperarura(vista_enc.txt_temperatura,per);
            modelo_enc.getPuntos();

            //En los siguientes if, se identifica si es un registro para estudiante o funcionario y se abre la ventana correspondiente
            if(ventana_in.isTipo_cargo()){
                Registro_Estudiante estudiante = new Registro_Estudiante();
                modelo_estudiante model = new modelo_estudiante();
                new Controlador_estudiante(estudiante,model,per,ventana_in);
                estudiante.setVisible(true);
                vista_enc.dispose();
            }
            if(!ventana_in.isTipo_cargo()){
                Registro_Funcionario funcionario = new Registro_Funcionario();
                modelo_funcionario model = new modelo_funcionario();
                new Controlador_funcionario(per,model,funcionario,ventana_in);
                funcionario.setVisible(true);
                vista_enc.dispose();
            }
        });
    }
}