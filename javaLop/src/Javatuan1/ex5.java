/*
Bài 5. 
Viết một chương trình Java console nhận vào một mảng số thực kích thước 8 byte 
từ người dùng và tính trung bình cộng của các số trong mảng, 
có xử lý exception. 
In kết quả lên màn hình
*/
package Javatuan1;
/*
import java.util.Scanner;
public class ex5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao so luong phan tu cua mang :");
        int n=scanner.nextInt();
        
        double[] a=new double[n];
        System.out.print("nhap vao phan tu cua mang : ");
        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }
        
        //tinh tong cac phan tu trong mang
        double sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        System.out.println("Trung binh cong cua cac phan tu trong mang la :"+(double)sum/n);
    }
}
*/

import java.util.Scanner;

public class ex5 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[4];
        System.out.println("Nhập 4 số thực trong mảng:");
        for (int i = 0; i < numbers.length; i++) {
           System.out.print("Số thực thứ " + (i + 1) + ": ");
           try {
               numbers[i] = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Không hợp lệ. Vui lòng nhập lại số thực.");
                i--; // Quay lại nhập lại giá trị tại vị trí hiện tại
                scanner.nextLine(); // Đọc và bỏ qua dữ liệu nhập không hợp lệ
            }
        }
        double sum = 0;
        for (double number : numbers) {
            sum += number;
       }
        double average = sum / numbers.length;
        System.out.println("Trung bình cộng của các số trong mảng: " + average);
        scanner.close();
    }
}