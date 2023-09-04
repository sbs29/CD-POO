package com.campusdual;

public class Exercise4 {

    public static void main(String[] args) {
        //Suma de los 5 primeros números
        //Suma de los 20 primeros números pares

        int n1 = 1, n2 = 2, n3 = 3, n4 = 4, n5 = 5;
        int result = n1+n2+n3+n4+n5;
        System.out.println(result);

        System.out.println(2+4+6+8+10+12+14+16+18+20+22+24+26+28+30+32+34+36+38+40);

        int n = 20;
        int par = n * ( n + 1);
        System.out.println(par);
    }
}
