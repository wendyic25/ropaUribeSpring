package com.example.Store.modelos;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Pedido;
    @Column(name = "fechaYHora",nullable = false)
    private LocalDateTime fechaYHora; // no vacio y formato internacional

    @ManyToOne
            @JoinColumn(name="id_Usuario", referencedColumnName = "id_Usuario")
    Usuario usuario;


    public Pedido() {
    }

    public Pedido(Integer id, LocalDateTime fechaYHora) {
        this.id_Pedido = id_Pedido;
        fechaYHora = fechaYHora;
    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }
}
