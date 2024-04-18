package com.example.Store.helpers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ValidacionPedido {
    public boolean validarFechaYHora(LocalDate fechaYHora)throws Exception{
        if (fechaYHora==null){
            throw new Exception("la fecha no puede estar vacia");
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Formato deseado
        String fechaString = fechaYHora.toString(); // Convertir LocalDate a String

        try {
            LocalDate parsedDate = LocalDate.parse(fechaString, formatter);
            // Si la fecha analizada es igual a la fecha original, entonces está en el formato deseado
            if (parsedDate.equals(fechaYHora)) {
                return true;
            } else {
                throw new Exception("La fecha no está en el formato deseado.");
            }
        } catch (DateTimeParseException e) {
            throw new Exception("Error al analizar la fecha.");
        }

    }
}
