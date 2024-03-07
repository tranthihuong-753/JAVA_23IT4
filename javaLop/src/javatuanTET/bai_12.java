/*
bài 12:
1.Cho ví dụ về phương thức được overloading(Trong 1 class có 2 phương thức cùng tên khác đối số) ở lớp tam giác, tứ giác lồi.
Overloading là 1 đặc điểm của nguyên lý Polymorhism(Đa hình)?
??? Tại sao gọi Overloading là Dạng Polymorphism tại compile-time.

2.Cho ví dụ về phương thức overriding(Lớp con ghi đè phương thức lớp cha để thay đôỉ cách hoạt động của phương thức) ở 3 lớp:
Person, Teacher, Student(S).
Overriding là 1 đặc điểm của nguyên lý Polymorhism?
Tại sao gọi Overrding là Dạng Polymorphism tại runtime.

3.Cho ví dụ về tổ chức lớp Abstract của các lớp Person, Teacher, Student, khai báo 1 phương thức Abstract. 
Có thể cấp phát đối tượng cho 1 lớp Abstract với 1 phương thức Abstarct (chỉ có khai báo hàm) không?

4.Giả sử Animal là 1 lớp Abstract, Bird là 1 lớp dẫn xuất(lớp con) của Animal với phương thức riêng Fly không có trong lớp Animal.
+ Khai báo ob là đối tượng kiểu Animal, và cấp phát ob là đối tượng kiểu Bird.
+ Thực hiện phép kiểm tra ob là kiểu Bird bằng toán tử instanceof.  Nếu đúng ob là 1 đối tượng thuộc lớp Bird thì thông báo lên màn hình.
+ Khi ob là kiểu Bird thực hiện phép ép kiểu để gọi phương thức Fly
 */
/*
//1 
package javatuanTET;

public class bai_12 {
    //Phương thức tính chu vi tam giác
    double peremeter(double ab, double bc, double ac){
        return ab+bc+ac;
    }
    
    //Phương thức tính chu vi tứ giác 
    double peremeter(double ab, double bc, double cd, double ad){
        return ab+bc+cd+ad;
    }
    
    public static void main(String[] args){
        bai_12 a=new bai_12();
        
        double b=a.peremeter(1.0,4.0,3.0);
        
        double c=a.peremeter(1.0,2.0,3.0,2.5);
        
        System.out.println(b+"\n"+c);
        
    }
}
*/

/*
//2
package javatuanTET;

class Person{
    void A(){
        System.out.println("person");
    }
}

class Teacher extends Person{
    @Override
    void A(){
        System.out.println("Teacher");
    }
}

class S extends Teacher{
    @Override
    void A(){
        System.out.println("Student");
    }
}

public class bai_12{
    public static void main(String[] args){
        Person p = new Person();
        p.A();
        
        Teacher t=new Teacher();
        t.A();
        
        S s=new S();
        s.A();
        
    } 
}
*/
/*
//3 
package javatuanTET;

abstract class Person{
    public abstract void A();
}

class Teacher extends Person{
    @Override
    public void A(){
        System.out.println("Teacher");
    }
}

public class bai_12{
    public static void main(String[] args){
        Teacher t=new Teacher();
        t.A();
    } 
}
*/

//4
package javatuanTET;

abstract class Animal_{
    public abstract void A();
}

class Bird extends Animal_{
    @Override
    public void A(){
        System.out.println("Teacher");
    }
    public void Fly(){
        System.out.println("Fly");
    }
}

public class bai_12{
    public static void main(String[] args){
        Animal_ ob=new Bird();
        if(ob instanceof Bird){
            System.out.println("Tick");
            Bird a=(Bird) ob;
        }
    }
}

