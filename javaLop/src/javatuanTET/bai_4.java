/*
Viết chương trình Java console:
a. Viết lệnh trong hàm main() 
khai báo biến n kiểu số nguyên 4 byte có dấu, biến x kiểu số thực 4 byte.
Nhập vào từ bàn phím giá trị của n và x. Nếu nhập sai thì nhập lại, có chặn exception khi nhập. In ra giá trị của n và x.
b. Tách các lệnh nhập n và x ở hàm main trên bằng cách đưa vào 2 hàm
+ Hàm nhập số nguyên
+ Hàm nhập số thực
Gọi 2 hàm trên trong hàm main() để nhập n và x, trước đó che đi các khối lệnh nhập n và x ở câu a.
c. Viết 2 dòng lệnh khai báo a là biến mảng 1 chiều các số thực 32bit và cấp phát a lưu trữ được tối đa 10 phần từ.
d. Viết lệnh kiểm tra khi cấp phát không được dối tượng mảng khi cấp phát 1mảng có số phần tử rất lớn.
e. Vì sao cần khai báo public static trước tên hàm?
g. Viết 1 mâu hàm rỗng (chưa có code chi tiết) hàm nhập vào từ bàn phím 1 mảng 1 chiều các số thực 32 bit biết số phần tử n.
h. code chi tiết hàm, có sử dụng hàm nhập số thực để nhập từng phần tử của mảng.
k. Gọi hàm "nhập vào từ bàn phím 1 mảng 1 chiều các số thực 32 bit" trong hàm main()
l. cách xác định số phần tử của 1 biến mẩng 1 chiều?
l. Viết lệnh for hiển thị mảng được nhập.
 */
/*
//a, b
package javatuanTET;

import java.util.Scanner;
//lớp dùng để sử lý ngoại lệ 
import java.util.InputMismatchException;

public class bai_4 {
    //hàm nhập n
    private static int N(){
        Scanner a= new Scanner(System.in);
        int n;
        do{
            try{
                n=a.nextInt();
                break;
            //b là biến được khai báo cho đối tượng ngoại lệ 
            }catch(InputMismatchException b){
                System.out.println("không hợp lệ");
            }
        }while(true);
        return n;
    }
    //hàm nhập x
        private static float F(){
        Scanner a= new Scanner(System.in);
        float x;
        do{
            try{
                x=a.nextInt();
                break;
            //b là biến được khai báo cho đối tượng ngoại lệ 
            }catch(InputMismatchException b){
                System.out.println("không hợp lệ");
            }
        }while(true);
        return x;
    }
    //hàm main
    public static void main(String[] args){
        int n=N();
        float x=F();
        System.out.println(n+"; "+x);
    }
}
*/

//c
/*
c. Viết 2 dòng lệnh khai báo a là biến mảng 1 chiều các số thực 32bit và cấp phát a lưu trữ được tối đa 10 phần từ.
d. Viết lệnh kiểm tra khi cấp phát không được dối tượng mảng khi cấp phát1 mảng có số phần tử rất lớn.
e. Vì sao cần khai báo public static trước tên hàm?
g. Viết 1 mâu hàm rỗng (chưa có code chi tiết) hàm nhập vào từ bàn phím 1 mảng 1 chiều các số thực 32 bit biết số phần tử n.
h. code chi tiết hàm, có sử dụng hàm nhập số thực để nhập từng phần tử của mảng.
k. Gọi hàm "nhập vào từ bàn phím 1 mảng 1 chiều các số thực 32 bit" trong hàm main()
l. cách xác định số phần tử của 1 biến mẩng 1 chiều?
l. Viết lệnh for hiển thị mảng được nhập.
*/

