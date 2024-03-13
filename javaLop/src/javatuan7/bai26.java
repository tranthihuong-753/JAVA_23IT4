/*
Bài 26. Thực hiện yêu cầu sau:
Animal và Dog. Lớp Dog kế thừa từ lớp Animal.
Trong hàm main, tạo một đối tượng Animal được tham chiếu bởi biến animal nhưng thực tế là một đối tượng Dog.
Sử dụng toán tử instanceof, kiểm tra xem đối tượng animal có phải là một instanceof của lớp Dog hay không.
Nếu kiểm tra trả về true, thực hiện ép kiểu từ lớp cha Animal sang lớp con Dog.
Sau đó, gọi phương thức run() của lớp Dog trên đối tượng dog.
Kết quả là in ra màn hình "Dog is running".
 */
package javatuan7;

class Animall{
    public void run(){
        
    }
}

class Dogg extends Animall{
    @Override
    public void run(){
        System.out.println("Dog is running");
    }    
}

public class bai26 {
    public static void main(String[] args){
        Animall animal=new Dogg();
        if(animal instanceof Dogg){
            Dogg a = (Dogg) animal; 
            a.run(); // Gọi phương thức run() của lớp Dogg
        }
    }
}
