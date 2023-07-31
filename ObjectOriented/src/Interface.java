//Multiple Inheritence through interafce in java
public class Interface {
    
    public static void main(String[] args)
    {
        Rectangle rect = new Rectangle();
        rect.getArea(5, 6);
        rect.circle();
        rect.triangle();
        
    }
}
interface polygon
{
    public void getArea(int lenght , int width);
}
interface circle
{
    public void circle();
}
interface triangle extends circle , polygon
{
    public void triangle();
}
class Rectangle implements triangle
{
    public void getArea(int lenght , int width)
    {
        System.out.println(lenght*width);
    }
    public void circle()
    {
        System.out.println("This is circle");
    }
    public void triangle()
    {
        System.out.println("This is triangle");
    }
}


