/*
Bài 22.  Lập 3 lớp Person, Students, Teachers như sau:
Lớp Person đại diện cho một người với các thuộc tính name (tên) và age (tuổi). 
Lớp này có một hàm tạo để khởi tạo giá trị cho các thuộc tính và một phương thức displayInfo() để hiển thị thông tin của người đó.

Lớp Teacher kế thừa từ lớp Person và mở rộng nó bằng cách thêm thuộc tính teacherId (mã giáo viên). 
Lớp này có một hàm tạo để khởi tạo giá trị cho các thuộc tính của lớp cha và thuộc tính của chính nó.
Trong lớp Teacher, chúng ta ghi đè phương thức displayInfo() của lớp cha bằng cách sử dụng @Override. 
Trong phương thức này, chúng ta trước tiên gọi lại phương thức displayInfo() của lớp cha bằng cách sử dụng super.displayInfo(), 
sau đó thêm vào câu thông báo "Teacher ID: " theo sau là giá trị của thuộc tính teacherId.
 */
package javatuan7;

class Personn{
    protected String name;
    protected int age;
    public void get_P(String a, int b){
        this.name=a;
        this.age=b;
    }
    public void displayInfo(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
    }
}

class Teacher extends Personn{
    protected String teacherId;
    public void get_T(String a, int b, String c){
        this.name=a;
        this.age=b;
        this.teacherId=c;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("teacherId: "+teacherId);
    }    
}

public class bai22 {
    public static void main(String[] args){
        Teacher a=new Teacher();
        a.get_T("A", 21, "ID123");
        a.displayInfo();
    }
}
