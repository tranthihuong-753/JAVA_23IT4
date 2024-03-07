/*
Tạo một lớp cha có tên là A với một phương thức draw() để vẽ hình. 
Sau đó, tạo một lớp con có tên là B kế thừa từ lớp cha A và ghi đè phương thức draw() để vẽ một hình tròn. 
Trong hàm main(), tạo một mảng đối tượng thuộc lớp cha A và gán cho mỗi phần tử một đối tượng thuộc lớp con B. 
Sử dụng vòng lặp và toán tử instanceof để kiểm tra từng phần tử của mảng. 
Nếu phần tử đó là một đối tượng thuộc lớp B, hãy gọi phương thức draw() của đối tượng đó để vẽ hình tròn.
 */

// Với các lớp riêng biệt 
package javatuanTET;

import javax.swing.*;
import java.awt.*;

class A extends JPanel {
    void draw(){
        // vẽ hình
    }
}

class B extends A {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // gọi phương thức paintComponent() của lớp cha JPanel

        int X = getWidth() / 2;
        int Y = getHeight() / 2;
        int t = 100;

        g.setColor(Color.GRAY);
        g.fillOval(X - t, Y - t, t * 2, t * 2);
    }
}

public class bai_9 {
    public static void main(String[] args) {
        JFrame a = new JFrame("mm");
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setSize(500, 500);
        a.setLocationRelativeTo(null);

        B b = new B();
        a.add(b);
        b.draw();
        a.setVisible(true);
    }
}
