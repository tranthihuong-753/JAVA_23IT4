/*
Bài 7.  
Viết một chương trình Java console 
nhận vào một chuỗi kí tự từ người dùng và đảo ngược chuỗi đó. 
In chuỗi đảo ngược lên màn hình.
*/
package Javatuan1;
import java.util.Scanner;
/*
public class ex7{
    public static void main(String[] args){
        // nhap vao chuoi ky tu 
        System.out.print("nhap cao chuoi ky tu can dao nguoc: ");
        Scanner scanner = new Scanner(System.in);
        String m=scanner.next();
        
//        char[] a=new char[100];
//        a=scanner.next().charAt(0);
        
        //tim do dai chuoi 
        int length=m.length();
        
        //dao nguoc chuoi 
        char[] a=m.toCharArray();
        int start=0;
        int end=length-1;
        while(start<end){
            char b=a[start];
            a[start]=a[end];
            a[end]=b;
            start ++;
            end --;
        }
        System.out.println(a);
    }
}
*/

public class ex7 {
        public static void main(String[] args) {
       // TODO code application logic here
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi kí tự: ");
        String input = scanner.nextLine();
        // Đảo ngược chuỗi
        String reversed = reverseString(input);

        System.out.println("Chuỗi đảo ngược: " + reversed);
    }
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();

        // Duyệt chuỗi từ cuối lên đầu và thêm các ký tự vào reversed
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
   }
}