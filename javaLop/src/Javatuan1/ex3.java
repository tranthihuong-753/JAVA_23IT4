/*
bài 3:
Viết một chương trình Java mode console nhận vào một mảng số nguyên có dấu 
kích thước 4 byte từ người dùng 
tính tổng của các số trong mảng. In kết quả lên màn hình
*/
package Javatuan1;
/*
import java.util.Scanner;
public class ex3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // nhap vao so phan tu cua mang
        System.out.print("Nhap vao so luong phan tu cua mang : ");
        int n=scanner.nextInt();
        
        //nhap vao gia tri cua mang 
        int[] array=new int[n];
        System.out.print("Nhap vao phan tu cua mang : ");
        for(int i=0;i<n;i++){
            array[i]=scanner.nextInt();
        }
        //tinh tong cac so trong mang 
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=array[i];
        }
        System.out.println("Tong cac gia tri cua mang :"+sum);
    }
}
*/
/*
// dùng mảng dộng nhưng khi ngừng lại phải nhập vào 0.0 
import java.util.ArrayList;^
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        // tạo mảng động 
        ArrayList<Double> a=new ArrayList<Double>();
        
        Scanner b=new Scanner(System.in);
        double sum=0.0;
        while(true){
            double x=b.nextDouble();
            if(x==0.0){
                break;
            }
            a.add(x);
        }
        for(double m: a){
            sum+=m;
        }
        System.out.println(sum);
    }
}
*/
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử trong mảng: ");
       int n = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập số thứ " + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        System.out.println("Tổng các số trong mảng là: " + sum);
    }
}
