package exp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ex1 {
    public static void main(String[] args) {
        JFrame frm1;
        frm1= new JFrame();
        frm1.setSize(800,600);
        frm1.setTitle("Form ví dụ");      

        // Tạo JButton
        JButton button = new JButton("Click Me");

//        // Thiết lập kích thước mong muốn cho JButton
//        Dimension preferredSize = new Dimension(150, 50);
//        button.setPreferredSize(preferredSize);

        Panel a=new Panel();
        a.add(button);
        
        // Thêm JButton vào JFrame
        frm1.add(a);
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int x = (screenSize.width - frm1.getWidth()) / 2;
        int y = (screenSize.height - frm1.getHeight()) / 2;
        frm1.setLocation(x, y);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        // Tạo một đối tượng myFrame
        myFrame frame = new myFrame();
        
        // Gọi phương thức changeColor với tham số là frame được tạo
        frame.callChangeColor(frm1);
        
        frm1.setVisible(true);
    }
}



