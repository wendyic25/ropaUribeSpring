package com.example.Store.controladores;

import com.example.Store.modelos.Marca;
import com.example.Store.modelos.TipoPrenda;
import com.example.Store.modelos.Usuario;
import com.example.Store.servicios.MarcaServicio;
import com.example.Store.servicios.TipoPrendaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("storeapi/v1/tipoprenda")
public class TipoPrendaControlador {

   @Autowired
   TipoPrendaControlador tipoPrendaControlador;

   @PostMapping
   public ResponseEntity<?> guaradarTipoPrenda(@RequestBody Usuario datosTipoPrenda) {
      try {

         return ResponseEntity
                 .status(HttpStatus.OK)
                 .body(tipoPrendaControlador.guaradarTipoPrenda(datosTipoPrenda));

      } catch (Exception error) {
         return ResponseEntity
                 .status(HttpStatus.BAD_REQUEST)
                 .body(error.getMessage());
      }

   }

}
