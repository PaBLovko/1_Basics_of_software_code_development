package by.epam.tasks.circle;

/* Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
* */

import java.util.ArrayList;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int a = 12356, b = 13589;

        ArrayList<Integer> listFirst = new ArrayList<Integer>();
        ArrayList<Integer> listSecond = new ArrayList<Integer>();
        for(int i = a; i > 0; i /= 10){
            listFirst.add(i%10);
        }
        for(int i = b; i > 0; i /= 10){
            listSecond.add(i%10);
        }
        for (int i = 0; i <= 9; i++){
            if(listFirst.contains(i) && listSecond.contains(i))
                System.out.println("number "+i);
        }
    }
}
