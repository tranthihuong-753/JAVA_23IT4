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

class GUI{
    public GUI(List<Leader> listL){
        JFrame a=new JFrame("EXP");
        a.setExtendedState(JFrame.MAXIMIZED_BOTH);//Để jframe hiện lên full màn hình
        
        JPanel a1=new JPanel(new GridLayout(2, 1)); // Chia panel thành 2 hàng 1 cột 
        
        JPanel a111=new JPanel();
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
                a.setVisible(false);
            }
        });
        a12.add(out);
        a111.add(a11);
        a111.add(a12);
        // Dữ liệu mảng 2 chiều đại diện cho các dòng và cột trong bảng
        Object[][] data= new Object[listL.size()][5];
        
        int rowIndex = 0; // Đổi tên biến row thành rowIndex
        for (Leader x : listL) {
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
        
        a1.add(a111);
        a1.add(sc_table);
        
        JScrollPane js=new JScrollPane(a1);
        a.add(js);
        a.setVisible(true);
    }
}

interface KPI{
    public double kpi();
}
//Lớp trừu tượng
abstract class Staff implements KPI{
     //6 ký tự 
    protected String employeeID;
    //12 ký tự 
    public String cardID;
    public String name;
    public String skill;
    public Staff(String a, String b, String c, String d){
        this.employeeID=a;
        this.cardID=b;
        this.name=c;
        this.skill=d;
    }
    public abstract String getLevel();
}

class Fresher extends Staff{
    private double quality;

    //private nên phải chuyển sang public để sử dụng được ở class khác 
    public double quality(){
        return quality;
    }
    private boolean deadline;
    public boolean deadline(){
        return deadline;
    }
    public Fresher(String a, String b, String c, String d, double e, boolean f){
        //Phải kế thừa hàm constructor của cjlass Staff 
        super(a, b, c, d);
        this.quality=e;
        this.deadline=f;
    }
    //Ghi đè từ lớp abstract bỏ từ abstract đi 
    @Override
    public String getLevel(){
        return "Fresher";
    }
    @Override
    public double kpi(){        
        if(deadline==true){
            return quality*60 + 20;
        }
        return quality*60;
    }    
}

class Junior_Senior extends Fresher{
    private int exp_year;
    public int exp_year(){
        return exp_year;
    }
    public Junior_Senior(String a, String b, String c, String d, double e, boolean f, int g){
        super(a, b, c, d, e, f);
        this.exp_year=g;
    }
    @Override
    public String getLevel(){
        return "Junior/Senior";
    }
    @Override
    public double kpi(){
        if(deadline()==true){
            return quality()*90 + 15 ; 
        }
        return quality()*90 - 10;
    }
}

final class Leader extends Junior_Senior{
    public static int countLeader;
    private double project;   
    public double project(){
        return project;
    }
    public Leader(String a, String b, String c, String d, double e, boolean f, int g, int h, double i){
        super(a, b, c, d, e, f, g);
        this.countLeader=h;
        this.project=i;
    }
    @Override
    public String getLevel(){
        return "Leader";
    }
    @Override
    public double kpi(){
        if(deadline()==true){
            return quality()*60 + 20  + project*3; 
        }
        return quality()*60 - 30 + project*3;
    }
}

