/*
Bài 6. 
Viết một chương trình hiển thị bảng mã ASCII.
*/

package Javatuan1;
/*
public class ex6{
    public static void main(String[] args){
        for(int i=0;i<=127;i++){
            System.out.println(i+"  "+(char)i);
        }
    }
}
*/

import java.util.Scanner;

public class ex6 {

      public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bảng mã ASCII:");

       // In tiêu đề cột
        System.out.format("%-10s %-10s %-10s %-10s%n", "Decimal", "Hex", "Octal", "Character");

        // In dòng ngăn cách
        System.out.println("----------------------------------------");

        // In các ký tự ASCII từ 32 đến 126
        for (int i = 32; i <= 126; i++) {
            System.out.format("%-10d %-10s %-10s %-10c%n", i, Integer.toHexString(i), Integer.toOctalString(i), (char) i);
        }
        scanner.close();
    }
 
}