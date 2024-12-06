package Java.Shapes;

import java.util.Scanner;

public class Rectangle implements Area {
    @Override
    public void getArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle : ");
        double l = sc.nextDouble();
        System.out.println("Enter width of rectangle : ");
        double w = sc.nextDouble();
        double area;
        area = l * w;
        System.out.println("Area of square with length " + l + "and width "+w+" is " + area);
    }
}
