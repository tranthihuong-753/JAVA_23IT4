package kiemtra;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

//interface KPI 
interface KPI2{
    public double kpi();
}
//abstract class Staff 
abstract class Staff2 {
    protected String employeeID;
    public String cardID;
    public String name;
    public String skill;
    public Staff2(String employeeID, String cardID, String name, String skill){
        this.employeeID=employeeID;
        this.cardID=cardID;
        this.name=name;
        this.skill=skill;
    }
    public abstract String getLevel();
}
//class Fresher 
class Fresher2 extends Staff2 implements KPI{
    private double quality;
    public double quality(){
        return quality;
    }
    private boolean deadline;
    public boolean deadline(){
        return deadline;
    }
    public Fresher2(String employeeID, String cardID, String name, String skill, double quality, boolean deadline){
        super(employeeID, cardID, name, skill);
        this.quality=quality;
        this.deadline=deadline;
    }
    @Override
    public String getLevel(){
        return "Fresher";
    }
    @Override
    public double kpi(){
        if(deadline==true){
            return quality*60+20;
        }
        return quality*60;
    }
} 
//class Junior_Senior2
class Junior_Senior2 extends Fresher2{
    private int exp_year;
    public int exp_year(){
        return exp_year;
    }
    public Junior_Senior2(String employeeID, String cardID, String name, String skill, double quality, boolean deadline, int exp_year){
        super(employeeID, cardID, name, skill, quality, deadline);
        this.exp_year=exp_year;
    }
    @Override
    public String getLevel(){
        return "Junior/Senior";
    }
    @Override
    public double kpi(){
        if(deadline()==true){
            return quality()*90+15;
        }
        return quality()*90-10;
    }    
}
//final class Leader2 không cho kế thừa 
final class Leader2 extends Junior_Senior2{
    public static int countLeder=0;
    private double project;
    public double project(){
        return project;
    }
    public Leader2(String employeeID, String cardID, String name, String skill, double quality, boolean deadline, int exp_year, double project){
        super(employeeID, cardID, name, skill, quality, deadline, exp_year);
        this.project=project;
    }
    @Override
    public String getLevel(){
        return "Leader";
    }
    @Override
    public double kpi(){
        if(deadline()==true){
            return quality()*60+20+project*3;
        }
        return quality()*60-10+project*3;
    }     
}

class GUI2{
    public GUI2(List<Leader2> listL){
        //Tạo JFrame 
        JFrame jfmain=new JFrame("EXP");
        jfmain.setExtendedState(JFrame.MAXIMIZED_BOTH);//Để jframe hiện lên full màn hình
        use_flatlaf();
        
        JPanel jpmain=new JPanel(new GridLayout(2, 1)); // Chia panel thành 2 hàng 1 cột 
        
        JPanel jp1=new JPanel();
            JPanel a11=new JPanel();
            JTextField jt_employyID=new JTextField(30);
            JButton jb_employyID=new JButton("Tìm kiếm");

            a11.add(jt_employyID);
            a11.add(jb_employyID);
        
            JPanel a12=new JPanel();
            JButton out=new JButton("Thoát");
            out.setLocation(50,50);
            out.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jfmain.setVisible(false);
                }
            });
            a12.add(out);
        jp1.add(a11);
        jp1.add(a12);
        
        // Dữ liệu mảng 2 chiều đại diện cho các dòng và cột trong bảng
        Object[][] data= new Object[listL.size()][5];
        
        int rowIndex = 0; // Đổi tên biến row thành rowIndex
        for (Leader2 x : listL) {
            data[rowIndex][0] = x.employeeID;
            data[rowIndex][1] = x.cardID;
            data[rowIndex][2] = x.name;
            data[rowIndex][3] = x.skill;
            data[rowIndex][4] = "?";
            rowIndex++;
        }
        // Tên các cột
        String[] columnNames = {"employeeID", "cardID", "name", "skill", "Vị trí ?? "};
        // Tạo một bảng với dữ liệu và tên cột
        JTable table = new JTable(data, columnNames);
        // Đặt phương pháp cho bảng không cho phép chỉnh sửa dữ liệu trực tiếp
        table.setDefaultEditor(Object.class, null);        
        // Thêm bảng vào JScrollPane để có thanh cuộn
        JScrollPane sc_table = new JScrollPane(table);      
        
        //Tìm kiến theo employyID , trùng thì bôi xanh 
        jb_employyID.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchValue = jt_employyID.getText();

                for (int row = 0; row < table.getRowCount(); row++) {
                    String employeeID = table.getValueAt(row, 0).toString();
                    if (employeeID.equals(searchValue)) {
                        table.addRowSelectionInterval(row, row);
                    } else {
                        table.removeRowSelectionInterval(row, row);
                    }
                }
            }
        });
        
        jpmain.add(jp1);
        jpmain.add(sc_table);
        
        JScrollPane js=new JScrollPane(jpmain);
        jfmain.add(js);
        jfmain.setVisible(true);        
    }
    //Hàm sử dụng flatlaf 
    public static void use_flatlaf(){
        try {
            UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }          
    }    
}

