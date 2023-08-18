package com.camilomorales.app;

import com.camilomorales.dominio.DispensadorAgua;

public class Dispensar {
    public static void main(String[] args) {
        DispensadorAgua miDispensador = new DispensadorAgua("12345", "SAMSUNG", 100, 80, 23.2);

        System.out.println("Serial: " + miDispensador.saberSerial());
        System.out.println("Marca: " + miDispensador.saberMarca());
        System.out.println("Cantidad Maxima: " + miDispensador.saberCantidadMaxima());git 
        System.out.println("Cantidad Actual: " + miDispensador.saberCantidadActual());
        System.out.println("Temperatura: " + miDispensador.saberTemperatura());
    }
}
