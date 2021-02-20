package by.epam.tasks.line;

/*  Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
    дробную и целую части числа и вывести полученное значение числа.
*/

public class Task4 {
    public static void main(String[] args){
        double R =  123.456;

        String string = Double.toString(R);
        String left = string.substring(0, 3);
        String right = string.substring(4, 7);
        string = right + "." + left;
        R = Double.parseDouble(string);

        System.out.println(R);
    }
}
