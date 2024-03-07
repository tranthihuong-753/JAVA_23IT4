/*
bài 15: 
Hãy tạo một lớp Student để quản lý thông tin của học sinh gồm các thuộc tính: 
tên (name), tuổi (age) và điểm trung bình (gpa). 
Triển khai đóng gói thông qua việc sử dụng phương thức getter và setter để truy cập và cập nhật giá trị của các thuộc tính. 
Bài tập yêu cầu cài đặt các hàm sau đây:
Constructor có tham số để khởi tạo đối tượng Student với các giá trị ban đầu.
Getter và setter cho các thuộc tính name, age và gpa.
Phương thức calculateScholarship() để tính toán mức học bổng dựa trên điểm trung bình của học sinh.
 */
package javatuan6;

class Student{
    private String name;
    private int age;
    private double gpa;
    public void getname(String a){
        this.name=a;
    }
    public String setname(){
        return name;
    }
    public void getage(int a){
        this.age=a;
    }
    public int setage(){
        return age;
    }
    public void getgpa(Double a){
        this.gpa=a;
    }
    public Double setgpa(){
        return gpa;
    }    
    public void a(String a, int b, double c){
        getname(a);
        getage(b);
        getgpa(c);
    }
    public void calculateScholarship(){
        if(gpa>=3){
            System.out.println("còn hb");
        }else{
            System.out.println("mất hb");
        }
    }
}

public class bai15 {
    public static void main(String[] args){
        Student student=new Student();
        student.a("Ánh",19,3.1);
        student.calculateScholarship();
    }
}
