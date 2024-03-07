/*
bài 14:
Vận dụng cơ chế Overriding cho hàm introduce của lớp Person, Student, Teacher. Mô tả cách thực hiện.
Khai báo các hàm introduce hiển thị xâu kí tự minh họa.
Cài đặt code cho các hàm overriding.
Gọi thử nghiệm trong hàm main:
Mô phỏng runtime như sau:

- Tạo 1 vòng while vô hạn, trong vòng while tạo 1 số nguyên ngẫu nhiên, nếu số nguyên chia hết cho 2023 thì thoat khỏi while.

- Trong thân vòng while cũng khai báo 1 đối tượng Person lớp cao nhất, là ob.

- Cấp phát ob là đối tượng cụ thể Student hay Teacher tùy thuộc số nguyên ngẫu nhiên là chẵn hay lẻ.

- Gọi phương thức introduce của ob.
 */
package javatuanTET;

import java.util.Random;

class Pe{
    void introduce(){
        System.out.println("person");
    }
}

class Te extends Pe{
    @Override
    void introduce(){
        System.out.println("Teacher");
    }
}

class St extends Te{
    @Override
    void introduce(){
        System.out.println("Student");
    }
}

public class bai_14 {
    public static void main(String[] args){
        int a=1;
        while(a%2023!=0){
            Random b=new Random();
            a=b.nextInt();
            
            Pe ob;
            
            if(a%2==0){
                ob=new Te();
                ob.introduce();
            }else{
                ob=new St();
                ob.introduce();
            }
        }
    }
}
