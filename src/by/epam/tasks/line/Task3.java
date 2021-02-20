package by.epam.tasks.line;

/* Вычислить значение выражения по формуле (все переменные принимают действительные значения):*/

public class Task3 {
    public static void main(String[] args) {
        double x = 30;
        double y = 30;

        double result = (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y);

        System.out.println(result);
    }
}
