package by.epam.tasks.circle;

/* Найти сумму квадратов первых ста чисел*/

public class Task3 {
    public static void main(String[] args) {

        int result = 0;
        for(int i = 1; i <= 100; i ++){
           result += Math.pow(i,2);
        }
        System.out.println(result);

    }
}
