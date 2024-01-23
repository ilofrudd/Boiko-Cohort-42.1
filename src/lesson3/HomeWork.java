package lesson3;

public class HomeWork {
    /**
     * AIT-TR, Java Basic, Cohort42.1, HW #3
     * @Author Boiko Yaroslav
     * @Version 2024-01-22
     */
    public static void main(String[] args) {

        // Ex.1

        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int e = 4;
        int f = 5;
        int g = 6;
        int h = 7;
        int j = 8;
        int p = 9;
        /*
        Чтобы получить точное среднее арифметическое переменная «s» должна быть типа 'double'.
         Так как тип int работает только с целыми числами.
        Так же я сделал переменную «і» тоже типа 'double', для того чтобы мне выдало не целое число.
         */
        double i = 10;
        double s = (a+b+c+d+e+f+g+h+j+p) / i;
        System.out.println(s);

        // Ex.2

        int it1 = 1000;
        int it2 = 500;
        int disc = (a + b) /10;
        int price = a + b - c;
        System.out.println("When you buy 2 items together, a discount is " + disc + " EUR!");
        System.out.println("The price is " + price + " EUR.");

        // Ex.3

        int mo = 0;
        int tu = 1;
        int we = 2;
        int th = -3;
        int fr = 2;
        int sa = 1;
        double su = 5.0;
        double sum = (mo + tu + we + th + fr + sa + su) / 7;
        System.out.println("Average temp for the week = " + sum + "°");

        //Ex.4

        int num1 = 59;
        int num2 = 77;
        System.out.println("remainder of " + num1 + " divided by 2: " + num1 % 2);
        System.out.println("remainder of " + num1 + " divided by 3: " + num1 % 3);
        System.out.println("remainder of " + num2 + " divided by 2: " + num2 % 2);
        System.out.println("remainder of " + num2 + " divided by 3: " + num2 % 3);

        // Ex.5

        int x = 3;
        x += x++;
        System.out.println(x);
        /*
        the output number will be '6'
         */
    }
}

