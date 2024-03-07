/*
Viết một lớp cha có tên là Animal với phương thức makeSound() để in ra một thông báo "Animal makes a sound". 
Tạo một lớp con có tên là Cat kế thừa từ lớp Animal và ghi đè phương thức makeSound() để in ra thông báo "Cat meows". 
Tạo một đối tượng Cat và gọi phương thức makeSound().
 */
package javatuan6;

class Animal {
    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Cat meows");
    }
}
public class bai17 {
    public static void main(String[] args){
        Cat a=new Cat();
        a.makeSound();
    }
}
