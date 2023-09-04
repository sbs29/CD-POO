package com.campusdual;

public class Exercise2 {
//area circulo y longitud circunferencia
    public static void main(String[] args) {

        double r = 15;
        double a = 0;
        double l = 0;

        a = Math.PI * Math.pow(r,2);

        l = (2 * Math.PI) * r;

        System.out.println("Circle area with radio 15: " + a);
        System.out.println("Circle area with radio 15: " + l);
    }
}
