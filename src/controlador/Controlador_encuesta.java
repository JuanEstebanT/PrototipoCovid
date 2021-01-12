package controlador;

import modelo.modelo_encuesta;
import vista.Registro_Estudiante;
import vista.Registro_Funcionario;
import vista.Ventana_Encuesta;
import vista.Ventana_Inicial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador_encuesta implements ActionListener {
    private Ventana_Encuesta vista_enc;
    private modelo_encuesta modelo_enc;
    private Ventana_Inicial ventana_inicial;
    public Controlador_encuesta(Ventana_Encuesta vista_enc, modelo_encuesta modelo_enc,Ventana_Inicial ventana_inicial){
        this.vista_enc = vista_enc;
        this.modelo_enc = modelo_enc;
        this.ventana_inicial = ventana_inicial;
        this.vista_enc.siguienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo_encuesta.Personas_en_Hogar(vista_enc.PersonasButton1,vista_enc.Persona_1Button2,vista_enc.Personas_2Button3,vista_enc.Personas_3Button4);
                modelo_encuesta.Personas_saliendo(vista_enc.SalirButton1,vista_enc.SalirButton2,vista_enc.SalirButton3,vista_enc.SalirButton4);
                modelo_encuesta.Enfermedades_Res(vista_enc.EnfermedadButton1,vista_enc.EnfermedadButton2);
                modelo_encuesta.Localidades(vista_enc.LocalidadesBox1);
                modelo_encuesta.Contacto(vista_enc.ContactoButton1,vista_enc.ContactoButton2);
                modelo_encuesta.Distancia(vista_enc.DistanciaButton1,vista_enc.DistanciaButton2);
                modelo_encuesta.Edades(vista_enc.spinner1);
                modelo_encuesta.Eventos(vista_enc.EventosButton1,vista_enc.EventosButton2);
                modelo_encuesta.Manos(vista_enc.ManosButton1,vista_enc.ManosButton2);
                modelo_encuesta.Ropa(vista_enc.RopaButton1,vista_enc.RopaButton2);
                modelo_encuesta.Tapabocas(vista_enc.desechableButton,vista_enc.reutilizableButton);
                modelo_encuesta.Trabajador(vista_enc.TrabajadorButton1,vista_enc.TrabajadorButton2);
                modelo_encuesta.ViajeInt(vista_enc.ViajeIntButton1,vista_enc.ViajeIntButton2);
                modelo_encuesta.ViajeNal(vista_enc.ViajeNalButton1,vista_enc.ViajeNalButton2);
                modelo_encuesta.Transporte(vista_enc.TransporteButton1,vista_enc.TransporteButton2);
                modelo_encuesta.DesinfectaManos(vista_enc.DesinfectaBox);
                modelo_encuesta.LavaManos(vista_enc.LavaManoBox);
                modelo_encuesta.LavaTapabocas(vista_enc.LavaTapabocasBox);
                modelo_encuesta.ObjetosLimpios(vista_enc.ObjetosLimpiosBox);
                modelo_encuesta.Enfermedades(vista_enc.fiebreCheckBox,vista_enc.tosCheckBox,vista_enc.dolorDeGargantaCheckBox,vista_enc.congestionCheckBox
                        ,vista_enc.fatigaCheckBox,vista_enc.dificultadParaRespirarCheckBox,vista_enc.escalofrioCheckBox,vista_enc.dolorDeMusculosCheckBox,vista_enc.ningunaDeLasAnterioresCheckBox);
                modelo_encuesta.getPuntos();
                if(ventana_inicial.isTipo_cargo() == true){
                    Registro_Estudiante estudiante = new Registro_Estudiante();
                    estudiante.setVisible(true);
                    vista_enc.dispose();
                }
                if(ventana_inicial.isTipo_cargo() == false){
                    Registro_Funcionario funcionario = new Registro_Funcionario();
                    funcionario.setVisible(true);
                    vista_enc.dispose();
                }
            }
        });

    }
    public void iniciar(){
        vista_enc.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {

    }
}
