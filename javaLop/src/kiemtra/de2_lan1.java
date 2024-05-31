package kiemtra;

//lớp Person trừu tượng 

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;

class GUII{
    public GUII(List<?>[] list){
        JFrame jframe_big =new JFrame("EXP");
        jframe_big.setExtendedState(JFrame.MAXIMIZED_BOTH);//Để jframe hiện lên full màn hình
        
            JPanel jpanel_big=new JPanel(new GridLayout(2, 1));
                JPanel jpanel_small=new JPanel(new GridLayout(2, 1));
                    JPanel jp1=new JPanel();
                        JPanel jp_jtext=new JPanel();
                            JTextField jtext=new JTextField(30);
                            jp_jtext.add(jtext);
                        JPanel jp_jbutton_tk=new JPanel();
                            JButton jbutton_tk = new JButton("Tìm kiếm");
                            jp_jbutton_tk.add(jbutton_tk);
                        jp1.add(jp_jtext);
                        jp1.add(jp_jbutton_tk);
                    JPanel jp2=new JPanel();
                        JButton jbutton_thoat = new JButton("Thoát");
                        jp2.add(jbutton_thoat);
                    jpanel_small.add(jp1);
                    jpanel_small.add(jp2);

                    Object[][] obj=new Object[list.length][5];
                    int r=0;
                    List<BusinessStudent> listkd=(List<BusinessStudent>)list[0];
                    for(BusinessStudent x: listkd){
                        obj[r][0]=x.studentID;
                        obj[r][1]=x.name;
                        obj[r][2]=x.age;
                        obj[r][3]=x.gender;
                        obj[r][4]="Business";
                    }
                    List<ITStudent> listit=(List<ITStudent>)list[1];
                    for(ITStudent x: listit){
                        obj[r][0]=x.studentID;
                        obj[r][1]=x.name;
                        obj[r][2]=x.age;
                        obj[r][3]=x.gender;
                        obj[r][4]="IT";
                    }
                    List<LanguageStudent> listnn=(List<LanguageStudent>)list[2];
                    for(LanguageStudent x: listnn){
                        obj[r][0]=x.studentID;
                        obj[r][1]=x.name;
                        obj[r][2]=x.age;
                        obj[r][3]=x.gender;
                        obj[r][4]="Language";
                    }
                    String[] c={"Mã sinh viên", "Họ tên", "Tuổi", "Giới tính", "Nghành học"};
                    JTable table=new JTable(obj, c);    
                    table.setDefaultEditor(Object.class, null);  
                    JScrollPane jscroll=new JScrollPane(table);
            jpanel_big.add(jpanel_small);
            jpanel_big.add(jscroll);
            
            jframe_big.add(jpanel_big);
        jframe_big.setVisible(true);
        
        //nút Tìm kiếm 
        jbutton_tk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtID = jbutton_tk.getText();
                if(txtID.length()!=6 || txtID.matches("\\d+")==false){
                    JOptionPane.showMessageDialog(null, "Chú ý bạn đang tìm kiếm theo employeeID là một chuỗi số nguyên dương có độ dài là 6.","Lỗi", JOptionPane.ERROR_MESSAGE);
                }
                for (int row = 0; row < list.length; row++){
                    if(table.getValueAt(row, 0)!=null){
                        String employeeID = table.getValueAt(row, 0).toString();
                        if (employeeID.equals(txtID)) {
                            table.setRowSelectionInterval(row, row);
                        } else {
                            table.removeRowSelectionInterval(row, row);
                        }                        
                    }
                }
            }
        });          
        //ENTER 
        jbutton_tk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtID = jbutton_tk.getText();
                if(txtID.length()!=6 || txtID.matches("\\d+")==false){
                    JOptionPane.showMessageDialog(null, "Chú ý bạn đang tìm kiếm theo employeeID là một chuỗi số nguyên dương có độ dài là 6.","Lỗi", JOptionPane.ERROR_MESSAGE);
                }
                for (int row = 0; row < table.getRowCount(); row++) {
                    if (table.getValueAt(row, 0) != null) {
                        String employeeID = table.getValueAt(row, 0).toString();
                        if (employeeID.equals(txtID)) {
                            table.setRowSelectionInterval(row, row);
                        } else {
                            table.removeRowSelectionInterval(row, row);
                        }
                    }
                }
            }
        });          
        //Thoát 
        
        //Nếu list = null thì jpanel_1_1 ở dạng disable 
        int i=0;
        for(List<?> a:list){
            for(Object hh:a){
                if(hh instanceof BusinessStudent){
                    i++;
                }else if(hh instanceof ITStudent){
                    i++;
                }else if(hh instanceof LanguageStudent){
                    i++;
                }
            }
        }    
        if(i==0){
            jp1.setVisible(false);
        }else{
            System.out.println(i);
        }
        // Tạo DocumentFilter để kiểm tra và chặn các ký tự không phải số nguyên
        DocumentFilter numberFilter = new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
                if (text.matches("\\d+")) {
                    super.insertString(fb, offset, text, attr);
                }
            }
            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (text.matches("\\d+")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        };
        // Áp dụng DocumentFilter vào JTextField
        jtext.setDocument(new PlainDocument());
        ((PlainDocument) jtext.getDocument()).setDocumentFilter(numberFilter);    
    }
}

