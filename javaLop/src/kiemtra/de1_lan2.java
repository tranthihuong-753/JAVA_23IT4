package kiemtra;

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
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
//jpanel (jpanel(tìm kiếm+jtext) + jpanel(thoát)) --> 3 cai thang hang 
//jpanel (jpanel( jpanel(tìm kiếm)+ jpanel(jtext) ) + jpanel(thoát)) --> 2 tren 1 duoi 
//tao bang xong moi tao jscrollpane và tiện chèn luôn table vào thì mới được 
class GUI2{
    //Tự thêm nút xóa, điền id vào jtextfield --> hàng bị bôi đen , nếu nhấn vào nút xóa thì sẽ xóa id trong jtextfield, xóa hàng ý luôn 
    public GUI2(List<?>[] list){
        //Tạo JFrame 
        JFrame jframe_big=new JFrame("EXP");
        jframe_big.setExtendedState(JFrame.MAXIMIZED_BOTH);//Để jframe hiện lên full màn hình
        use_flatlaf();
        
            JPanel jpanel_big=new JPanel(new GridLayout(2, 1)); // Chia panel thành 2 hàng 1 cột 
                //JPanel chứa jtextfield, nút tìm kiếm, nút thoát 
                JPanel jpanel_sm=new JPanel();
                    //JPanel chứa jtextfield, nút tìm kiếm
                    JPanel jp1=new JPanel();
                        JTextField jt_employeeID=new JTextField(30);
                        JButton jb_employyID=new JButton("Tìm kiếm");
                        jp1.add(jt_employeeID);
                        jp1.add(jb_employyID);

                    JPanel jp2=new JPanel();
                        JButton jbutton_thoat=new JButton("Thoát");
                        jbutton_thoat.setLocation(50,50);
                        jp2.add(jbutton_thoat);
                    JPanel jp3=new JPanel();
                        JButton jbutton_xoa=new JButton("Xóa");
                        jp3.add(jbutton_xoa);
                    jpanel_sm.add(jp1);
                    jpanel_sm.add(jp2);
                    jpanel_sm.add(jp3);

                // Dữ liệu mảng 2 chiều đại diện cho các dòng và cột trong bảng
                Object[][] data= new Object[list.length][5];
                int r = 0; // Đổi tên biến row thành rowIndex
                List<Fresher2> listfresher=(List<Fresher2>) list[0];
                for(Fresher2 x: listfresher){
                    data[r][0] = x.employeeID;
                    data[r][1] = x.cardID;
                    data[r][2] = x.name;
                    data[r][3] = x.skill;
                    data[r][4] = "Fresher";   
                    r++;
                }      
                List<Junior_Senior2> listJunior_Senior=(List<Junior_Senior2>) list[1];
                for(Junior_Senior2 x: listJunior_Senior){
                    data[r][0] = x.employeeID;
                    data[r][1] = x.cardID;
                    data[r][2] = x.name;
                    data[r][3] = x.skill;
                    data[r][4] = "Junior_Senior";   
                    r++;
                }      
                List<Leader2> listLeader=(List<Leader2>) list[2];
                for(Leader2 x: listLeader){
                    data[r][0] = x.employeeID;
                    data[r][1] = x.cardID;
                    data[r][2] = x.name;
                    data[r][3] = x.skill;
                    data[r][4] = "Leader";   
                    r++;
                }  
                // Tên các cột
                String[] c = {"employeeID", "cardID", "name", "skill", "Vị trí"};
                // Tạo một bảng với dữ liệu và tên cột
                JTable table = new JTable(data, c);
                // Đặt phương pháp cho bảng không cho phép chỉnh sửa dữ liệu trực tiếp
                table.setDefaultEditor(Object.class, null);        
                // Thêm bảng vào JScrollPane để có thanh cuộn
                JScrollPane sc_table = new JScrollPane(table);      

            jpanel_big.add(jpanel_sm);
            jpanel_big.add(sc_table);

//            JScrollPane js=new JScrollPane(jpanel_big);
        jframe_big.add(jpanel_big);
        jframe_big.setVisible(true); 
        
        //Tìm kiến theo employyID , trùng thì bôi xanh 
        jb_employyID.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtID = jt_employeeID.getText();
                if(txtID.length()!=6 || txtID.matches("\\d+")==false){
                    JOptionPane.showMessageDialog(null, "! Chú ý bạn đang tìm kiếm theo employeeID là một chuỗi số nguyên dương có độ dài là 6.","Lỗi", JOptionPane.ERROR_MESSAGE);
                    txtID = txtID.replaceAll("\\D", ""); // Xóa các ký tự không phải số
                    jt_employeeID.setText(txtID); // Cập nhật lại giá trị trong JTextField
                    if (txtID.length() > 6) {
                        txtID = txtID.substring(0, 6); // Xóa bớt ký tự khi length > 6
                        jt_employeeID.setText(txtID); // Cập nhật lại giá trị trong JTextField
                    }                  
                }else{
                    jt_employeeID.setEditable(false);
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
        
        //jt_employyID có ENTER thì thực hiện tìm kiếm 
        jt_employeeID.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtID = jt_employeeID.getText();
                if(txtID.length()!=6 || txtID.matches("\\d+")==false){
                    JOptionPane.showMessageDialog(null, "! Chú ý bạn đang tìm kiếm theo employeeID là một chuỗi số nguyên dương có độ dài là 6.","Lỗi", JOptionPane.ERROR_MESSAGE);
                    txtID = txtID.replaceAll("\\D", ""); // Xóa các ký tự không phải số
                    jt_employeeID.setText(txtID); // Cập nhật lại giá trị trong JTextField
                    if (txtID.length() > 6) {
                        txtID = txtID.substring(0, 6); // Xóa bớt ký tự khi length > 6
                        jt_employeeID.setText(txtID); // Cập nhật lại giá trị trong JTextField
                    }                    
                }else{
                    jt_employeeID.setEditable(false);
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
        //Thoát và ngừng chạy chương trình 
        jbutton_thoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jframe_big.setVisible(false);
                System.exit(0);
            }
        });
        //Nếu list = null thì jp1 ở dạng disable 
        int i=0;
        for(List<?> a:list){
            for(Object obj:a){
                if(obj instanceof Leader2){
                    i++;
                }else if(obj instanceof Junior_Senior2){
                    i++;
                }else if(obj instanceof Fresher2){
                    i++;
                }
            }
        }    
        if(i==0){
            jp1.setVisible(false);
        }else{
            System.out.println(i);
        }
//        //JTextField jt_employeeID chỉ nhập chữ số và nhập đúng 6 ký tự 
//        jt_employeeID.addKeyListener(new KeyAdapter() {
//            int i=0;
//            @Override
//            public void keyTyped(KeyEvent e) {
//                char c = e.getKeyChar();
//                String s = String.valueOf(c);                
//                if(s.matches("\\d+")){
//                    i++;
//                    if(i==7){
//                        jt_employeeID.setEditable(false);
//                    }
//                }else{
//                    JOptionPane.showMessageDialog(null, "!! Chú ý bạn đang tìm kiếm theo employeeID là một chuỗi số nguyên dương có độ dài là 6.","Lỗi", JOptionPane.ERROR_MESSAGE);
//                }
//            }
//        });
        //nút xóa jbutton_xoa
        jbutton_xoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    model.removeRow(selectedRow);
                }
            }
        });        
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
        System.out.println("Đối tượng có skill = javacode là : ");
        int i=0;
       for(List<?> list:listmain){
           for(Object obj:list){
               if(obj instanceof Fresher2){
                    Fresher2 fr = (Fresher2) obj;
                    String skill = fr.skill;
                    if("javacode".equalsIgnoreCase(skill)){
                        System.out.println("    Fresher "+fr.employeeID);
                        i++;
                    }
               }else if(obj instanceof Junior_Senior2){
                    Junior_Senior2 js = (Junior_Senior2) obj;
                    String skill = js.skill;
                    if("javacode".equalsIgnoreCase(skill)){
                        System.out.println("    Junior_Senior "+js.employeeID);
                        i++;
                    }
               }else if(obj instanceof Leader2){
                    Leader2 le = (Leader2) obj;
                    String skill = le.skill;
                    if("javacode".equalsIgnoreCase(skill)){
                        System.out.println("    Junior_Senior "+le.employeeID);
                        i++;
                    } 
               }
           }
       }
       if(i==0){
           System.out.println("     Không tồn tại .");
       }
    }
    public static void main(String[] args) {
        List<?>[] listexp=hai_a();
        hai_b(listexp);
        //2c 
        List<Leader2> listLeader=(List<Leader2>) listexp[2];
        System.out.println("Số Leader đã nhập: "+listLeader.size());
        //3
        System.out.println("Nhấn ENTER để chuyển sang giao diện GUI");
        Scanner scan=new Scanner(System.in);
        scan.nextLine();   
        GUI2 gui=new GUI2(listexp);
    }
    //Hàm kiểm tra xem chuỗi đầu vào có phải toàn là STT 0-9 không , trả về true/false 
    public static boolean isInteger(String str) {
        return str.matches("\\d+");
    }
}