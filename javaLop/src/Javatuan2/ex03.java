/*
Bài 3: Viết chương trình thực hiện các yêu cầu sau:

- Khai báo 1 lớp Student có: thuộc tính: name, sex, birth, studentID kiểu String, phạm vi là private;

- Khai báo và code 1 hàm constructer không đối;

- Khai báo và code 1 hàm constructer có đối để gán biến thành phần của lớp;

- Khai báo và code các hàm set/get cho các biến private của lớp.

- Trong lớp chứa main(), trong hàm main() khai báo và cấp phát các đối tượng student thích hợp. 
Hiển thị thông tin các đối tượng Student lên console.

*/
public class ex03 {
    public static class Student {
        private String name;
        private String sex;
        private String birth;
        private String studentID;

        // Hàm constructor không đối số
        public Student() {
        }

        // Hàm constructor có đối số để gán giá trị cho các biến thành phần
        public Student(String name, String sex, String birth, String studentID) {
            this.name = name;
            this.sex = sex;
            this.birth = birth;
            this.studentID = studentID;
        }

        // Các phương thức getter và setter
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getBirth() {
            return birth;
        }

        public void setBirth(String birth) {
            this.birth = birth;
        }

        public String getStudentID() {
            return studentID;
        }

        public void setStudentID(String studentID) {
            this.studentID = studentID;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("A");
        student1.setSex("0");
        student1.setBirth("11/01/1990");
        student1.setStudentID("001");

        Student student2 = new Student("B", "1", "10/01/2001", "002");

        System.out.println("Student information 1:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Sex: " + student1.getSex());
        System.out.println("Birth: " + student1.getBirth());
        System.out.println("Student ID: " + student1.getStudentID());
        System.out.println();

        System.out.println("Student information 2:");
        System.out.println("Name: " + student2.getName());
        System.out.println("Sex: " + student2.getSex());
        System.out.println("Birth: " + student2.getBirth());
        System.out.println("Student ID: " + student2.getStudentID());
    }
}