abstract class Person{
    public String name;
    public int age;
    public int gender;
    protected String bank_account;
    public Person(String name, int age, int gender, String bank_account){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.bank_account=bank_account;
    }
    public abstract String getRole();
}
//interface KPIEvaluator
interface KPIEvaluator{
    public double caculaterKPI();
}
//Student extends 2 
class Student extends Person implements KPIEvaluator{
    public String studentID;
    private float gpa;
    public float gpa(){
        return gpa;
    }
    private String specialization;
    public String specialization(){
        return specialization;
    }
    public Student(String name, int age, int gender, String bank_account, String studentID, float gpa, String specialization){
        super(name, age, gender, bank_account);
        this.studentID=studentID;
        this.gpa=gpa;
        this.specialization=specialization;
    }
    @Override
    public String getRole(){
        return "Student";
    }
    @Override
    public double caculaterKPI(){
        return 0.0;
    }
}
//ITStudent , BusinessStudent, LanguageStudent 
final class ITStudent extends Student{
    public ITStudent(String name, int age, int gender, String bank_account, String studentID, float gpa, String specialization){
        super(name, age, gender, bank_account, studentID, gpa, specialization);
    }
    @Override
    public String getRole(){
        return "IT";
    } 
    @Override
    public double caculaterKPI(){
        return 0.0;
    }
}
class BusinessStudent extends Student{
    public BusinessStudent(String name, int age, int gender, String bank_account, String studentID, float gpa, String specialization){
        super(name, age, gender, bank_account, studentID, gpa, specialization);
    }
    @Override
    public String getRole(){
        return "Business";
    }  
    @Override
    public double caculaterKPI(){
        return 0.0;
    }
}
class LanguageStudent extends Student{
    public LanguageStudent(String name, int age, int gender, String bank_account, String studentID, float gpa, String specialization){
        super(name, age, gender, bank_account, studentID, gpa, specialization);
    }
    @Override
    public String getRole(){
        return "Language";
    }   
    @Override
    public double caculaterKPI(){
        return 0.0;
    }
}

public class de2_lan1 {
    public static void toString(String name, int age, int gender, String bank_account, String studentID, float gpa, String specialization){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Bank_account: "+bank_account);
        System.out.println("ID: "+studentID);
        System.out.println("GPA: "+gpa);
        System.out.println("Specialization: "+specialization);
    }
    //Nhập vào số nguyên dương n, sai thì nhập lại 
    public static int hai_a(){
        Scanner scan=new Scanner(System.in);
        int number;
        while (true) {
            System.out.print("Nhập một số nguyên dương: ");
            if (scan.hasNextInt()) {
                number = scan.nextInt();
                if (number > 0) {
                    break; // Thoát khỏi vòng lặp nếu số nguyên dương
                }
            } else {
                scan.next(); // Đọc và bỏ qua đầu vào không phải số nguyên
            }
            System.out.println("!Chú ý không hợp lệ nhập vào số nguyên dương .");
        }
        return number;
    }       
    
