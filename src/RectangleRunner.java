public class RectangleRunner {

    public static void main(String[]args)
    {
        Rectangle rect1 = new Rectangle(10, 20);
        rect1.calculateArea();
        rect1.printArea();
        rect1.calculateBoxVolume(30.75);
        rect1.printBoxVolume(30.75);

        int printArea = rect1.calculateArea();

    }
}