public class de1_lan2{
    //Hàm nhập 3 loại list 
    public static List<?>[] hai_a(){
        Scanner scan=new Scanner(System.in);
        List<Fresher2> listfr =new ArrayList<>();
        List<Junior_Senior2> listjs=new ArrayList<>();
        List<Leader2> listle=new ArrayList<>(); 
        List<?>[] listhehe=new List<?>[3];
        listhehe[0]=listfr;
        listhehe[1]=listjs;
        listhehe[2]=listle;
        while(true){
            System.out.println("Nhập vào fr để tạo đối tượng Fresher \nNhập vào js để tạo đối tượng Junior_Senior\nNhập vào le để tạo đối tượng Leader\nNhập vào # để ngừng tạo đối tượng");
            String z=scan.nextLine();
            if("fr".equalsIgnoreCase(z)){
                //Nhập vào employeeID có length=6 
                System.out.print("Mã nhân viên employeeID: ");
                String employeeID=scan.nextLine();
                while(employeeID.length()!=6){
                    System.out.println("! Chú ý employeeID có độ dài là 6.");
                    System.out.print("Mã nhân viên employeeID: ");
                    employeeID=scan.nextLine();
                }
                //Nhập vào cardID length=12 && full STT 0-9 
                System.out.print("Số CCCD cardID: ");
                String cardID=scan.nextLine();
                while(cardID.length()!=12 || !isInteger(cardID) ){
                    System.out.println("! Chú ý cardID là dãy số nguyên có độ dài 12.");
                    System.out.print("Số CCCD cardID: ");
                    cardID=scan.nextLine();
                }
                //Nhập vào name 
                System.out.print("name: ");
                String name=scan.nextLine();  
                //Nhập vào skill 
                System.out.print("Kỹ năng nghề nghiệp skill: ");
                String skill=scan.nextLine();   
                //Nhập vào quality giá trị từ 0.0 - 1.0 
                System.out.print("Chất lượng code quality(0.0 - 1.0): ");
                double quality=scan.nextDouble();  
                scan.nextLine();
                while(quality<0.0 || quality>1.0){
                    System.out.println("! Chú ý quality có giá trị từ 0.0 đến 1.0 .");
                    System.out.print("Chất lượng code quality: ");
                    quality=scan.nextDouble();  
                    scan.nextLine();                  
                }
                //Nhập vào deadline 
                System.out.print("Mức độ hoàn thành đúng tiến độ deadline (true/false): ");
                boolean deadline=scan.nextBoolean();
                scan.nextLine();
                while(deadline!= true && deadline!=false){
                    System.out.println("! Chú ý deadline phải là true/false .");
                    System.out.print("Mức độ hoàn thành đúng tiến độ deadline (true/false): ");
                    deadline=scan.nextBoolean();
                    scan.nextLine();                    
                }
                listfr.add(new Fresher2(employeeID, cardID, name, skill, quality, deadline));
            }
            if("js".equalsIgnoreCase(z)){
                //Nhập vào employeeID có length=6 
                System.out.print("Mã nhân viên employeeID: ");
                String employeeID=scan.nextLine();
                while(employeeID.length()!=6){
                    System.out.println("! Chú ý employeeID có độ dài là 6.");
                    System.out.print("Mã nhân viên employeeID: ");
                    employeeID=scan.nextLine();
                }
                //Nhập vào cardID length=12 && full STT 0-9 
                System.out.print("Số CCCD cardID: ");
                String cardID=scan.nextLine();
                while(cardID.length()!=12 || !isInteger(cardID) ){
                    System.out.println("! Chú ý cardID là dãy số nguyên có độ dài 12.");
                    System.out.print("Số CCCD cardID: ");
                    cardID=scan.nextLine();
                }
                //Nhập vào name 
                System.out.print("name: ");
                String name=scan.nextLine();  
                //Nhập vào skill 
                System.out.print("Kỹ năng nghề nghiệp skill: ");
                String skill=scan.nextLine();   
                //Nhập vào quality giá trị từ 0.0 - 1.0 
                System.out.print("Chất lượng code quality(0.0 - 1.0): ");
                double quality=scan.nextDouble();  
                scan.nextLine();
                while(quality<0.0 || quality>1.0){
                    System.out.println("! Chú ý quality có giá trị từ 0.0 đến 1.0 .");
                    System.out.print("Chất lượng code quality: ");
                    quality=scan.nextDouble();  
                    scan.nextLine();                  
                }
                //Nhập vào deadline 
                System.out.print("Mức độ hoàn thành đúng tiến độ deadline (true/false): ");
                boolean deadline=scan.nextBoolean();
                scan.nextLine();
                while(deadline!= true && deadline!=false){
                    System.out.println("! Chú ý deadline phải là true/false .");
                    System.out.print("Mức độ hoàn thành đúng tiến độ deadline (true/false): ");
                    deadline=scan.nextBoolean();
                    scan.nextLine();                    
                }
                //Nhập vào exp_year 
                int exp_year;
                while (true) {
                    System.out.print("Số năm kinh nghiệm exp_year: ");
                    if (scan.hasNextInt()) {                      
                        exp_year = scan.nextInt();
                        scan.nextLine(); // Đọc ký tự thừa sau khi nhập số
                if (exp_year >= 0) {
                    break; // Thoát vòng lặp nếu nhập số thành công và thỏa mãn điều kiện
                } else {
                    System.out.println("! Chú ý exp_year phải là số nguyên lớn hơn -1 .");
                }
                    } else {
                        System.out.println("! Chú ý exp_year phải là số nguyên lớn hơn -1 .");
                        scan.nextLine(); // Đọc ký tự thừa sau khi nhập dữ liệu không hợp lệ
                    }
                }
                listjs.add(new Junior_Senior2(employeeID, cardID, name, skill, quality, deadline, exp_year));
            }
            if("le".equalsIgnoreCase(z)){
                //Nhập vào employeeID có length=6 
                System.out.print("Mã nhân viên employeeID: ");
                String employeeID=scan.nextLine();
                while(employeeID.length()!=6){
                    System.out.println("! Chú ý employeeID có độ dài là 6.");
                    System.out.print("Mã nhân viên employeeID: ");
                    employeeID=scan.nextLine();
                }
                //Nhập vào cardID length=12 && full STT 0-9 
                System.out.print("Số CCCD cardID: ");
                String cardID=scan.nextLine();
                while(cardID.length()!=12 || !isInteger(cardID) ){
                    System.out.println("! Chú ý cardID là dãy số nguyên có độ dài 12.");
                    System.out.print("Số CCCD cardID: ");
                    cardID=scan.nextLine();
                }
                //Nhập vào name 
                System.out.print("name: ");
                String name=scan.nextLine();  
                //Nhập vào skill 
                System.out.print("Kỹ năng nghề nghiệp skill: ");
                String skill=scan.nextLine();   
                //Nhập vào quality giá trị từ 0.0 - 1.0 
                System.out.print("Chất lượng code quality(0.0 - 1.0): ");
                double quality=scan.nextDouble();  
                scan.nextLine();
                while(quality<0.0 || quality>1.0){
                    System.out.println("! Chú ý quality có giá trị từ 0.0 đến 1.0 .");
                    System.out.print("Chất lượng code quality: ");
                    quality=scan.nextDouble();  
                    scan.nextLine();                  
                }
                //Nhập vào deadline 
                System.out.print("Mức độ hoàn thành đúng tiến độ deadline (true/false): ");
                boolean deadline=scan.nextBoolean();
                scan.nextLine();
                while(deadline!= true && deadline!=false){
                    System.out.println("! Chú ý deadline phải là true/false .");
                    System.out.print("Mức độ hoàn thành đúng tiến độ deadline (true/false): ");
                    deadline=scan.nextBoolean();
                    scan.nextLine();                    
                }
                //Nhập vào exp_year 
                int exp_year;
                while (true) {
                    System.out.print("Số năm kinh nghiệm exp_year: ");
                    if (scan.hasNextInt()) {                      
                        exp_year = scan.nextInt();
                        scan.nextLine(); // Đọc ký tự thừa sau khi nhập số
                if (exp_year >= 0) {
                    break; // Thoát vòng lặp nếu nhập số thành công và thỏa mãn điều kiện
                } else {
                    System.out.println("! Chú ý exp_year phải là số nguyên lớn hơn -1 .");
                }
                    } else {
                        System.out.println("! Chú ý exp_year phải là số nguyên lớn hơn -1 .");
                        scan.nextLine(); // Đọc ký tự thừa sau khi nhập dữ liệu không hợp lệ
                    }
                }
                //Nhập vào project 
                System.out.print("Điểm quản lý dự án project 1.0-10.0 : ");
                double project = scan.nextDouble();
                scan.nextLine();
                while(project<1.0 || project>10.0){
                    System.out.println("! Chú ý project có giá trị từ 1.0 đến 10.0 .");
                    System.out.print("Điểm quản lý dự án project 1.0-10.0 : ");
                    project = scan.nextDouble();
                    scan.nextLine();                    
                }
                listle.add(new Leader2(employeeID, cardID, name, skill, quality, deadline, exp_year, project));                         
            }
            if("#".equalsIgnoreCase(z)){
                break; 
            }
        } 
        return listhehe;
    }
    
