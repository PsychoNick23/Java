package Java.Shapes;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Circle implements Area
{

    @Override
    public void getArea() {
        Locale french=new Locale("fr","FR");
        ResourceBundle res=ResourceBundle.getBundle("Resource",french);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        double r= sc.nextDouble();
        double pi=3.142,area;
        area=pi*r*r;
        System.out.println(res.getString("circle")+r+" is "+area);

    }
}
