package by.epam.tasks.line;

/*  Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
    принадлежит закрашенной области, и false — в противном случае:
*/

public class Task6 {
    public static void main(String[] args){
        int x = 0;
        int y = 0;

        int xMin = -4;
        int xMax = 4;
        int yMin = -3;
        int yMax = 4;

        System.out.println(x <= xMax && x >= xMin && y <= yMax && y >= yMin);
    }
}
