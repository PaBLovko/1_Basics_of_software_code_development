package by.epam.tasks.circle;

/*  Вычислить значения функции на отрезке [а,b] c шагом h:*/

public class Task2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        int h = 3;

        for(int x = a; x <= b; x += h){
            int y;
            if(x>2)
                y=x;
            else y=-x;
            System.out.println("значение аргумента: "+ x+" Значение функции: "+y);
        }
    }
}
