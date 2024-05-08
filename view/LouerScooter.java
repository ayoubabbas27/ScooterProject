package view;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import view.components.Aside;
import view.components.Myframe;
import view.components.SectionView;

public class LouerScooter extends Myframe {
    Myframe passPage ;
    public LouerScooter (Myframe homepage) {
        super("louer Scooter",1200,1200);
        this.setLayout(new BorderLayout());
        Aside myAside  = new Aside(homepage,this);
        SectionView section = new SectionView(myAside);

        
        this.add(myAside,BorderLayout.WEST);
        this.add(section);
        this.setVisible(true);

    }    
}
