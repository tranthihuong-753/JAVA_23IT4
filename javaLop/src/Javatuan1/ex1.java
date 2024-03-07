/*
Bài 1. Chuyển code Python sau sang Java

while True:

    try:

        a = int(input("Nhập số nguyên a: "))

        b = int(input("Nhập số nguyên b: "))

        break

    except ValueError:

        print("Định dạng không hợp lệ. Vui lòng nhập lại.")

sum = a + b

difference = a – b

product = a * b

print("Tổng: ", sum)

print("Hiệu: ", difference)

print("Tích: ", product)

if b!=0:

    quotient_integer = a // b

    quotient_float = a / b

 

    print("Thương (số nguyên): ", quotient_integer)

    print("Thương số thực: ", quotient_float)
*/

package Javatuan1;
/*
import java.util.Scanner; // khai bao muon su dung lop Scanner tu goi java.util 

public class ex1 {

   public static void main(String[] args) 

  {

        Scanner scanner = new Scanner(System.in); 
int a, b;
while (true)
{
    try
    {
        System.out.print("Nhập số nguyên a: ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số nguyên b: ");
        b = Integer.parseInt(scanner.nextLine());
        break;
    }
    catch (NumberFormatException e)
    {
        System.out.println("Định dạng không hợp lệ. Vui lòng nhập lại.");
    }
    finally{
        // lenh se duoc thuc thi du co ngoai le hay khong 
    }
}// while

int sum = a + b;
int difference = a - b;
int product = a * b;

System.out.println("Tổng: " + sum); 
System.out.println("Hiệu: " + difference);
System.out.println("Tích: " + product);

if (b != 0)
{
    int quotient_integer = a / b;
    float quotient_float = (float) a / b;

    System.out.println("Thương (số nguyên): " + quotient_integer);
    System.out.println("Thương số thực: " + quotient_float);
}    }

}
*/

import java.util.Scanner;
public class ex1 {
   public static void main(String[] args) 
  {
        Scanner scanner = new Scanner(System.in);
int a, b;
while (true)
{
    try
    {
        System.out.print("Nhập số nguyên a: ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số nguyên b: ");
        b = Integer.parseInt(scanner.nextLine());
        break;
    }
    catch (NumberFormatException e)
    {
        System.out.println("Định dạng không hợp lệ. Vui lòng nhập lại.");
    }
}// while

int sum = a + b;
int difference = a - b;
int product = a * b;

System.out.println("Tổng: " + sum);
System.out.println("Hiệu: " + difference);
System.out.println("Tích: " + product);

if (b != 0)
{
    int quotient_integer = a / b;
    float quotient_float = (float) a / b;

    System.out.println("Thương (số nguyên): " + quotient_integer);
    System.out.println("Thương số thực: " + quotient_float);
}
    }//main
}// ex1