package exp;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

public class myFrame extends javax.swing.JFrame{
        private void changeColor(JFrame a){       
            Container b=getContentPane();
            b.setBackground(Color.red);
        }
        
        public void callChangeColor() {
            changeColor(this);
        }

    void callChangeColor(JFrame frm1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
