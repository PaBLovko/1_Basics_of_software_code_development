package by.epam.tasks.circle;

/* Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

public class Task6 {
    public static void main(String[] args) {
        for(int i = 33; i <= 127; i++){ //excluding control commands (00-32h)
            System.out.println("symbol "+(char)i +" value "+i);
        }
    }
}
