/*
Bài 2: 
Viết chương trình Java: 
Nhập vào 1 xâu kí tự st, tính số lớn nhất các kí tự 'a' xuất hiện liền nhau trong st. 
Cắt các kí tự  ' ' ( kí tự space) ở 2 đầu của xâu st. 
In kết quả lên màn hình.
*/ 
//nhận lớp Scanner đẻ nhận đầu vào 
import java.util.Scanner;

public class ex02{
    public static void main(String[] args){
        //tạo đối tượng a cho lớp Scanner 
        Scanner a=new Scanner(System.in);
        //nhập vào chuỗi 
        String b = a.nextLine();
        //loại bỏ kí tự ' ' ở 2 đầu    
        b=b.trim();
        //in ra màn hình 
        System.out.println(b); 
        //chuyển chuỗi thành mảng 
        char c[]=b.toCharArray();
        //đếm số lần a xuất hiện 
        int n=0;
        for(int i=0;i<c.length;i++){
            if(c[i]=='a'){
                n++;
            }
        }
        //tính số lớn nhất ký tự a xuất hiện liền nhau 
        
        //in ra màn hình 
        System.out.println("số lớn nhất ký tự a xuất hiện liền nhau : "+n);
    }
}