package controlador;

import modelo.modelo_planes;
import vista.Ventana_Planes;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Controlador_planes {
    public Controlador_planes(Ventana_Planes view, modelo_planes model){
        model.vista_planes(view);
        view.table1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                model.labels(view.txt_primera,view.txt_segunda, view.txt_tercera, view.table1);
            }
        });
    }
}
