/*
Hãy tạo một lớp BankAccount để quản lý thông tin tài khoản ngân hàng gồm các thuộc tính: 
số tài khoản (accountNumber), tên chủ tài khoản (accountHolder), số dư hiện tại (balance). 
Sử dụng đóng gói thông qua việc triển khai các phương thức getter và setter cho các thuộc tính. 
Bài tập yêu cầu cài đặt các hàm sau đây:

Constructor có tham số để khởi tạo đối tượng BankAccount với các giá trị ban đầu.

Getter và setter cho các thuộc tính accountNumber, accountHolder và balance.

Phương thức deposit(amount) để thực hiện nạp tiền vào tài khoản.

Phương thức withdraw(amount) để thực hiện rút tiền từ tài khoản.
 */
package javatuanTET;

//lớp BankAccount
class BankAccount{
    private int accountNumber;
    private String accountHolder;
    private double balance;
    public int setAccountNumber(){
        return accountNumber;
    }
    public void getAccountNumber(int a){
        this.accountNumber=a;
    }
    public String setAccountHolder(){
        return accountHolder;
    }
    public void setAccountHolder(String a){
        this.accountHolder=a;
    }
    public double setBalance(){
        return balance;
    }
    public void getBalance(double a){
        this.balance=a;
    }
    //hàm Constructor
    public BankAccount(int a, String b, double c){
        this.accountNumber=a;
        this.accountHolder=b;
        this.balance=c;
    }

    //Phương thức deposit(amount)
    public void deposit(double amount){
        balance=balance+amount;
    }
    //Phương thức withdraw
    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("0");
        }else{
            balance=balance-amount;
        }
    }        
}
public class bai_6 {
    public static void main(String[] args){
        BankAccount a= new BankAccount(000123, "TRAN THI HUONG", 000);
        a.deposit(500);
        a.withdraw(1000);
    }
}
