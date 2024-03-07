/*
bài 16 : 
Hãy tạo một lớp BankAccount để quản lý thông tin tài khoản ngân hàng gồm các thuộc tính: 
số tài khoản (accountNumber), tên chủ tài khoản (accountHolder), số dư hiện tại (balance). 
Sử dụng đóng gói thông qua việc triển khai các phương thức getter và setter cho các thuộc tính. 
Bài tập yêu cầu cài đặt các hàm sau đây:
Constructor có tham số để khởi tạo đối tượng BankAccount với các giá trị ban đầu.
Getter và setter cho các thuộc tính accountNumber, accountHolder và balance.
Phương thức deposit(amount) để thực hiện nạp tiền vào tài khoản.Phương thức withdraw(amount) để thực hiện rút tiền từ tài khoản.
 */
package javatuan6;

import java.util.*;

class BankAccount{
    private int accountNumber;
    private String accountHolder;
    private double balance;
    public void getaccN(int a){
        this.accountNumber=a;
    }
    public int setaccN(){
        return accountNumber;
    }
    public void getaccH(String a){
        this.accountHolder=a;
    }
    public String setaccH(){
        return accountHolder;
    }
    public void getbalance(double a){
        this.balance=a;
    }
    public double setbalance(){
        return balance;
    }   
    public void a(int a, String b, double c){
        getaccN(a);
        getaccH(b);
        getbalance(c);
    }
    //nạp
    public void deposit(double a){
        if(balance>=0){
            System.out.println("Thực hiện nạp thành công. Số dư hiện tại là : "+(balance+a));
        }else{
            System.out.println("Hiện tại số dư là "+balance+". Nạp "+a+". Số dư sau khi thay đổi là "+(balance+a));
        }
    }
    //rút 
    public void withdraw(double a){
        if(balance<=0){
            System.out.println("Số dư hiện tại không dủ để rút .");
        }else{
            if(balance>=a){
                System.out.println("Rút thành công. Số dư sau khi thay đổi là "+(balance-a));
            }else{
                System.out.println("Số dư hiện tại không dủ để rút. Bạn nghèo lắm . Số dư còn lại là "+balance+".");
            }
        }
    }
}

public class bai16 {
    public static void main(String[] args){
        BankAccount a= new BankAccount();
        Scanner b=new Scanner(System.in);
        
        System.out.print("accountNumber: ");
        int c=b.nextInt();
        b.nextLine();
        System.out.print("accountNumber: ");
        String d=b.nextLine();
        System.out.print("balance: ");
        double e=b.nextDouble();
        b.nextLine();
        a.a(c,d,e);
        
        System.out.println("Bạn muốn nạp thêm tiền hay rút ? Nếu muốn nạp thì nhập vào nap , Nếu muốn rút thì nhập vào rut .");
        String x=b.nextLine();
        do{
            if(x.equals("nap")){
                System.out.print("Nhập vào số tiền muốn nạp: ");
                double f=b.nextDouble();
                a.deposit(f); 
            }else{
                System.out.print("Nhập vào số tiền muốn rút: ");
                double g=b.nextDouble();
                a.withdraw(g);            
            }
            System.out.println("Bạn muốn nạp thêm tiền hay rút nữa không ? Nếu muốn nạp thì nhập vào nap , Nếu muốn rút thì nhập vào rut .");
            b.nextLine();
            x=b.nextLine();
        }while(x.equals("nap")||x.equals("rut"));        
    }
}