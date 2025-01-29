package ec.ups.edu.ppw.prueba3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Candidatos {
    
	@Id
    private String nombre;
    private String binomio;
    
    

    // ✅ Constructor vacío (requerido para serialización)
    public Candidatos() {}

    // ✅ Constructor con parámetros
    public Candidatos(String nombre, String binomio) {
        this.nombre = nombre;
        this.binomio = binomio;
    }

    // ✅ Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getBinomio() {
        return binomio;
    }

    public void setBinomio(String binomio) {
        this.binomio = binomio;
    }

    @Override
    public String toString() {
        return "Candidatos[" +
                "nombre='" + nombre + '\'' +
                ", binomio='" + binomio +']';
    }

}
