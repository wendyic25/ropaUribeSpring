package com.example.Store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "detalle")
public class Detalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Detalle;
    @Column(name = "costoTotal",nullable = false)
    private Integer costoTotal; // obligatorio solo numeros positivos
    @Column(name = "cantidadProductos",nullable = false)
    private Integer cantidadProductos; // solo numeros positivos

    //LO SIGUIENTE NO SE REALIZA.
    //Producto producto;

    public Detalle() {
    }

    public Detalle(Integer id_Detalle, Integer costoTotal, Integer cantidadProductos) {
        this.id_Detalle = id_Detalle;
        this.costoTotal = costoTotal;
        this.cantidadProductos = cantidadProductos;
    }

    public Integer getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Integer costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Integer getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(Integer cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }
}
