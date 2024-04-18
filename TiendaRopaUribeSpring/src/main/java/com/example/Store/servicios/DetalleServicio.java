package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionDetalle;
import com.example.Store.modelos.Detalle;
import com.example.Store.repositorios.DetalleRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleServicio {
    @Autowired
    DetalleRepositorio detalleRepositorio;
    @Autowired
    ValidacionDetalle validacionDetalle;

    public Detalle guardarDetalle(){
        return null;
    }


    public Detalle buscarDetallePorId(){
        return null;
    }


    public List<Detalle> buscarTodosLosDetalles(){
        return null;
    }


    public Detalle modificarDetalle(){
        return null;
    }


    public boolean eliminarDetalle(){
        return true;
    }
}
