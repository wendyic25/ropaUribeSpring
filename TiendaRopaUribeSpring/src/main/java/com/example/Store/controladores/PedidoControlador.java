package com.example.Store.controladores;

import com.example.Store.modelos.Pedido;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("storeapi/v1/pedido")
public class PedidoControlador {

    @PostMapping
    public ResponseEntity<?> guardarPedido(@RequestBody Pedido datosPedido) {
        try {

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(PedidoControlador.guardarPedido(datosPedido));

        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }

    }

}
