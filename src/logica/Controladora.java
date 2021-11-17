
package logica;

import persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    // metodo para crear cliente. El usuario genera el numero de cliente
    public void crearCliente(String numeroCliente, String nombrePerro, String raza, String color, String alergico, String preferencial, String nombreDuenio, String celular, String observaciones) {

        Cliente clie = new Cliente();
        clie.setCodigo(numeroCliente);
        clie.setNombrePerro(nombrePerro);
        clie.setRaza(raza);
        clie.setColor(color);
        clie.setAlergico(alergico);
        clie.setPreferencial(preferencial);
        clie.setNombreDuenio(nombreDuenio);
        clie.setCelular(celular);
        clie.setObservaciones(observaciones);        
        
        
        controlPersis.crearCliente(clie);
    }
    
    public void crearCliente (Cliente clie) {
        controlPersis.crearCliente(clie);
    }
    
    // TO DO - NO REQUERIDO POR EL CLIENTE
    // eliminar cliente
    // modificar datos del cliente
}
