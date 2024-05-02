package view.components;
import java.awt.*;

import javax.swing.JFrame;

public class Myframe extends JFrame{
    public Myframe(String title ,int height , int width){
        this.setTitle(title);
        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        this.show();
    }
}
