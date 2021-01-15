package controlador;

import modelo.modelo_encuesta;
import modelo.modelo_estudiante;
import modelo.modelo_funcionario;
import modelo.personas;
import vista.Registro_Estudiante;
import vista.Registro_Funcionario;
import vista.Ventana_Encuesta;
import vista.Ventana_Inicial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador_encuesta{
    private Ventana_Encuesta vista_enc;
    private modelo_encuesta modelo_enc;
    private personas per;
    private Ventana_Inicial ventana_in;
    public Controlador_encuesta(Ventana_Encuesta vista_enc, modelo_encuesta modelo_enc,personas per,Ventana_Inicial ventana_in){
        this.vista_enc = vista_enc;
        this.modelo_enc = modelo_enc;
        this.per = per;
        this.ventana_in = ventana_in;
        this.vista_enc.siguienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                modelo_enc.getPuntos();
                if(ventana_in.isTipo_cargo() == true){
                    Registro_Estudiante estudiante = new Registro_Estudiante();
                    modelo_estudiante model = new modelo_estudiante();
                    Controlador_estudiante crtl = new Controlador_estudiante(estudiante,model,per,ventana_in);

                    estudiante.setVisible(true);
                    vista_enc.dispose();
                }
                if(ventana_in.isTipo_cargo() == false){
                    Registro_Funcionario funcionario = new Registro_Funcionario();
                    modelo_funcionario model = new modelo_funcionario();
                    Controlador_funcionario crtl = new Controlador_funcionario(per,model,funcionario,ventana_in);
                    funcionario.setVisible(true);
                    vista_enc.dispose();
                }
            }
        });

    }
    public void iniciar(){
        vista_enc.setVisible(true);
    }

}
