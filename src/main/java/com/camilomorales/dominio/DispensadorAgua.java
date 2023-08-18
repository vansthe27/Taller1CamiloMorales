package com.camilomorales.dominio;

public class DispensadorAgua {

    public String serial;
    public String marca;
    public int cantidadMaxima;
    public int cantidadActual;
    public double temperatura;


    public DispensadorAgua(String serial, String marca, int cantidadMaxima, int cantidadActual, double temperatura){

        this.serial = serial;
        this.marca = marca;
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = cantidadActual;
        this.temperatura = temperatura;
    }

    public String saberSerial(){
        return serial;
    }

    public String saberMarca(){
        return marca;
    }

    public int saberCantidadMaxima(){
        return cantidadMaxima;
    }

    public int saberCantidadActual(){
        return cantidadActual;
    }

    public double saberTemperatura(){
        return temperatura;
    }

    public void servir(int cantidad) {
        if (cantidadActual >= cantidad) {
            cantidadActual -= cantidad;
            System.out.println("Se ha servido:  " + cantidad);
        } else {
            System.out.println("No hay suficiente agua");
        }
    }

    public void llenar() {
        cantidadActual = cantidadMaxima;
        System.out.println("El dispensador ha sido llenado");
    }

    public void vaciar(){
        cantidadActual = 0;
        System.out.println("El dispensador ha sido vaciado");
    }

    public void calentar(double temperaturaDeseada){
        temperatura = temperaturaDeseada;
        System.out.println("El agua se ha calentado");
    }

    public void enfriar(double temperaturaDeseada){
        temperatura = temperaturaDeseada;
        System.out.println("El agua se ha enfriado");
    }

    public void mostrarNivel(){
        cantidadActual = cantidadActual;
        System.out.println("La cantidad actual es: "+cantidadActual);
    }
}



