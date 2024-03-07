/*
Tạo 2 lớp Animal và Dog. Lớp Dog kế thừa từ lớp Animal.

Trong hàm main, tạo một đối tượng Animal được tham chiếu bởi biến animal nhưng thực tế là một đối tượng Dog.

Sử dụng toán tử instanceof, kiểm tra xem đối tượng animal có phải là một instance của lớp Dog hay không.

Nếu kiểm tra trả về true, thực hiện ép kiểu từ lớp cha Animal sang lớp con Dog.

Sau đó, gọi phương thức run() của lớp Dog trên đối tượng dog.

Kết quả là in ra màn hình "Dog is running".

 */
package javatuanTET;

class Animal{
    
}

class Dog extends Animal{
    void run(){
        System.out.println("Dog is running");
    }
}

public class bai_10 {
    public static void main(String[] args){
        
        // Tạo một đối tượng Animal được tham chiếu bởi biến animal nhưng thực tế là một đối tượng Dog
        Animal animal=new Dog();
        
        if(animal instanceof Dog){
            //Ép kiểu Animal sang Dog 
            Dog a=(Dog) animal;
            a.run();
        }
        
    }
}

