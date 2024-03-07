/*
baài 18: 
Viết một lớp cha có tên là Shape với thuộc tính là màu sắc. 
Tạo các lớp con là Circle và Rectangle kế thừa từ lớp Shape và thêm các thuộc tính và phương thức phù hợp cho từng lớp. 
Tạo đối tượng Circle và Rectangle và in ra màu sắc của chúng.
 */
package javatuan6;

class Shape{
    public void a(){
        System.out.println("màu xanh");
    }
}

class Circle extends Shape{
    @Override
    public void a(){
        System.out.println("màu đỏ");
    }
}

class Rectangle extends Shape{
    @Override
    public void a(){
        System.out.println("màu tím");
    }    
}

public class bai18 {
    public static void main(String[] args){
        Circle a=new Circle();
        a.a();
        Rectangle b=new Rectangle();
        b.a();
    }
}
