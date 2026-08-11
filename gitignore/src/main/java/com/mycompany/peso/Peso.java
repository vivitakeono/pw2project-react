package com.mycompany.peso;

public class Peso {

    public static void main(String[] args) {

        int peso = 20;

        if (peso < 18) {
            System.out.println("Abaixo do peso");

        } else if (peso >= 18 && peso <= 24) {
            System.out.println("Peso normal");

        } else if (peso >= 25 && peso <= 29) {
            System.out.println("Sobrepeso");

        } else {
            System.out.println("Obesidade");
        }
    }
}