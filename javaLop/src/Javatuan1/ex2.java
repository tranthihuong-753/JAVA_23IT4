/*
Bài 2.  Viết một chương trình Java model console nhận vào một số nguyên không dấu 
kích thước 4 byte 
từ người dùng 
đảo ngược các chữ số của số đó. In kết quả lên màn hình
*/
package Javatuan1;
/*
//a co the la 00...01234567891
//4 byte tu -2 147 483 648 den 2 147 483 648
import java.util.Scanner;
public class ex2{
    public static void main(String[] args){
        //nhap so vao 
        Scanner scanner = new Scanner (System.in);
        int a;
        while(true){ //
            try{
                System.out.print("Nhap vao so nguyen khong dau: ");
                a=Integer.parseInt(scanner.nextLine()); // i
                break;
            }catch(NumberFormatException e){
                System.out.println("khong hop le, nhap lai"); //l 
            }
        }
        //loai bo so 0 sau cung cua a 
        if(a%10==0){
            while(a%10==0){
                a=a/10;
            }
        }
        //dao nguoc chu so do va in ra man hinh
        System.out.print("gia tri cua so nguyen sau khi dao : ");
        while(a>0){
            System.out.print(a%10);
            a/=10;
        }
        System.out.print("\n");
    } 
}
*/

/*
import java.util.Scanner;
class Ex{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int x=a.nextInt();
        // đảm bảo sô tự nhiên x bắt đầu và kết thúc bằng số từ 1-9 
        while(x%10==0){
            x/=10;
        }
        //đảo ngược 
        while(x!=0){
            System.out.print(x%10);
            x/=10;
        }
        System.out.print("\n");
        a.close();
    }
}

*/
import java.util.Scanner;

public class ex2 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Nhập một số nguyên không dấu kích thước 4 byte: ");
        int number = Integer.parseUnsignedInt(scanner.nextLine());

        int reversedNumber = 0;

        while (number != 0) {
           reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
      }
        System.out.println("Số sau khi đảo ngược là: " + reversedNumber);
    }
}