/*
Bài 8. Viết một chương trình Java console 
cho phép người dùng nhập thông tin của n sinh viên 
gồm tên và điểm, ở đó n được nhập từ bàn phím.
Sau đó, hiển thị thông tin của từng sinh viên 
và tính điểm trung bình của cả lớp. 
Sử dụng lớp (class) để lưu trữ thông tin của sinh viên.
*/

package Javatuan1;
/*
import java.util.Scanner;
public class ex8{
    public static class Student{
    private String name;
    private float point;
    //tao lop Student voi 2 truong dữ lieu 
    public Student(String name, float point){
        this.name=name;
        this.point=point;
    }
    public String getName(){
        return name;
    }
    public float getPoint(){
        return point;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPoint(float point){
        this.point=point;
    }
    }
    
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //nhap so luong sinh vien 
        System.out.println("nhap vao so luong sinh vien :");
        int n=scanner.nextInt();
        
        //Tao mang std de nhap thong tin sinh vien 
        Student[] std=new Student[n];
        for(int i=0;i<n;i++){
            System.out.println("thong tin sinh vien thu "+(i+1));
            System.out.print("\tName: ");
            scanner.nextLine(); // xoa ky tu ket thuc dong con sot lai 
            String name = scanner.nextLine();
            System.out.print("\tPoint: ");
            float point=scanner.nextFloat();
            std[i]=new Student(name, point);
        }
        
        //hien thi thong tin sinh vien
        System.out.println("HIEN THI: ");
        for(int i=0;i<n;i++){
            Student student=std[i];
            System.out.println("\nthong tin sinh vien thu "+(i+1));
            System.out.print("\tNAME: ");
            System.out.print(student.getName());
            System.out.print("\n\tPOINT: ");
            System.out.print(student.getPoint());
            scanner.nextLine();
        }
        //Tinh diem trung binh cua ca lop 
        float sum=0;
        for(int i=0;i<n;i++){
            Student students=std[i];
            sum+=students.getPoint();
        }
        System.out.println("Trung binh cong diem cua ca lop la: "+(float)(sum/n));
    }
}
*/

import java.util.Scanner;
public class ex8 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự newline sau khi nhập số lượng sinh viên

        Student[] students = new Student[n];

        // Nhập thông tin của từng sinh viên
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1));
            System.out.print("Tên: ");
            String name = scanner.nextLine();
            System.out.print("Điểm: ");
            double score = scanner.nextDouble();
            scanner.nextLine(); // Đọc ký tự newline sau khi nhập điểm

            students[i] = new Student(name, score);
        }
        System.out.println("Thông tin của từng sinh viên:");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ " + (i + 1) + ":");
            System.out.println("Tên: " + students[i].getName());
            System.out.println("Điểm: " + students[i].getScore());
            System.out.println();
        }
        double averageScore = calculateAverageScore(students);
        System.out.println("Điểm trung bình của cả lớp: " + averageScore);
    }
    public static double calculateAverageScore(Student[] students) {
        double totalScore = 0;
        for (Student student : students) {
            totalScore += student.getScore();
        }
        return totalScore / students.length;
    }
}
class Student {
    private String name;
    private double score;
    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
   }
}