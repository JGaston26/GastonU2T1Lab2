public class Circle
{
    private double radius;
    private double a;

    public Circle(double rad)
    {
        radius = rad;
    }

    public void area()
    {
        a = Math.PI * (radius * radius);
        System.out.println("A circle with a radius of " + radius + " has an area of " + a);
    }
}
