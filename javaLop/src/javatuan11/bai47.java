/*
Bài tập 47.
Viết chương trình Java :
a. Chạy mode Console nhấn Enter thì chuyển sang form (GUI; giao diện đồ họa)
b. Thiết kế 1 lớp form gọi là myFrame kế thừa từ lớp JFrame của Swing:
+Đặt tiêu đề form: Quản lý sinh viên
+Trên form có 
1 điều khiển label, 1 điều khiển nhập liệu TextField nhập mã sinh viên: chỉ nhập chữ số và độ dài đúng 6 kí tự
1 điều khiển label, 1 điều khiển nhập liệu TextField nhập họ và tên sinh viên.
1 điều khiển label, 1 điều khiển nhập liệu TextField nhập tuổi sinh viên.
1 điều khiển label, 1 điều khiển nhập liệu TextField nhập thông tin Giới tính.



+2 button: Button "Thêm", 1 button "Thoát"
1 điều khiển JTable hiện danh sách sinh viên
 */
package javatuan11;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;
import javax.swing.*;

class myFrame extends JFrame{
    public myFrame(){
        JFrame a=new JFrame("Quản lý sinh viên");
        a.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        Panel a1=new Panel();
        Label name_lb = new Label("Name");
        JTextField name_txt=new JTextField(30);
        a1.add(name_lb);
        a1.add(name_txt);
 
        Panel a2=new Panel();
        Label id_lb = new Label("ID");
        JTextField id_txt=new JTextField(30);
        a2.add(id_lb);
        a2.add(id_txt);
        
        Panel a3=new Panel();
        Label age_lb = new Label("AGE");
        JTextField age_txt=new JTextField(30);
        a3.add(age_lb);
        a3.add(age_txt);
        
        Panel a4=new Panel();
        Label sex_lb = new Label("SEX");
        JTextField sex_txt=new JTextField(30);
        a4.add(sex_lb);
        a4.add(sex_txt);
        
        Panel b=new Panel();
        JButton b1=new JButton("Thêm");
        JButton b2=new JButton("Thoát");
        b2.addMouseListener(new MouseAdapter() {
            @Override
            //Click nút thoát thì chương tình ngừng chạy và không hiện giao diện 
            public void mouseClicked(MouseEvent e) {
                a.setVisible(false);
            }
        });
        b.add(b1);
        b.add(b2);
        
        JPanel z=new JPanel();
        z.setLayout(new GridLayout(1, 1));
        
        z.add(a1);
        z.add(a2);
        z.add(a3);
        z.add(a4);
        
        z.add(b);
        
        JScrollPane x=new JScrollPane(z);
        a.add(x);
        
        a.setVisible(true);
    }
}

public class bai47 {
    public static void main(String[] args){
        System.out.println("Nhấn ENTER để chuyển sang giao diện đồ họa . ");
        Scanner a=new Scanner(System.in);
        a.nextLine();
        myFrame b=new myFrame();
    }
}
