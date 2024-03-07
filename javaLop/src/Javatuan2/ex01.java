/*
Bài 1: 
Viết chương trình Java: Đọc vào từ bàn phím 1 xâu kí tự. 
Đếm số kí tự 'a' xuất hiện trong xâu. 
In kết quả lên màn hình.
*/

// nhận lớp scanner để lấy đầu vào  
import java.util.Scanner;
public class ex01{
    public static void main(String[] args){
        //tạo đối tượng a cho lớp scanner 
        Scanner a = new Scanner(System.in);
        //nhập vào chuỗi 
        System.out.print("Input: ");
        String b = a.nextLine();
        //chuyển từ chuỗi string sang mảng char 
        char[] c = b.toCharArray();
        //đếm số lần xuất hiẹn a trong chuỗi 
        int n=0;
        for(int i=0;i<c.length;i++){
            if(c[i]=='a'){
                n++;
            } 
        }
        //in ra số lần xuất hiện a trong mảng 
        System.out.println(n);
        //đóng lớp scanner giải phóng bộ nhớ 
        a.close();
    }
}

