package Java.Shapes;


public class Shapes
{
    public Area computeArea(String Type)
    {
        if(Type.equalsIgnoreCase("circle"))
        {
            return new Circle();
        }
        else if(Type.equalsIgnoreCase("square"))
        {
            return new Square();
        }
        else if(Type.equalsIgnoreCase("rectangle"))
        {
            return new Rectangle();
        }
        return null;
    }
}
