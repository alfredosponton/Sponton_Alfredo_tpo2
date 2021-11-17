
package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {
    
    // id generado por el usuario. se valida que sea entero y no vacio
    @Id
    private String codigo;
    @Basic
    private String nombrePerro;
    private String raza;
    private String color;
    private String alergico;
    private String preferencial;
    private String nombreDuenio;
    private String celular;
    private String observaciones;

    public Cliente() {
    }

    public Cliente(String codigo, String nombrePerro, String raza, String color, String alergico, String preferencial, String nombreDuenio, String celular, String observaciones) {
        this.codigo = codigo;
        this.nombrePerro = nombrePerro;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.preferencial = preferencial;
        this.nombreDuenio = nombreDuenio;
        this.celular = celular;
        this.observaciones = observaciones;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String isAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String isPreferencial() {
        return preferencial;
    }

    public void setPreferencial(String preferencial) {
        this.preferencial = preferencial;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
    
}
