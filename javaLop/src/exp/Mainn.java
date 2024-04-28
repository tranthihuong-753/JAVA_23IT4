 abstract class Shape {
    public void printMe() {
    System.out.println("I am a shape.");
    }
    public abstract double computeAreaQ();
}

   class Circle extends Shape {
    private double rad = 5;
    public void printMeQ() {
    System.out.println("I am a circle.");
    }
    public double computeAreaQ() {
    return rad * rad * 3.15;
    }
}

   class Ambiguous extends Shape {
    private double area = 10;
    public double computeAreaQ() {
        return area;
    }
}

public class Mainn
{
        public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        Circle circle = new Circle();
        Ambiguous ambiguous = new Ambiguous();
       
        shapes[0] = circle;
        shapes[1] = ambiguous;
       
        for (Shape s : shapes) {
            if (s instanceof  Circle)
                ((Circle)s).printMeQ();
            System.out.println(s.computeAreaQ());
        }
    }
}