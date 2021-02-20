package by.epam.tasks.branching;

/*  Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
    отверстие.
*/

public class Task4 {
    public static void main(String[]args){
        int A = 10;
        int B = 4;
        int x = 3;
        int y = 4;
        int z = 5;

        if (((A > x) && (B > y)) || ((A > x) && (B > z)) || ((A > z) && (B > y)))
            System.out.println("True");
        int buffer = A;
        A = B;
        B = buffer;
        if (((A > x) && (B > y)) || ((A > x) && (B > z)) || ((A > z) && (B > y)))
            System.out.println("True");
        else  System.out.println("False");
    }
}
