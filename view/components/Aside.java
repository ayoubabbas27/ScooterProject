package view.components;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JPanel;

import view.data.Data;

public class Aside extends JPanel {

    String idInfo = Data.idClicked;
    String modelInfo = Data.modelClicked;
    String kiloInfo = Data.kiloClicked;


    public Aside(Myframe passPage,Myframe currentPage) {
        this.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 10));
        this.setBackground(Color.LIGHT_GRAY);
        this.setPreferredSize(new Dimension(320,5000));
        HeadingText heading = new HeadingText("Parc des scooters");
        heading.setBackground(Color.lightGray);
        
        MytextField searchBar = new MytextField(30, 150);
        Mybutton search = new Mybutton("search",Color.WHITE,Color.blue);
        Mybutton exit = new Mybutton("retourner",Color.white,Color.RED);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                passPage.setVisible(true);
                currentPage.setVisible(false);
            }
        });
        
        DataDiv idDiv = new DataDiv("id", this.idInfo);
        idDiv.setBackground(Color.LIGHT_GRAY);
        DataDiv modelDiv = new DataDiv("model", this.modelInfo);
        modelDiv.setBackground(Color.LIGHT_GRAY);
        DataDiv kiloDiv = new DataDiv("kilometrage", this.kiloInfo);
        kiloDiv.setBackground(Color.LIGHT_GRAY);
        
        Data.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if ("idClicked".equals(evt.getPropertyName())) {
                    idDiv.setValue(Data.idClicked);
                } else if ("modelClicked".equals(evt.getPropertyName())) {
                    modelDiv.setValue(Data.modelClicked);
                } else if ("kiloClicked".equals(evt.getPropertyName())) {
                    kiloDiv.setValue(Data.kiloClicked);
                }
            
            }
            
        });

        this.add(heading);
        this.add(searchBar);
        this.add(search);
        this.add(idDiv);
        this.add(modelDiv);
        this.add(kiloDiv);
        this.repaint();

        if (!idInfo.equals("Selectioner un scooter")) {
            Mybutton louerBtn = new Mybutton("Louer ce scooter", Color.WHITE, Color.BLUE);
            Mybutton plusBtn = new Mybutton("plus de details", Color.white, Color.GREEN);
            this.add(louerBtn);
            this.add(plusBtn);
        }

        this.add(exit);

        this.setVisible(true);
        this.show();
    }
}