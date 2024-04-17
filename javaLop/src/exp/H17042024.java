/*
Lập trình đổ dữ liệu mảng Student nhập ở Console vào Table khi form được hiển thị.
 */
package exp;

import static ham.GUI.ECG;
import static ham.GUI.table_st;
import static ham.GUI.tao_GUI;
import java.awt.GridLayout;
import java.util.List;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

class a{
    public a(){
        tao_GUI(table_st());
    }
}

public class H17042024 {
    public static void main(String[] args) {
        ECG();
        a x=new a(); 
    }
}
