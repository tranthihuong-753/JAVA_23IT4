class Triangle {
    public double calculateArea(double h, double a) {
        return 0.5 * h * a;
    }

    public double calculateArea(double a, double b, double c) { // sửa b2 thành b 
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p- c));
    }

    public double calculateArea(double b, double c, float angle_A) { // tham số giống hàm 2 
        return 0.5 * b * c * Math.sin(Math.toRadians(angle_A));
    }
}

public class bai28 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        double area1 = triangle.calculateArea(4.5, 3.2);
        System.out.println("Area with height and base: " + area1);

        double area2 = triangle.calculateArea(3, 4, 5);
        System.out.println("Area with three sides: " + area2);

        double area3 = triangle.calculateArea(5, 7, 60);
        System.out.println("Area with two sides and angle: " + area3);
    }
}