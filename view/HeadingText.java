package view;
import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.*;
public class HeadingText extends JPanel{
    public HeadingText(String text){
        this.setLayout(new FlowLayout());
        this.add(new Label(text));
        this.setVisible(true);
        this.show();
    }
}
