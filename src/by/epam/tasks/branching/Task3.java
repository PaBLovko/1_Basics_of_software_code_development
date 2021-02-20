package by.epam.tasks.branching;

/*Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой*/

public class Task3 {
    public static void main(String[]args){
        int aX = 4;
        int aY = 3;
        int bX = 4;
        int bY = 2;
        int cX = 5;
        int cY = 5;

        if (((aY == bY) && (aY == cY)) || ((aX == bX) && (aX == cX)))
            System.out.println("True");
        else  System.out.println("False");
    }
}