    //Hàm hiển thị đối tượng(ID) có kỹ năng javacode 
    public static void hai_b(List<?>[] listmain){
        System.out.println("Đối tượng có javacode là : ");
        int i=0;
       for(List<?> list:listmain){
           for(Object obj:list){
               if(obj instanceof Fresher2){
                    Fresher2 fr = (Fresher2) obj;
                    String skill = fr.skill;
                    if("javacode".equalsIgnoreCase(skill)){
                        System.out.println("\bFresher "+fr.employeeID);
                        i++;
                    }
               }else if(obj instanceof Junior_Senior2){
                    Junior_Senior2 js = (Junior_Senior2) obj;
                    String skill = js.skill;
                    if("javacode".equalsIgnoreCase(skill)){
                        System.out.println("\bJunior_Senior "+js.employeeID);
                        i++;
                    }
               }else if(obj instanceof Leader2){
                    Leader2 le = (Leader2) obj;
                    String skill = le.skill;
                    if("javacode".equalsIgnoreCase(skill)){
                        System.out.println("\bJunior_Senior "+le.employeeID);
                        i++;
                    } 
               }
           }
       }
       if(i==0){
           System.out.println("\bKhông tồn tại .");
       }
    }
    public static void main(String[] args) {
        
        List<?>[] listexp=hai_a();
        hai_b(listexp);
        //2c 
        int i=0;
        for(List<?> a:listexp){
            for(Object obj:a){
                if(obj instanceof Leader2){
                    System.out.println(i);
                    i++;
                }
            }
        }
        System.out.println("Số Leader đã nhập: "+i);

        //3
        System.out.println("Nhấn ENTER để chuyển sang giao diện GUI");
        Scanner scan=new Scanner(System.in);
        scan.nextLine();
        List<Leader2> listL=new ArrayList<>();
        for(List<?> a:listexp){
            for(Object obj:a){
                if(obj instanceof Leader2){
                    Leader2 le=(Leader2) obj;
                    listL.add(new Leader2(le.employeeID, le.cardID, le.name, le.skill, le.quality(), le.deadline(), le.exp_year(), le.project()));
                }
            }
        }        
        GUI2 gui=new GUI2(listL);
//        gui.use_flatlaf();
    }
    //Hàm kiểm tra xem chuỗi đầu vào có phải toàn là STT 0-9 không , trả về true/false 
    public static boolean isInteger(String str) {
        return str.matches("\\d+");
    }
}