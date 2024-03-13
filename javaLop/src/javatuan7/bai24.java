/*
Bài 24. 
Hãy tạo một lớp cha có tên là Animal với một phương thức makeSound() để phát ra tiếng kêu của động vật. 
Sau đó, tạo một lớp con có tên là Dog kế thừa từ lớp cha Animal và ghi đè phương thức makeSound() để phát ra tiếng sủa của chó. 
Trong hàm main(), tạo một đối tượng thuộc lớp cha Animal, sau đó sử dụng toán tử instanceof để kiểm tra xem đối tượng đó có thuộc lớp Dog không. 
Nếu có, hãy cấp phát lại đối tượng thuộc lớp Dog và gọi phương thức makeSound() để xem tiếng kêu của nó.
 */
package javatuan7;

class Animal{
    public void makeSound(){
        
    }
}
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("tiếng chó ");
    }    
}
public class bai24 {
    public static void main(String[] args){
        Animal a=new Animal();
        if(a instanceof Dog){
            System.out.println("có");
            a.makeSound();
        }
    }
}
