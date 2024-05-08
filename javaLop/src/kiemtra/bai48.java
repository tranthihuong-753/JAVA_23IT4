package kiemtra;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

class MyFrame {
    public MyFrame(){
        JFrame jframe_big=new JFrame("Quan ly sinh vien");
        jframe_big.setExtendedState(JFrame.MAXIMIZED_BOTH);//Để jframe hiện lên full màn hình
            JPanel jpanel_big = new JPanel(new GridLayout(2,1));
                JPanel jpanel_sm=new JPanel();
                    JPanel jp1=new JPanel();
                        JTextField jtext_tk=new JTextField(30);
                        JButton jbutton_tk=new JButton("Tim kiem");
                        jp1.add(jtext_tk);
                        jp1.add(jbutton_tk);
                    JPanel jp2=new JPanel();
                        JButton jbutton_xoa=new JButton("Xoa");
                        jp2.add(jbutton_xoa);
                    jpanel_sm.add(jp1);
                    jpanel_sm.add(jp2);
               //table
                    Object[][] obj=new Object[3][2];
                    obj[0][0]="001";
                    obj[0][1]="TRAN THI HUONG";
                    obj[1][0]="002";
                    obj[1][1]="TRAN THI THU";
                    String[] c={"ID", "NAME"};
                    JTable table = new JTable(obj, c);
                    JScrollPane jsc_table=new JScrollPane(table);
                jpanel_big.add(jpanel_sm);
                jpanel_big.add(jsc_table);
            jframe_big.add(jpanel_big);
        jframe_big.setVisible(true);
    
        //JTextField jtext_tk chỉ nhập chữ số và nhập đúng 6 ký tự 
        jtext_tk.addKeyListener(new KeyAdapter() {
            int i=0;
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                String s = String.valueOf(c);                
                if(s.matches("\\d+")){
                    i++;
                    if(i==7){
                        jtext_tk.setEditable(false);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Chú ý bạn đang tìm kiếm theo ID là một chuỗi số nguyên dương có độ dài là 6.","Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
public class bai48 {
    public static void main(String[] args) {
        System.out.println("NHAN ENTER DE CHUYEN SANG GIAO DIEN.");
        Scanner a=new Scanner(System.in);
        a.nextLine();
        MyFrame b=new MyFrame();
    }
}
