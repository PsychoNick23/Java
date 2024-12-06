package Java.Shapes;

import java.util.Scanner;

public class Square implements Area {
    @Override
    public void getArea() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of square : ");
        double l= sc.nextDouble();
        double area;
        area=l*l;
        System.out.println("Area of square with length "+l+" is "+area);
    }
}
