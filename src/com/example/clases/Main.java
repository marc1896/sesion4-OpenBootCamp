package com.example.clases;

import com.example.clases.SmartPhone;
import com.example.clases.SmartWatch;

public class Main {
    public static void main(String[] args) {
        SmartPhone celular = new SmartPhone("Xaomi", "9C", "Azul", 0.5, true);
        SmartWatch reloj = new SmartWatch("Xaomi", "Mi band 5", "Negro", 0.2, false);

        System.out.println("Celular\nMarca: " + celular.marca + "\nModelo: " +celular.modelo + "\nColor: " + celular.color +
                "\nPeso: " + celular.peso + "\nRealiza Llamadas: " + celular.haceLlamadas);
        System.out.println("------------------------------");
        System.out.println("Reloj\nMarca: " + reloj.marca + "\nModelo: " +reloj.modelo + "\nColor: " + reloj.color +
                "\nPeso: " + reloj.peso + "\nRealiza Llamadas: " + reloj.haceLlamadas);
    }
}
