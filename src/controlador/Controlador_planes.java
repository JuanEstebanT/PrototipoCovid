package controlador;

import modelo.modelo_planes;
import vista.Ventana_Inicial;
import vista.Ventana_Planes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Controlador_planes {
    public Controlador_planes(Ventana_Planes view, modelo_planes model, Ventana_Inicial view_prin){
        model.vista_planes(view);
        view.table_planes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                model.labels(view.txt_primera,view.txt_segunda, view.txt_tercera, view.table_planes);
            }
        });
        view.eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.eliminar_data(view);
            }
        });
        view.regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view_prin.setVisible(true);
                view.dispose();
            }
        });
    }
}
