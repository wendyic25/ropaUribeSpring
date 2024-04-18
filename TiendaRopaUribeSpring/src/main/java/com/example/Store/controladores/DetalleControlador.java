package com.example.Store.controladores;

import com.example.Store.modelos.Detalle;
import com.example.Store.modelos.Marca;
import com.example.Store.modelos.Usuario;
import com.example.Store.servicios.DetalleServicio;
import com.example.Store.servicios.MarcaServicio;
import com.example.Store.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("storeapi/v1/detalle")
public class detalleControlador {

    @PostMapping
    public ResponseEntity<?> guaradarDetalle(@RequestBody Detalle datosDetalle) {
        try {

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(detalleControlador.(datosDetalle));

        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }

    }

}