    //Nhập mảng n đối tượng Student 
    public static List<?>[] bai_b(int n){
        Scanner scan=new Scanner(System.in);
        List<BusinessStudent> listkd=new ArrayList<>();
        List<ITStudent> listit=new ArrayList<>();
        List<LanguageStudent> listnn=new ArrayList<>();
        List<?>[] list = new List<?>[3];
        list[0]=listkd;
        list[1]=listit;
        list[2]=listnn;
        for(int i=0;i<n;i++){
            System.out.println("Nhập vào kd để tạo đối tượng BusinessStudent .\nNhập vào it để tạo đối tượng ITStudent .\nNhập vào nn để tạo đối tượng LanguageStudent .\nNhập vào # để kết thúc việc tạo đối tượng .");
            String exp=scan.nextLine();
            System.out.print("Name: ");
            String name=scan.nextLine();
            int age;
            while (true) {
                System.out.print("Age: ");
                if (scan.hasNextInt()) {
                    age = scan.nextInt();
                    if (age > 0) {
                        break; // Thoát khỏi vòng lặp nếu số nguyên dương
                    }
                } else {
                    scan.next(); // Đọc và bỏ qua đầu vào không phải số nguyên
                }
                System.out.println("! Chú ý age là một số nguyên dương.");
            }    
            int gender;
            while (true) {
                System.out.print("Gender(nam=1, nữ=0): ");
                if (scan.hasNextInt()) {
                    gender = scan.nextInt();
                    if (gender > 0) {
                        break; // Thoát khỏi vòng lặp nếu số nguyên dương
                    }
                } else {
                    scan.next(); // Đọc và bỏ qua đầu vào không phải số nguyên
                }
                System.out.println("! Chý ý giới tính được chỉ định nam là 1, nữ là 0.");
            }                
            System.out.print("Bank_account: ");
            String bank_account=scan.nextLine();
            System.out.print("ID: ");
            String studentID=scan.nextLine();
            float gpa;
            while (true) {
                System.out.print("GPA: ");
                if (scan.hasNextFloat()) {
                    gpa=scan.nextFloat();
                    if (gpa > 0) {
                        break; // Thoát khỏi vòng lặp nếu số nguyên dương
                    }
                } else {
                    scan.next(); // Đọc và bỏ qua đầu vào không phải số nguyên
                }
                System.out.println("! Chý ý đầu vào không hợp lệ .");
            }  
            System.out.print("Specialization: ");
            String specialization=scan.nextLine();            
            if("kd".equalsIgnoreCase(exp)){
                listkd.add(new BusinessStudent(name, age, gender, bank_account, studentID, gpa, specialization));
            }else if("it".equalsIgnoreCase(exp)){
                listit.add(new ITStudent(name, age, gender, bank_account, studentID, gpa, specialization));
            }else if("nn".equalsIgnoreCase(exp)){
                listnn.add(new LanguageStudent(name, age, gender, bank_account, studentID, gpa, specialization));
            }
        }
        return list;
    }
    public static void main(String[] args) {
        //1
        BusinessStudent st_bu=new BusinessStudent("NGUYEN VAN A", 18, 1, "001222222", "000000123", 3, "Business");
        System.out.println(st_bu.name+" "+st_bu.getRole()+" "+st_bu.caculaterKPI());
        ITStudent st_it=new ITStudent("NGUYEN THI C", 18, 0, "001235746", "000000121", 1, "IT");
        System.out.println(st_it.name+" "+st_it.getRole()+" "+st_it.caculaterKPI());
        LanguageStudent st_la=new LanguageStudent("NGUYEN THI B", 18, 0, "001235746", "000000124", 2, "IT");
        System.out.println(st_la.name+" "+st_la.getRole()+" "+st_la.caculaterKPI());
        
        int n=hai_a();
        List<?>[] list=bai_b(n);
        List<BusinessStudent> listkd=(List<BusinessStudent>)list[0];
        System.out.println("BusinessStudent: ");
        int i=1;
        for(BusinessStudent kd: listkd){
            System.out.println("    "+i);
            System.out.println("      Name: "+kd.name);
            System.out.println("      Age: "+kd.age);
            System.out.println("      Gender(: "+kd.gender);
            System.out.println("      Bank_account: "+kd.bank_account);
            System.out.println("      ID: "+kd.studentID);
            System.out.println("      GPA: "+kd.gpa());
            System.out.println("      Specialization: "+kd.specialization());  
            i++;
        }
        List<ITStudent> listit=(List<ITStudent>)list[1];
        System.out.println("ITStudent: ");
        i=1;
        for(ITStudent kd: listit){
            System.out.println("    "+i);
            System.out.println("      Name: "+kd.name);
            System.out.println("      Age: "+kd.age);
            System.out.println("      Gender(: "+kd.gender);
            System.out.println("      Bank_account: "+kd.bank_account);
            System.out.println("      ID: "+kd.studentID);
            System.out.println("      GPA: "+kd.gpa());
            System.out.println("      Specialization: "+kd.specialization());  
            i++;
        }
        List<LanguageStudent> listnn=(List<LanguageStudent>)list[2];
        System.out.println("LanguageStudent: ");
        i=1;
        for(LanguageStudent kd: listnn){
            System.out.println("    "+i);
            System.out.println("      Name: "+kd.name);
            System.out.println("      Age: "+kd.age);
            System.out.println("      Gender(: "+kd.gender);
            System.out.println("      Bank_account: "+kd.bank_account);
            System.out.println("      ID: "+kd.studentID);
            System.out.println("      GPA: "+kd.gpa());
            System.out.println("      Specialization: "+kd.specialization());  
            i++;
        }  
        System.out.println("Nhấn ENTER để chuyển sang giao diện GUI");
        Scanner scan=new Scanner(System.in);
        scan.nextLine(); 
        GUII a=new GUII(list);
    }   
}
