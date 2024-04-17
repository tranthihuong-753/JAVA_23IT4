/*
Bài tập 48.
Viết chương trình Java :
a. Chạy mode Console nhấn Enter thì chuyển sang form (GUI; giao diện đồ họa)
b. Thiết kế 1 lớp form gọi là myFrame kế thừa từ lớp JFrame của Swing:
+Đặt tiêu đề form: Quản lý sinh viên
+Trên form có 
1 điều khiển label, 1 điều khiển nhập liệu TextField nhập mã sinh viên: chỉ nhập chữ số và độ dài đúng 6 kí tự
+2 button: Button "Xóa", 1 button "Thoát"
1 điều khiển JTable hiện danh sách sinh viên.

Khi nhấn "Xóa" thì dòng tương ứng của JTable với mã sinh viên trùng với nội dung ở Textfield mã sinh viên sẽ bị xóa.
 */
package javatuan11;

import java.awt.*;
import java.util.*;
import javax.swing.*;

class myFramee extends JFrame{
    public myFramee(){
        JFrame a=new JFrame("Quản lý sinh viên");
        a.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        JLabel b=new JLabel();
//        b.setLocation(500,500);
        JLabel b1=new JLabel("ID");
        JTextField b2=new JTextField(30);
        b.add(b2);
        b.add(b1);
        
        JScrollPane x=new JScrollPane(b);
        a.add(x);
        
        a.setVisible(true);
    }
}
public class bai48 {
    public static void main(String[] args){
        System.out.println("Nhấn ENTER để chuyển sang GUI");
        Scanner a=new Scanner(System.in);
        a.nextLine();
        myFramee b=new myFramee();
    }
}
