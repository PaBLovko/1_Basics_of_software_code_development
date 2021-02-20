package by.epam.tasks.circle;

/*  Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
    заданному е. Общий член ряда имеет вид:
*/

public class Task5 {
    public static void main(String[] args) {
        double e=0.1;
        double result=0;
        for(int n=1;n<7;n++){
            double rowMember=1/Math.pow(2, n)+1/Math.pow(3, n);
            if(Math.abs(rowMember)>=e) result+=rowMember;
        }
        System.out.println(result);
    }
}
