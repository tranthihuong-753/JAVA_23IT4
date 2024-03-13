/*
Bài 20

Lập hai lớp: Person và Student. Lớp Student là một lớp con của lớp Person, kế thừa các thuộc tính và phương thức từ lớp cha.
Lớp Person:
có hai thuộc tính là "name" và "age" được khai báo với phạm vi truy cập protected, cho phép lớp con truy cập vào chúng. 
Lớp cũng có một hàm tạo (constructor) nhận vào hai tham số "name" và "age" để khởi tạo các thuộc tính. 
Ngoài ra, lớp còn có phương thức "displayInfo()" để hiển thị thông tin "name" và "age" lên màn hình.

Lớp Student : là lớp con của lớp Person, kế thừa các thuộc tính và phương thức của lớp cha. 
Bổ sung thêm thuộc tính và phương thức.
có thêm một thuộc tính là studentId và một hàm tạo khác nhận thêm tham số studentId. Hàm tạo này gọi hàm tạo của lớp cha để khởi tạo thuộc tính name và age. 
Lớp Student cũng có một phương thức riêng là displayStudentInfo() để hiển thị thông tin của sv bao gồm name, age và studentId.

Trong phần chạy chương trình (hàm main), khai báo và cấp phát  một đối tượng Student mới với tên là "Nguyễn Tiến Dũng", tuổi là 21 và mã sinh viên là "CMCUNI12345". 
Sau đó, gọi phương thức displayStudentInfo() để hiển thị thông tin của sv lên màn hình.
 */
package javatuan7;

class Person{
    protected String name;
    protected int age;
    public void a(String a, int b){
        this.name=a;
        this.age=b;
    }
    public void displayInfo(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
    }
}

class Student extends Person{
    @Override
    public void a(String a, int b){
        
    }   
    
    protected String studentId;
    public void b(String a, int b, String c){
        this.name=a;
        this.age=b;
        this.studentId=c;
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("studentId: "+studentId);    
    }
}



public class ex20 {
    public static void main(String[] args){
        Student a=new Student();
        a.b("Nguyễn Tiến Dũng", 21, "CMCUNI12345");
        a.displayInfo();
    }
    
}