public class de1_lan1 {
    //2a 
    public static List<Leader> input(){
        Scanner scan=new Scanner(System.in);
        List<Leader> a=new ArrayList<>();
        while(true){
            //6 ký tự 
            System.out.print("employeeID: ");
            String employeeID=scan.nextLine();  
            if("#".equals(employeeID)){
                break;
            }
            while(employeeID.length()!=6){
                System.out.println("!!! employeeID có độ dài bằng 6");
                System.out.print("employeeID: ");
                employeeID=scan.nextLine();  
                if("#".equals(employeeID)){
                    break;
                }
            }
            if("#".equals(employeeID)){
                break;
            }
            //12 ký tự 
            System.out.print("cardID: ");
            String cardID=scan.nextLine();        
            while(cardID.length()!=12){
                System.out.println("!!! cardID có độ dài bằng 12");
                System.out.print("cardID: ");
                cardID=scan.nextLine();  
            }
            System.out.print("name :");
            String name=scan.nextLine();
            System.out.print("skill :");
            String skill=scan.nextLine();   
            System.out.print("quality :");
            double quality=scan.nextDouble();
            scan.nextLine();
            System.out.print("deadline :");
            boolean deadline=scan.nextBoolean();
            scan.nextLine();
            System.out.print("exp_year :");
            int exp_year=scan.nextInt();
            scan.nextLine();
            System.out.print("countLeader :");
            int countLeader=scan.nextInt();
            scan.nextLine();
            System.out.print("project :");
            double project=scan.nextDouble();
            scan.nextLine();
            a.add( new Leader(employeeID, cardID, name, skill, quality, deadline, exp_year, countLeader, project));
        }
        return a;        
    }
    //2b
    public static void output(List<Leader> a){
        System.out.println("Đối tượng có kỹ năng là JavaCode là : ");
        int i=0;
        for(Leader x:a){
            if("JavaCode".equalsIgnoreCase(x.skill)){
                i++;
                System.out.println("    Đối tượng "+i);
                System.out.println("employeeID: "+x.employeeID+"\ncardID :"+x.cardID+"\nname :"+x.name+"quality :"+x.quality()+"\ndeadline :"+x.deadline()+"\nexp_year :"+x.exp_year()+"\ncountLeader :"+x.countLeader+"\nproject :"+x.project());
            }
        }        
    }
    public static void main(String[] args) {
        /*
        //6 ký tự 
        System.out.print("employeeID: ");
        String employeeID=scan.nextLine();        
        while(employeeID.length()!=6){
            System.out.println("!!! employeeID có độ dài bằng 6");
            System.out.print("employeeID: ");
            employeeID=scan.nextLine();  
        }
        //12 ký tự 
        System.out.print("cardID: ");
        String cardID=scan.nextLine();        
        while(cardID.length()!=12){
            System.out.println("!!! cardID có độ dài bằng 12");
            System.out.print("cardID: ");
            cardID=scan.nextLine();  
        }
        System.out.print("name :");
        String name=scan.nextLine();
        System.out.print("skill :");
        String skill=scan.nextLine();   
        System.out.print("quality :");
        double quality=scan.nextDouble();
        scan.nextLine();
        System.out.print("deadline :");
        boolean deadline=scan.nextBoolean();
        scan.nextLine();
        System.out.print("exp_year :");
        int exp_year=scan.nextInt();
        scan.nextLine();
        System.out.print("countLeader :");
        int countLeader=scan.nextInt();
        scan.nextLine();
        System.out.print("project :");
        double project=scan.nextDouble();
        scan.nextLine();
   
        Fresher a=new Fresher(employeeID, cardID, name, skill, quality, deadline);
        System.out.println(a.getLevel()+"\n"+a.kpi());
        Junior_Senior b=new Junior_Senior(employeeID, cardID, name, skill, quality, deadline, exp_year);
        System.out.println(b.getLevel()+"\n"+b.kpi());
        Leader c=new Leader(employeeID, cardID, name, skill, quality, deadline, exp_year, countLeader, project);
        System.out.println(c.getLevel()+"\n"+c.kpi());
        */ 
        
        //2c 
        List<Leader> m = input();
        /*
        output(m);
        System.out.println("Số Leader là :"+m.size());
        */
        
        //3a
//        System.out.println("Nhấn ENTER dể chuyển sang giao diện GUI .");
//        Scanner b=new Scanner(System.in);
//        //Chờ đợi mòn mỏi người dùng nhấn ENTER 
//        b.nextLine();
        GUI x=new GUI(m); 
        
    }
}
