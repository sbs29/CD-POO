package com.campusdual;

import com.campusdual.util.Input;

public class Exercise5 {
    //negativo-positivo
    //mayor-menor
    //si son multiplos

    public static void oddOrEven()
    {
        int value = Input.integer("Escribe un numero par o impar");
    }

    public static void positiveOrNegative()
    {
        int value = Input.integer("Escribe un numero: ");
        if (value < 0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Positive");
        }
    }

    public static void multipleOf()
    {
        int value1 = Input.integer("Escribe un numero: ");
        int value2 = Input.integer("Escribe un numero: ");

        if (value1%value2==0)
        {
            System.out.println("Multiplo");
        }
        else
        {
            System.out.println("No multiplo");
        }
    }

    public static void lowerThan()
    {
        int value1 = Input.integer("Escribe un numero: ");
        int value2 = Input.integer("Escribe un numero: ");

        if (value2 < value1)
        {
            System.out.println("Es menor");
        }
        else
        {
            System.out.println("Es mayor");
        }
    }

    public static void main(String[] args) {

        positiveOrNegative();
        multipleOf();
        lowerThan();

    }

}
