package by.epam.tasks.branching;

/* Найти max{min(a, b), min(c, d)}.*/

public class Task2 {
    public static void main (String[] args){
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        int minFirst;
        int minSecond;
        if (a<b)
            minFirst = a;
        else minFirst = b;
        if (c<d)
            minSecond = c;
        else minSecond= d;
        if (minFirst < minSecond)
            System.out.println("max "+minSecond);
        else System.out.println("max "+minFirst);
    }
}
