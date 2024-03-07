/*
sửa code 
Thêm 2 hàm constructor của lớp Rectangle ở code sau(bài 3 tuần 3):
Gọi trong main() lệnh khai báo và tạo các đối tượng lớp Rectangle để gọi 2 hàm tạo này.
 */
package javatuan5;

import java.util.Scanner;

class Rectangle {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
         this.width=w;       
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
       this.height = h;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2.0 * (width + height);
    }
    //Hàm gán giá trị cho width, height
    public void Rectangle(double a, double b){
        this.width=a;
        this.height=b;
    }
    //Hàm in ra width, height 
    public void Rectangle(){
        System.out.println("width="+width);
        System.out.println("heiht="+height);
    }
        
}

class Circle {
    public Circle(){
        System.out.println("Đây là một hàm khởi tạo");
        radius=100;
    }
    public Circle (double r){
        System.out.println("Đây là hàm tạo có đối, số đối bằng số biến của lớp");
        radius=r;
    }
    //public double radius;
    private double radius;//che

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class bai1
{
    public static void main(String[] args) {
        System.out.println("Hello World");
        ////////////////////////////////////
        Circle obj = new Circle();
        System.out.println("Bán kính khởi đầu của biến obj là:"+obj.getRadius());
       // circle.radius=5.0; //?
        obj.setRadius(5.0);
        System.out.println("Radius: " + obj.getRadius());
        System.out.println("Area: " + obj.calculateArea());
        System.out.println("cấp phát một biến đối tượng Circle có bán kính bằng 2000");
        Circle ob = new Circle(2000.0);
        System.out.println("Diện tích của đối tượng ob là:"+ob.calculateArea());
        ////////////////////////////////////
        System.out.println("Thử lớp Rectangle");
        Rectangle ob1 = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Độ rộng= ");
        double width=scanner.nextDouble();
        System.out.print("Độ cao= ");
        double height=scanner.nextDouble();
        
        ob1.Rectangle(width, height);
        scanner.close();

        System.out.println("Độ rộng: " + ob1.getWidth());
        System.out.println("Độ cao: " + ob1.getHeight());
        System.out.println("Diện tích: " + ob1.calculateArea());
        System.out.println("Chu vi: " + ob1.calculatePerimeter());
        ///////////////////////////////////////
        ob1.Rectangle();
        
    }
}

