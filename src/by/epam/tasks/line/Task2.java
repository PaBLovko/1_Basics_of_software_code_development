package by.epam.tasks.line;

/*. Вычислить значение выражения по формуле (все переменные принимают действительные значения):*/

public class Task2 {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 3;

        double one = b + Math.sqrt(Math.pow(b,2)+4*a*c);
        double two = 2*a;
        double three = -Math.pow(a, 3)*c;
        double four = Math.pow(b, -2);
        double result = one/two+three+four;

        System.out.println(result);
    }
}
