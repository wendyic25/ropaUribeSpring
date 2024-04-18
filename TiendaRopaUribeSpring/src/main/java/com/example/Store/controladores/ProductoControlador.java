package com.example.Store.controladores;


import com.example.Store.modelos.Producto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("storeapi/v1/producto")
public class ProductoControlador {

    @PostMapping
    public ResponseEntity<?> guardarProducto(@RequestBody Producto datosProducto) {
        try {

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(PedidoControlador.guardarProducto(datosProducto));

        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }

    }

}
