package by.epam.tasks.circle;

/*  Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
    m и n вводятся с клавиатуры.
*/

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input n");
        int n = in.nextInt();
        System.out.println("Input m");
        for (int m = in.nextInt();m < n;m++) {
            for (int i = 2; i < m-1; i++) {
                if (m % i == 0) {
                    System.out.println("число "+i+" делитель "+m);
                }
            }
        }
    }
}
