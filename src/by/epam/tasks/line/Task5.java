package by.epam.tasks.line;

/*  Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
    данное значение длительности в часах, минутах и секундах в следующей форме:
    ННч ММмин SSc.
*/
public class Task5 {
    public static void main(String[] args){
        int T = 0;

        int hour = T / 3600;
        int minute = T % 3600 / 60;
        int second = T % 3600 % 60;

        System.out.println(hour+"ч "+minute+"мин "+second+"с ");
    }
}
