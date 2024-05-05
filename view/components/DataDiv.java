package view.components;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DataDiv extends JPanel {
    public DataDiv(String text , String value){
        JLabel mytext = new JLabel(text+":");
        mytext.setFont(new Font("Arial",Font.BOLD,18));
        JLabel myvalue = new JLabel(value);
        myvalue.setFont(new Font("Arial",Font.PLAIN,18));
        this.setLayout(new FlowLayout());
        this.add(mytext);
        this.add(myvalue);
        this.setVisible(true);
        this.show();
    }
}
