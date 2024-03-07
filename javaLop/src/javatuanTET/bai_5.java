/*
Hãy tạo một lớp Student để quản lý thông tin của học sinh gồm các thuộc tính: 
tên (name), tuổi (age) và điểm trung bình (gpa). 
Triển khai đóng gói thông qua việc sử dụng phương thức getter và setter để truy cập và cập nhật giá trị của các thuộc tính. 
Bài tập yêu cầu cài đặt các hàm sau đây:

Constructor có tham số để khởi tạo đối tượng Student với các giá trị ban đầu.

Getter và setter cho các thuộc tính name, age và gpa.

Phương thức calculateScholarship() để tính toán mức học bổng dựa trên điểm trung bình của học sinh.
 */
package javatuanTET;

class Student{
        private String name;
        private int age;
        private double gpa;
        public Student(String a, int b, double c){
            this.name=a;
            this.age=b;
            this.gpa=c;
        }
        public String getName(){
            return name;
        }
        public void setName(String a){
            this.name=a;
        }
        public int getAge(){
            return age;
        }
        public void setAge(int a){
            this.age=a;
        }
        public double getGpa(){
            return gpa;
        }
        public void setGpa(double a){
            this.gpa=a;
        }
    // Phương thức tính toán học bổng
    public String calculateScholarship() {
        if (gpa >= 3.5) {
            return "Học bổng cao";
        } else if (gpa >= 3.0) {
            return "Học bổng trung bình";
        } else {
            return "Không được học bổng";
        }
    }
}


public class bai_5 { 
    public static void main(String[] args){
        Student student=new Student("Trần Thị Hường", 19, 3.75);
    }
}
