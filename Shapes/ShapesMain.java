package Java.Shapes;


import java.util.Scanner;

public class ShapesMain
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Shapes sh = new Shapes();
        System.out.println("Which Shapes area do you want? \n Circle \n Square \n Rectangle");
        String shape= sc.next();
        Area a1= sh.computeArea(shape);
        a1.getArea();
    }
}
