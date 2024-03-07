/*
Viết chương trình nhập vào số nguyên dương n trong khoảng 1 đến 10. Nhập sai thì nhập lại. Hiển thị các ước số của n.

Yêu cầu: Viết 3 hàm

Hàm 1: nhập số nguyên dương n trong khoảng 1 đến 10. Trong thân hàm xử lý nếu nhập sai thì nhập lại.
Hàm 2: nhập vào số thực 4 byte (float). Trong thân hàm xử lý nếu nhập sai thì nhập lại.
Hàm 3. Nhập vào 1 mảng số thực 4 byte có n phần tử. Sử dụng hàm 2.
Trong hàm main() gọi hàm 1 nhập số nguyên n, gọi hàm 3 nhập mảng có n số float
 */
package javatuan5;

import java.util.*;
public class bai2 {    
    static int n;
    public static void main(String[] args){
        i();
        r();
        array();
    }
    //Hàm 1: nhập số nguyên dương n trong khoảng 1 đến 10. Trong thân hàm xử lý nếu nhập sai thì nhập lại.
    public static int i(){
        Scanner a=new Scanner(System.in);
        System.out.print("Số nguyên n = ");
        n=a.nextInt();
        while(n<1 || n>10){
            System.out.print("Sai . n = ");
            n=a.nextInt();
        }
        return n;
    }
    //Hàm 2: nhập vào số thực 4 byte (float). Trong thân hàm xử lý nếu nhập sai thì nhập lại.
    public static float r(){
        Scanner a=new Scanner(System.in);
        float x;
        while(true){
            try{
                System.out.print("float= ");
                x = Float.parseFloat(a.nextLine());
                break;
            }
            catch(NumberFormatException e){
                System.out.println("Định dạng không hợp lệ. Vui lòng nhập lại.");
            }     
        }
        return 0;
    }    
    //Hàm 3. Nhập vào 1 mảng số thực 4 byte có n phần tử. Sử dụng hàm 2.
    public static void array(){
        float[] array=new float[n];
        //Nhập
        for(float a:array){
            a=r();
        }
    }
}
