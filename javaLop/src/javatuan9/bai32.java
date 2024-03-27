/*
Bài tập 32.
a. Mô tả cách thực hiện cơ chế Abstraction của các đối tượng trên lớp các phương tiện giao thông Vehicle, Car, Motorcycle.
b. Chọn lớp Vehicle là lớp trừu tượng , có các hàm trừu tượng start, stop kiểu void không đối.
c. Khai báo các lớp Car, Motorcycle kế thừa của lớp trừu tượng có các hàm tương ứng với các hàm trừu tượng được cài đặt lại
d. Viết code cho các hàm của lớp kế thừa từ lớp trừu tượng.
e. Khai báo các đối tượng phương tiện giao thông và cấp phát đối tượng trong hàm main để kiểm tra.
 */

/*
32a
Tạo 2 phương thức trừu tượng start() và stop() được khai báo ở lớp cha Vehicle.
Tạo 2 lớp con Car và Motorcycle kế thừa và khởi tạo chúng 
Trong main, Khởi tạo đối tượng của 2 lớp con và gọi phương thức start() và stop() để 
*/
package javatuan9;

abstract class Vehicle{
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle{
    @Override
    void start() {
        System.out.println("car start. ");
    }

    @Override
    void stop() {
        System.out.println("car stop. ");
    }   
}

class Motorcycle extends Vehicle{
    @Override
    void start() {
        System.out.println("moto start. ");
    }

    @Override
    void stop() {
        System.out.println("moto stop. ");
    }
    
}

public class bai32 {
    public static void main(String[] args){
        Vehicle a;
        a=new Car();
        a.start();
        a.stop();
        a=new Motorcycle();
        a.start();
        a.stop();        
    }
}
