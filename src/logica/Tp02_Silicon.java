package logica;

import igu.Peluqueria;

public class Tp02_Silicon {

    public static void main(String[] args) {

        Controladora control = new Controladora();

        
        Peluqueria peluq = new Peluqueria(control);
        peluq.setVisible(true);
        peluq.setLocationRelativeTo(null);

    }

}
