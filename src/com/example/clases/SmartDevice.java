package com.example.clases;

public class SmartDevice {
    //atributos
    String marca;
    String modelo;
    String color;
    double peso;
    boolean haceLlamadas;

    //contructores
    public SmartDevice() {}

    public SmartDevice(String marca, String modelo, String color, double peso, boolean haceLlamadas) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.peso = peso;
        this.haceLlamadas = haceLlamadas;
    }
}
