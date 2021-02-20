package by.epam.tasks.circle;

/*  Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
    все числа от 1 до введенного пользователем числа.
*/

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input n");
        int n = in.nextInt();
        int result=0;
        for (int i=1;i<=n;i++){
            result += i;
        }
        System.out.println(result);
    }
}
