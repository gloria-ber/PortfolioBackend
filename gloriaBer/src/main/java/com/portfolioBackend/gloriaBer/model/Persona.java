
package com.portfolioBackend.gloriaBer.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;    
    private String nombre;    
    private String apellido;    
    private String descripcion;
    private String banner;
    private String imagenPerfil;   
    @Lob
    @Column(columnDefinition = "TEXT", length=500)
    private String presentacion;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String descripcion, String banner, String imagenPerfil, String presentacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.banner = banner;
        this.imagenPerfil = imagenPerfil;
        this.presentacion = presentacion;
    }

   
    
}
