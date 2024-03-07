/*
bài 15:
Tạo một interface (bên trong không có phương thức chứa {})
có tên MakeSoundable có một phương thức duy nhất được gọi là makeSound().

Tạo một lớp trừu tượng(abstract) 
có tên Vehicle_1 có một thuộc tính name và maxSpeed, 
đặc biệt maxSpeed được khai báo là biến final để cấm sửa sau khi biến được khởi tạo lần đầu, 
và một phương thức move() in ra tốc độ của phương tiện. 

Ngoài ra Vehicle_1 cũng có 1 phương thức trùng tên makeSound với biến là kiểu xâu kí tự, 
và Vehicle_1 cũng có 1 phương thức trừu tượng là move(). 

Tạo hai lớp có tên Car_1 và Bike mở rộng lớp Vehicle và implement MakeSoundable interface. 
Đặc biệt lớp Bike không cho phép kế thừa (tức là class AAA extends Bike là không được phép) 

Lớp Car_1 nên phát ra âm thanh Vroom! 
khi phương thức makeSound() của nó được gọi và lớp Bike nên phát ra âm thanh Ring-ding-ding! 
khi phương thức makeSound() của nó được gọi. 

Trong main() tạo một đối tượng Car và Bike và gọi các phương thức makeSound() của chúng với các đối số khác nhau. 

Thay đổi linh hoạt code để thể hiện:

+ Phạm vi: private, protected, public

+ Truy cập biến static, hàm static

+ Thêm hàm vào interface, và cài đặt hàm của các lớp implements

+ Khai báo hàm trừu tượng của lớp trừu tượng

+ Thêm hàm trùng tên để thể hiện polymorphism ở mức compilete-time (overloading)

+ Thay đổi code hàm của lớp cha tại lớp dẫn xuất để thể hiện polymorphism ở mức runtime (overriding)

+ Thay đổi khai báo có hoặc không có final ở khai báo lớp, khai báo biến, khai báo hàm.
 */
package javatuanTET;

interface MakeSoundable{
    void makeSound(int a);
}

abstract class Vehicle_1{
    public String name;
    public double maxSpeed;
    
    public Vehicle_1(String a, double b){
        this.name=a;
        this.maxSpeed=b;
    }
    
    public void move(){
        System.out.println("Tốc độ của phương tiện là : " + maxSpeed);
    }
    
    void makeSound(String a){
        System.out.println("a");
    };
    
}

class Car_1 extends Vehicle_1{
    public Car_1(String a, double b){
        //Gọi phương thức cùng tên với phương thức hiện tại 
        super(a,b);
    }  
    
    @Override
    public void move(){
        System.out.println("Tốc độ của phương tiện là : " + maxSpeed+" km/h.");
    }
    
    @Override
    void makeSound(String a){
        System.out.println("~ "+a+" ~");
    }    
}

//Lớp Bike không được phép kế thừa 
final class Bike extends Vehicle_1{
    public Bike(String a, double b){
        super(a,b);
    }
    
    @Override
    public void move(){
        System.out.println("Tốc độ của phương tiện là : " + maxSpeed+" km/h.");
    }
    
    @Override
    void makeSound(String a){
        System.out.println("~~~ "+a);
    }
}



public class bai_15 {
    public static void main(String[] args){
        Bike a=new Bike("number 1", 12);
        a.move();
        a.makeSound("mmm");
    }
}

