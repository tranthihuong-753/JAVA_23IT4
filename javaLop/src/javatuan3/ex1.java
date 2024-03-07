/*
Bài tập 1. Sử dụng nguyên lý encapsulation để tạo 1 lớp trong Java thực hiện tương tự như các hàm và biến được lập trong Python như sau:

def f1():

      global a

      a=1

def f2():

    print(a)

#gọi hàm

f1()

f2()
 */
package javatuan3;
public class ex1 {
    private static int a;
    
    public static void f1() {
        a = 1;
    }
    
    public static void f2() {
        System.out.println(a);
    }
    
    public static void main(String[] args) {
        f1();
        f2();
    }
}
