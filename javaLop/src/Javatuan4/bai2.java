/*
Bài 2. Viết chương trình Java console:

1. Viết lệnh trong hàm main() khai báo biến n, biến x kiểu số nguyên 4 byte có dấu, kiểu số thực 4 byte.
Nhập vào từ bàn phím giá trị của n và x. Nếu nhập sai thì nhập lại, có chặn exception khi nhập. In ra giá trị của n và x.

2. Tách các lệnh nhập n và x ở hàm main trên bằng cách đưa vào 2 hàm
+ Hàm nhập số nguyên

+ Hàm nhập số thực

Gọi 2 hàm trên trong hàm main() để nhập n và x, trước đó che đi các khối lệnh nhập n và x ở câu a.

c. Viết 2 dòng lệnh khai báo a là biến mảng 1 chiều các số thực 32bit và cấp phát a lưu trữ được tối đa 10 phần từ.
Viết lệnh kiểm tra khi cấp phát không được đối tượng mảng khi cấp phát 1 mảng có số phần tử rất lớn.
e. Vì sao cần khai báo public static trước tên hàm?
g. Viết 1 mâu hàm rỗng (chưa có code chi tiết) hàm nhập vào từ bàn phím 1 mảng 1 chiều các số thực 32 bit biết số phần tử n.
code chi tiết hàm, có sử dụng hàm nhập số thực để nhập từng phần tử của mảng.
k.Gọi hàm "nhập vào từ bàn phím 1 mảng 1 chiều các số thực 32 bit" trong hàm main()
cách xác định số phần tử của 1 biến mẩng 1 chiều?
Viết lệnh for hiển thị mảng được nhập`q.
 */
package Javatuan4;

import java.util.*;

public class bai2 {
    public static void main(String[] args){
        /*
        Scanner a=new Scanner(System.in);
        int n;
        float x;
        System.out.print("Input n: ");
        if(a.hasNextInt()){
            n=a.nextInt();
        }else{
            System.out.println("Sai kiểu dữ liệu. ");
        }
        System.out.print("Input x: ");
        if(a.hasNextInt()){
            x=a.nextFloat();
        }else{
            System.out.println("Sai kiểu dữ liệu. ");
        }        
        */
        /*
        double a[];
        a=new double[10];
        if(a.length>10){
            System.out.println("Cấp phát không được đối tượng mảng khi cấp phát 1 mảng có số phần tử rất lớn.");
        }
        */
        Scanner a=new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử của mảng: ");
        int n=a.nextInt();
        inputDouble(n);
    }
    //Hàm nhập số nguyên 
    public int z(){
        Scanner a=new Scanner(System.in);
        int n;
        System.out.print("Input n: ");
        if(a.hasNextInt()){
            n=a.nextInt();
            return n;
        }else{
            System.out.println("Sai kiểu dữ liệu. ");
        }  
        return 0;
    }
    //Hàm nhập số thực 
    public float r(){
        Scanner a=new Scanner(System.in);
        float x;
        System.out.print("Input x: ");
        if(a.hasNextInt()){
            x=a.nextFloat();
            return x;
        }else{
            System.out.println("Sai kiểu dữ liệu. ");
        }  
        return 0;
    }
    //Hàm nhập vào từ bàn phím 1 mảng 1 chiều các số thực 32 bit biết số phần tử n
    //phải để public static thì hàm main mới truy cập được ??? 

    public static void inputDouble(int n){
        Scanner m=new Scanner(System.in);
        Double[] a=new Double[n];
        System.out.print("Nhập vào giá trị các phần tử của mảng có "+n+" phần tử : ");
        for(Double b: a){
            b=m.nextDouble();
        }
        System.out.print("Giá trị các phần tử của mảng là : ");
        for(Double b: a){
            System.out.print(b+" ");
        }
    }
}
