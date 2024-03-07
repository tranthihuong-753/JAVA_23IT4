/*
Bài 4. 
Viết một chương trình Java console nhận vào một mảng số thực 
kích thước 4 byte 
từ người dùng 
tìm giá trị lớn nhất và nhỏ nhất trong mảng. In kết quả lên màn hình.
*/
package Javatuan1;
/*
import java.util.Scanner;
public class ex4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao so luong phan tu cua mang ");
        int n=scanner.nextInt();
        
        System.out.println("nhap vao phan tu cua mang : ");
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }
        
        //tim va in ra GTLN
        int max=a[0];
        for(int i=1;i<n;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("MAX: "+max);
        //tim va in ra GTNN
        int min=a[0];
        for(int i=1;i<n;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("MIN: "+min);        
    }
}
*/
import java.util.Scanner;

public class ex4 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] numbers = new float[4];
        System.out.println("Nhập 04 số thực trong mảng:");
       for (int i = 0; i < numbers.length; i++) {
            System.out.print("Số thực thứ " + (i + 1) + ": ");
           numbers[i] = scanner.nextFloat();
       }

        float min = numbers[0];
       float max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
           if (numbers[i] < min) {
               min = numbers[i];
           }
           if (numbers[i] > max) {
               max = numbers[i];
           }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng: " + min);
       System.out.println("Giá trị lớn nhất trong mảng: " + max);
        scanner.close();
   }
}