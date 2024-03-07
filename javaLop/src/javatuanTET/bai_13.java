/*
bài 13: Thực hiện cơ chế overloading cho cộng 2 số nguyên, cộng 2 số thực 8 byte và cộng 2 xâu
 */
package javatuanTET;

class ADD{
    public int add(int a, int b){
        return a+b;
    }
    
    public double add(double a, double b){
        return a+b;
    }
    
    public String add(String a, String b){
        return a+b;
    }
}
public class bai_13 {
    public static void main(String[] args){
        ADD a=new ADD();
        int songuyen=a.add(1, 2);
        System.out.println(songuyen);
        double sothuc=a.add(1.1, 2.2);
        System.out.println(sothuc);
        String xaukitu=a.add("mua", "nang");
        System.out.println(xaukitu);
    }
}
