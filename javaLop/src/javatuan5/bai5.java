/*
Viết hàm nhập vào 1 xâu kí tự chỉ gồm 4 chữ số, nhập sai thì nhập lại. Gọi hàm trong hàm main() và hiển thị xâu kết quả được nhập
 */
package javatuan5;

import java.util.*;

public class bai5 {
    public static void main(String[] args){
        a();
    }
    public static int a(){
        Scanner a=new Scanner(System.in);
        String b=a.nextLine();

        while(b.length()!=4 ){
            b=a.nextLine();
        }
        
        try {
            int number = Integer.parseInt(b); // Chuyển đổi chuỗi thành số nguyên
            System.out.println(b);
            return 1;
        } catch (NumberFormatException e) {
            System.out.println("Chuỗi không hợp lệ.");
            while(a()!=1){
                a();
            }
        }
        return 0;
    }
}
