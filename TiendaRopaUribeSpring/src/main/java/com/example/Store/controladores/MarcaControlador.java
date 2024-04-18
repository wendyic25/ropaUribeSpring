package com.example.Store.controladores;

import com.example.Store.modelos.Marca;
import com.example.Store.servicios.MarcaServicio;
import com.example.Store.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("storeapi/v1/marca")
public class MarcaControlador {

    @Autowired
    MarcaControlador marcaControlador;

    @PostMapping
    public ResponseEntity<?> guaradarMarca(@RequestBody Marca datosMarca) {
        try {

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(MarcaServicio.guardarMarca(datosMarca));

        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }

    }

}
