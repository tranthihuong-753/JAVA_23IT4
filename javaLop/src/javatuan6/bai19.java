/*
bài 19: 
Viết một lớp cha có tên là Person với các thuộc tính như tên, tuổi và địa chỉ. 
Tạo một lớp con là Student kế thừa từ lớp Person và thêm thuộc tính và phương thức phù hợp cho lớp Student. 
Tạo đối tượng Student và in ra thông tin về tên, tuổi và địa chỉ.
 */
package javatuan6;

class Person{
    protected String name;
    protected int age;
    protected String home;
    public void a(String a, int b, String c){
        this.name=a;
        this.age=b;
        this.home=c;
    }        
}

class Student_19 extends Person{
    protected String sex;
    public void a(String a, int b, String c, String d){
         this.name=a;
         this.age=b;
         this.home=c;       
         this.sex=d;
    }
    //Hàm in ra tên tuổi địa chỉ 
    public void pr(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Home : "+home);
    }
}
public class bai19 {
    public static void main(String[] args){
        Student_19 a=new Student_19();
        a.a("A", 13, "HÀ ĐÔNG", "nữ");
        a.pr();
    }
}
