package controlador;

import Main.conector;
import modelo.modelo_planVac;
import vista.Ventana_Inicial;
import vista.Ventana_crearPlan;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Controlador_Plan_vacunas extends conector{

    public Controlador_Plan_vacunas(Ventana_crearPlan view, modelo_planVac planVac, Ventana_Inicial view_prin){

        view.siguienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Integer.parseInt(view.Numero_planes.getValue().toString())<=0){
                    JOptionPane.showMessageDialog(null,"Error");
                }else {
                    String Mes = Objects.requireNonNull(view.Box_Month.getSelectedItem()).toString();
                    String Dia = Objects.requireNonNull(view.Box_Day.getSelectedItem()).toString();
                    int mes = Integer.parseInt(Mes);
                    int dia = Integer.parseInt(Dia);
                    String plan = "Plan Vacunación "+view.Numero_planes.getValue().toString();
                    int año = 2021;
                    if(planVac.Validar_fecha(dia,mes,año)){
                        if (planVac.CompararFechas(planVac.Validar_fecha(dia,mes,año))){
                            if(planVac.ComprobarPlan(plan)){
                                boolean comp = planVac.ComprobarPlan(plan);
                                System.out.println(comp);
                                planVac.agregarPlan(comp,plan);
                                JOptionPane.showMessageDialog(null,"Plan creado con exito");
                                view.dispose();
                                view_prin.setVisible(true);
                            }else{
                                JOptionPane.showMessageDialog(null,"Numero de plan ya existe");
                            }
                        }else{
                            JOptionPane.showMessageDialog(null,"Ingrese fecha no anterior a la actual");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"Ingrese fecha valida");
                    }
                }

            }
        });
    }
}
