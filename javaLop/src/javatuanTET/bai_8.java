/*
Thực hiện code tạo 2 lớp Vehicle và Car như sau:

Lớp Vehicle có một phương thức start() mặc định để in ra "The vehicle starts".

Lớp con Car kế thừa từ lớp Vehicle và sử dụng @Override để ghi đè phương thức start().

Trong lớp Car, chúng ta đã sửa đổi mã của phương thức để in ra "The car starts with a key" 
thay vì câu thông báo mặc định của lớp cha.
 */
package javatuanTET;

class Vehicle{
    void start(){
        System.out.println("The vehicle starts");
    }
}
class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("The car starts with a key");
    }
}
public class bai_8 {
    public static void main(String[] args){
        Car a=new Car();
        a.start();
    }
}
