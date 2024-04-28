package ktra09042024;

import java.awt.GridLayout;
import java.awt.Panel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

abstract class Person{
    public String name;
    public int age;
    public int gender; 
    protected String bank_account;
    public Person(String a, int b, int c, String d){
        this.name=a;
        this.age=b;
        this.gender=c;
        this.bank_account=d;
    }
    abstract String getRole();
}

interface KPIEvaluator{
    public double caculateKPI();   
}

class Studentt extends Person implements KPIEvaluator{
    public String ID;
    float GPA;
    String sln;//ngành
    public Studentt(String a, int b, int c, String d, String e, float f, String g){
        super( a,  b,  c,  d);  
        this.ID=e;
        this.GPA=f;
        this.sln=g;
    }    
    @Override
    String getRole(){
        return "Student";
    }
    @Override
    public double caculateKPI(){
        return GPA;
    }
    public void toStringg(){
        
    }
}

class ITStudent extends Studentt{
    public ITStudent(String a, int b, int c, String d, String e, float f){
        super(a,b,c,d,e,f,"IT"); 
    }
    @Override
    String getRole(){
        System.out.println("ID");
        return "ID";
    }
    @Override
    public double caculateKPI(){
        return GPA;
    }
    @Override
    public void toStringg(){
        System.out.println("name : "+name);
        System.out.println("age : "+age);
        System.out.println("gender : "+gender);
        System.out.println("bank_account : "+bank_account);
        System.out.println("ID : "+ID);
        System.out.println("GPA : "+GPA);
        System.out.println("sln : "+getRole());
    }
}

class BusinessStudent extends Studentt{
    public BusinessStudent(String a, int b, int c, String d, String e, float f){
        super(a,b,c,d,e,f,"Business"); 
    }
    @Override
    String getRole(){
        System.out.println("Business");
        return "Business";
    }
    @Override
    public double caculateKPI(){
        return GPA;
    }
    @Override
    public void toStringg(){
        System.out.println("name : "+name);
        System.out.println("age : "+age);
        System.out.println("gender : "+gender);
        System.out.println("bank_account : "+bank_account);
        System.out.println("ID : "+ID);
        System.out.println("GPA : "+GPA);
        System.out.println("sln : "+getRole());
    }
}

class LanguageStudent extends Studentt{
    public LanguageStudent(String a, int b, int c, String d, String e, float f){
        super(a,b,c,d,e,f,"Language"); 
    }  
    @Override
    String getRole(){
        System.out.println("Language");
        return "Language";
    }
    @Override
    public double caculateKPI(){
        return GPA;
    }
    @Override
    public void toStringg(){
        System.out.println("name : "+name);
        System.out.println("age : "+age);
        System.out.println("gender : "+gender);
        System.out.println("bank_account : "+bank_account);
        System.out.println("ID : "+ID);
        System.out.println("GPA : "+GPA);
        System.out.println("sln : "+getRole());
    }
}

class form{
    public form(){
       JFrame a=new JFrame();
        a.setExtendedState(JFrame.MAXIMIZED_BOTH);//Để jframe hiện lên full màn hình
        
        JPanel a1=new JPanel(new GridLayout(1, 1)); // Chia panel thành 2 hàng 1 cột 
        a1.setLocation(500, 500);

        JPanel b1=new JPanel();
        b1.setLocation(50, 50);
        JTextField b21=new JTextField(30);
        JTextField b22=new JTextField("ID");
        b1.add(b22);
        b1.add(b21);
        a1.add(b1); 
        
        JPanel b2=new JPanel();
        b2.setLocation(50, 50);
        JButton b211=new JButton("Thoát");
        b1.add(b211);        
        a1.add(b2);
                
        JScrollPane a3=new JScrollPane(a1);
        a.add(a3);
        a.setVisible(true);        
    }
}
public class bai1 {
    public static void main(String[] args) {
        /*
        ITStudent it=new ITStudent("N V A", 18, 1, "MB001", "A001", 3);
        it.toString();
        System.out.println("Vai trò: "+it.getRole()); 
        System.out.println("KPI: "+it.caculateKPI());
        BusinessStudent bn=new BusinessStudent("N V B", 19, 1, "MB002", "A002", 2);
        bn.toString();
        System.out.println("Vai trò: "+bn.getRole());
        System.out.println("KPI: "+bn.caculateKPI());
        LanguageStudent lg=new LanguageStudent("N V B", 19, 1, "MB002", "A002", 2);
        lg.toString();   
        System.out.println("Vai trò: "+lg.getRole());
        System.out.println("KPI: "+lg.caculateKPI());
        */
        
        /*
        Scanner a=new Scanner(System.in);
        System.out.print("Nhập vào số lượng sinh viên : ");
        int n=a.nextInt();
        a.nextLine();
        List<Studentt> b=new ArrayList<>();
        for(int i=0;i<n;i++){
           System.out.print("name : ") ;
           String name=a.nextLine();
           System.out.print("age : ");
           int age=a.nextInt();
           a.nextLine();
           System.out.print("gender : ");
           int gender=a.nextInt(); 
           a.nextLine();
           System.out.print("bank_account : ");
           String bank_account=a.nextLine(); 
           System.out.print("ID : ");
           String ID=a.nextLine();
           System.out.print("GPA : ");
           float GPA=a.nextFloat();
           a.nextLine();
           System.out.print("sln : ");;
           String sln=a.nextLine();//ngành
           b.add(new Studentt(name,age,gender,bank_account,ID,GPA,sln));
           System.out.print("\n");
           
        
        }
    */
        System.out.println("Nhấn ENTER dể chuyển sang giao diện GUI .");
        Scanner b=new Scanner(System.in);
        //Chờ đợi mòn mỏi người dùng nhấn ENTER 
        b.nextLine();
        form a=new form();
    }
}
