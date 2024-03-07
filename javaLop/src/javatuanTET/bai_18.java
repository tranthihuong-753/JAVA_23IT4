/*
Khai báo lớp sinh viên gồm các biến đều là public: 
mã sinh viên: kiểu String, họ và đệm kiểu String, tên kiểu String, tuổi kiểu int, 
Giới tính kiểu String, điểm trung bình kiểu float

Trong lớp chứa hàm main():
Viết hàm public static nhập 1 danh sách sinh viên từ bàn phím và trả về danh sách đã nhập.

+ kết thúc nhập khi mã sinh viên nhập là "#"

+ hàm trả lại danh sách sinh viên.

+ Gọi hàm trong hàm main() để kiểm tra. Duyệt danh sách sinh viên và hiển thị lên màn hình.

Trong lớp chứa hàm main():

Viết hàm public static Sắp xếp danh sách tăng dần của điểm trung bình và hiển thị.

Viết hàm public static Sắp xếp danh sách giảm dần của điểm trung bình và hiển thị.

Viết hàm public static Đếm số sinh viên có điểm trung bình > 5.0 và hiển thị.

Viết hàm public static Hiển thị sinh viên đầu tiên trong danh sách có điểm > 9.0.

Viết hàm public static Hiển thị  sinh viên có điểm trung bình lớn nhất, nhỏ nhất.

Viết hàm public static Đảo ngược danh sách sinh viên để tạo ra 1 danh sách khác và hiển thị danh sách kết quả.

Viết hàm public static Ghi danh sách sinh viên lên 1 file .txt

Viết hàm public static Ghi danh sách sinh viên lên 1 file .csv

Viết hàm public static Ghi danh sách sinh viên lên 1 file .json.

Viết hàm public static Hiển thị danh sách sinh viên lên 1 grid trong chế độ đồ họa sử dụng Java swing.
 */
package javatuanTET;

import java.util.Scanner;

class Student_1{
    public String ID;
    public String name;
    public int age;
    public String sex;
    public float point;
    public Student_1(String a, String b, int c, String d, float e){
        this.ID=a;
        this.name=b;
        this.age=c;
        this.sex=d;
        this.point=e;
    }
}
public class bai_18 {
    public static void main(String[] args){
        //Nhập vào số lượng sinh viên 
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        //Tạo mảng để chứa danh sách sinh viên
        Student_1[] b=new Student_1[n];
        //Nhập vào thông tin sinh viên 
        for(int i=0;i<n;i++){
            String ID_ =a.nextLine();
            if(ID_.equals('#')){
                break;
            }
            String name_ =a.nextLine();
            a.nextLine();
            int age_ =a.nextInt();
            String sex_ =a.nextLine();
            a.nextLine();
            float point_ =a.nextFloat();
            Student_1 c=new Student_1(ID_, name_, age_, sex_, point_);
            b[i]=c;
        }
        //Trả về danh sách đã nhập 
        for(int i=0;i<n;i++){
            System.out.println("    "+(i+1)+"/n"+b[i].ID+"/n"+b[i].name+"/n"+b[i].age+"/n"+b[i].sex+"/n"+b[i].point);
        }
    }
}
