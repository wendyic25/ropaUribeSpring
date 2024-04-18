package com.example.Store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "tipoPrenda")
public class TipoPrenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_TipoPrenda;
    @Column(name = "nombre",nullable = false, length = 80)
    private String nombre; // no vacio solo letras y espacios y longitud 80

    //LO SIGUIENTE NO SE REALIZA.
    //Producto producto;


    public TipoPrenda() {
    }

    public TipoPrenda(Integer id_TipoPrenda, String nombre) {
        this.id_TipoPrenda = id_TipoPrenda;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
