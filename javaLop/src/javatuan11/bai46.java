/*
Bài tập 46.
Viết chương trình Java :
a. Chạy mode Console nhấn Enter thì chuyển sang form (GUI; giao diện đồ họa)
b. Thiết kế 1 lớp form gọi là myFrame kế thừa từ lớp JFrame của Swing:
+Đặt tiêu đề form
+Trên form có 1 điều khiển nhập liệu TextField (C# gọi là TextBox)
+2 button: Button "Hiển thị giá trị", 1 button "Thoát"
c. Lập trình kiểm soát sự kiện:
Nhấn button "Thoát" thì kết thúc chương trình
Nhấn button "Hiển thị giá trị" thì hiển thị 1 hộp thoại có nội dung text của TextField trên.
d. Lập trình kiểm soát valid của Text Field:
+Chỉ cho phép nhập kí tự số ở trường Text Field.
+Chỉ cho phép nhập kí tự số hoặc chữ cái ở Text Field.
e. Lập trình kiểm soát khi nhấn Enter Text Field:
Khi đang soạn thảo, nhấn Enter thì hiện lên hộp thoại có nội dung của TextField.
 */
package javatuan11;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

class form1 extends JFrame{
    public form1(){
        JFrame frm1= new JFrame("Form ví dụ");
        frm1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        JPanel a=new JPanel();
        a.setLocation(500, 500);
        TextField a1=new TextField(30);//30 là độ rộng 
        a.add(a1);
        a1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // Kiểm tra xem phím đã được nhấn là Enter không
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    // Lấy nội dung từ JTextField
                    String text = a1.getText();
                    // Hiển thị hộp thoại với nội dung của JTextField
                    JOptionPane.showMessageDialog(null, "Nội dung của TextField là: " + text);
                }
                
                if(e.equals(2)){
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Chỉ cho phép nhập ký tự số!", "Lỗi", JOptionPane.ERROR_MESSAGE);                    
                }
            }
        });
        
        JButton b1=new JButton("Hiển thị giá trị");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lấy nội dung từ JTextField
                String text = a1.getText();
                // Hiển thị hộp thoại với nội dung của JTextField
                JOptionPane.showMessageDialog(null, "Nội dung của TextField là: " + text);
            }
        });
        JButton b2=new JButton("Thoát");
        b2.addMouseListener(new MouseAdapter() {
            @Override
            //Click nút thoát thì chương tình ngừng chạy và không hiện giao diện 
            public void mouseClicked(MouseEvent e) {
                frm1.setVisible(false);
            }
        });
                
        a.add(b1);        
        a.add(b2);
        frm1.add(a);
        
        frm1.setVisible(true);
        
    } 
}

public class bai46 {
    public static void main(String[] args){
        System.out.println(" Nhấn Enter để chuyển sang giao diện Đồ họa.");
        Scanner sc=new Scanner(System.in);
        sc.nextLine();
        form1 a=new form1();
//        a.for?m1();
//        JFrame frm1;
//        frm1= new JFrame();
//        frm1.setSize(800,600);
//        frm1.setTitle("Form ví dụ");
//       
//        JButton jButton1 = new JButton("Thoát"); // Tạo nút "Thoát"
//        frm1.add(jButton1); // Thêm nút vào Jframe
//        frm1.setLocationRelativeTo(null); // Đặt JFrame ở giữa màn hình
//       
//        jButton1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit(0);
//            }
//        });
//
//
//        frm1.setVisible(true);        
    }
}
