package controlador;

import modelo.*;
import vista.*;

import javax.swing.*;

public class Controlador_prin{

    public Controlador_prin(modelo_principal modelo_prin,Ventana_Inicial view_prin,personas per){

        //Agrega la cantidad de vacunas
        view_prin.agregarVacunasButton.addActionListener(e -> {
            modelo_prin.add_vacunas(Integer.parseInt(view_prin.agg_vacunas.getValue().toString()));
            modelo_prin.actualizaranucio(view_prin.label_vacunas);
        });

        //Quita una cantidad de vacunas, no se puede eliminar una cantidad de vacunas mayor de la que hay
        view_prin.quitarVacunasButton.addActionListener(e -> {
            modelo_prin.remove_vacunas(Integer.parseInt(view_prin.remove_vac.getValue().toString()));
            modelo_prin.actualizaranucio(view_prin.label_vacunas);
        });

        //Activa el boton de registrar estudiante y abre la ventana correspondiente
        view_prin.Regist_estButton.addActionListener(e -> {
            modelo_encuesta obj = new modelo_encuesta();
            Ventana_Encuesta view_Ventana_encuesta = new Ventana_Encuesta();
            new Controlador_encuesta(view_Ventana_encuesta,obj,per,view_prin);
            view_prin.dispose();
            view_prin.setTipo_cargo(true);
        });

        //Activa el boton de registrar funcionario y abre su ventana correspondiente
        view_prin.registroFuncionariosButton.addActionListener(e -> {
            modelo_encuesta obj = new modelo_encuesta();
            Ventana_Encuesta view_Ventana_encuesta = new Ventana_Encuesta();
            new Controlador_encuesta(view_Ventana_encuesta,obj,per,view_prin);
            view_prin.dispose();
            view_prin.setTipo_cargo(false);
        });

        //Activa el boton de lista de registrados
        view_prin.listaDeRegistradosButton.addActionListener(e -> {
            modelo_listados model = new modelo_listados();
            Ventana_listados view = new Ventana_listados();
            new Controlador_listados(model,view,per,view_prin);
            view_prin.dispose();
        });

        //Activa el boton de vacunar
        view_prin.VacunarButton.addActionListener(e -> {
            Modelo_vacunar model = new Modelo_vacunar();
            Vista_vacunar vista = new Vista_vacunar();
            new Controlador_vacunar(model,vista,view_prin);
            view_prin.dispose();
        });

        view_prin.Plan_button.addActionListener(e -> {
            int seleccion = JOptionPane.showOptionDialog(
                    null,
                    "¿ Que desea hacer ?",
                    "JDJ Covidapp",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,    // null para icono por defecto.
                    new Object[] { "Crear plan de vacunación", "Ver planes de vacunación", "Cancelar" },"Cancelar");
            if(seleccion == 0){
                JOptionPane.showMessageDialog(null,"Está usted conciente de que al aplicar la primera vacuna se debe garantizar la aplicación del refuerzo unicamente," +
                        "\n 15 dias posteriores a la primera vacuna, no se podrá aplazar o modificar la segunda fecha, por ende" +
                        "\n se compromete a asistir obligatoriamente a los 15 dias de la primera aplicada posterior a estas " +
                        "\n debe estar en alerta de sus reacciones y en caso de efectos secundarios vaya a su medico mas cercano ","JDJ Covidapp",JOptionPane.INFORMATION_MESSAGE);
                Ventana_crearPlan view = new Ventana_crearPlan();
                modelo_planVac model = new modelo_planVac();
                new Controlador_Plan_vacunas(view,model,view_prin);
            }else if(seleccion == 1){
                Ventana_Planes view = new Ventana_Planes();
                modelo_planes model = new modelo_planes();
                Controlador_planes ctrl = new Controlador_planes(view,model,view_prin);
                view_prin.dispose();
            }else if(seleccion == 2){

            }

        });
    }
}