package kiemtra;
//nút tìm kiếm, xóa, thoát 
/*setE, GridLayout, JScrollPane, JOptionPane.showM, txt.su, table.getValueAt(row, 0).toString()*/
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

class GD{
    public GD(){
        JFrame jframe_big=new JFrame("EXP");
        jframe_big.setExtendedState(JFrame.MAXIMIZED_BOTH);
            JPanel jpanel_big=new JPanel(new GridLayout(2,1));
                JPanel jpanel_sm=new JPanel();
                    JPanel jp1=new JPanel();
                        JTextField jtext_tk=new JTextField(30);
                        JButton jbutton_tk=new JButton("Tìm kiếm");
                        jp1.add(jtext_tk);
                        jp1.add(jbutton_tk);
                    JPanel jp2=new JPanel();
                        JButton jbutton_xoa=new JButton("Xóa");
                        jp2.add(jbutton_xoa);
                    JPanel jp3=new JPanel();
                        JButton jbutton_thoat=new JButton("Thoát");
                        jp3.add(jbutton_thoat); 
                    jpanel_sm.add(jp1);
                    jpanel_sm.add(jp2);
                    jpanel_sm.add(jp3);
                //table
                    Object[][] obj=new Object[3][2];
    //                int r=0;
                    obj[0][0]="000001";
                    obj[0][1]="tran thi huong";
                    obj[1][0]="000002";
                    obj[1][1]="vu quang dung";

                    String[] c={"ID", "NAME"};
                    JTable table=new JTable(obj, c);
                JScrollPane js_table=new JScrollPane(table);
                jpanel_big.add(jpanel_sm);
                jpanel_big.add(js_table);
            jframe_big.add(jpanel_big);
        jframe_big.setVisible(true);
        //Thoát
        jbutton_thoat.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                jframe_big.setVisible(false);
                System.exit(0);
            }
        });
        //Tìm kiếm 
        jbutton_tk.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String txt=jtext_tk.getText();
                if(txt.length()!=6 || txt.matches("\\D+")){
                    JOptionPane.showMessageDialog(null, "! Chú ý tìm kiếm theo ID có độ dài 6.");
                    txt=txt.substring(0, 6);
                    jtext_tk.setText(txt);
                }
                for(int i=0;i<3;i++){
                    if(table.getValueAt(i, 0)!=null){
                        txt=table.getValueAt(i, 0).toString();
                        if(txt.equals(obj[i][0])){
                            table.setRowSelectionInterval(i, i);
                        }else{
                            table.removeRowSelectionInterval(i, i);
                        }                        
                    }
                }}
        });
    }
}
public class de1_lan3 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("NHẤN ENTER ĐỂ CHUYỂN SNG GIAO DIỆN.");
        a.nextLine();
        GD b=new GD();
    }
}
