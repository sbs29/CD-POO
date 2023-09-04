package com.campusdual;

public class Exercise3 {

    static int value = 5;

    public static void main(String[] args) {

        int result = AddTwoNumber(5,9);

        System.out.println(value);

        System.out.println(result);

        Exercise3.bye();

    }

    public static void bye()
    {
        System.out.println("Good bye, baby");
        if (Math.random() * 100 % 2 == 0)
        {
            return;
        }
        Exercise3.value +=1;
    }

    public static int AddTwoNumber(int a, int b)
    {
        int c = 0;

        c = a + b;

        return c;
    }
}
