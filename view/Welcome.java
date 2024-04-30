package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Welcome extends Myframe {
    private String usernametxt;
    private String passwordtxt;

    public Welcome (){
        super("Welcome",400,400);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        this.add(new HeadingText("please fill in information"),BorderLayout.NORTH);
        JPanel tmp = new JPanel();
        LayoutManager layout = new FlowLayout(FlowLayout.CENTER, 20,5);
        tmp.setLayout(layout);
        MytextField userName = new MytextField("username", 20, 200,false);
        MytextField password = new MytextField("password", 20, 200, false);
        tmp.add(userName);
        tmp.add(password);
        this.add(tmp,BorderLayout.CENTER);
        Mybutton tmpButton = new Mybutton("Connect", Color.WHITE, Color.ORANGE);
        tmpButton.addActionListener(e->{
            if(userName.getText().equals("admin")&&password.getText().equals("admin")){
                Myframe succes = new Myframe("succes connected", 300, 300);
                succes.setResizable(false);
                succes.show();

            }else{
                Myframe failed = new Myframe("failed to connect", 300, 300);
                failed.setResizable(false);
                failed.show();
            }
        });
        this.add(tmpButton,BorderLayout.SOUTH);
        this.setVisible(true);
        this.show();
    }
}
