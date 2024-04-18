package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionTipoPrenda;
import com.example.Store.modelos.Marca;
import com.example.Store.modelos.TipoPrenda;
import com.example.Store.repositorios.TipoPrendaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoPrendaServicio {

    @Autowired
    ValidacionTipoPrenda validacionTipoPrenda;
    @Autowired
    TipoPrendaRepositorio tipoPrendaRepositorio;

    public TipoPrenda guardarTipoPrenda(){

        return null;
    }


    public TipoPrenda buscarTipoPrendaPorId(Integer idTipoPrenda)throws Exception{
        try {
            if (tipoPrendaRepositorio.findById(idTipoPrenda).isPresent()){
                return tipoPrendaRepositorio.findById(idTipoPrenda).get();
            }else {
                throw new Exception("tipo de prenda no encontrado");
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }



    public List<TipoPrenda> buscarTodosLosTipoPrenda(){

        return null;
    }


    public TipoPrenda modificarTipoPrenda(){

        return null;
    }


    public boolean eliminarTipoPrenda(){

        return true;
    }
}
