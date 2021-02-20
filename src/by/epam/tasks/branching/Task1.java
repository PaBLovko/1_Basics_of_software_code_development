package by.epam.tasks.branching;

/*  Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
    он прямоугольным.
*/

public class Task1 {
    public static void main(String[]args){
        int a = 90;
        int b = 89;

        int c = 180 - a - b;
        if(a+b+c == 180 && a != 0 && b != 0 && c != 0){
            if (a == 90 || b == 90 || c == 90)
                System.out.println("rectangular");
            else System.out.println("not rectangular");
        }else System.out.println("False");
    }
}
