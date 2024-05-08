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


public class Aside extends JPanel {

    private String idInfo = "Selectioner un scooter";
    private String modelInfo = "Selectioner un scooter";
    private String kiloInfo = "Selectioner un scooter";
    private DataDiv idDiv;
    private DataDiv modelDiv;
    private DataDiv kiloDiv;

    public void setDataid(String id){
        idDiv.setValue(id);
    }
    public void setDatamodel(String model){
        modelDiv.setValue(model);
    }
    public void setDataKilo(String kilo){
        kiloDiv.setValue(kilo);
    }

    public DataDiv getIdDiv(){
        return this.idDiv;
    }
    public DataDiv getModelDiv(){
        return this.modelDiv;
    }
    public DataDiv getKiloDiv(){
        return this.kiloDiv;
    }

    public Aside(Myframe passPage,Myframe currentPage) {
        this.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 10));
        this.setBackground(Color.LIGHT_GRAY);
        this.setPreferredSize(new Dimension(320,5000));
        HeadingText heading = new HeadingText("Parc des scooters");
        heading.setBackground(Color.lightGray);
        
        MytextField searchBar = new MytextField(30, 150,true);
        Mybutton search = new Mybutton("search",Color.WHITE,Color.blue);
        Mybutton exit = new Mybutton("retourner",Color.white,Color.RED);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                passPage.setVisible(true);
                currentPage.setVisible(false);
            }
        });
        
        idDiv = new DataDiv("id", this.idInfo);
        idDiv.setBackground(Color.LIGHT_GRAY);
        modelDiv = new DataDiv("model", this.modelInfo);
        modelDiv.setBackground(Color.LIGHT_GRAY);
        kiloDiv = new DataDiv("kilometrage", this.kiloInfo);
        kiloDiv.setBackground(Color.LIGHT_GRAY);
        

        this.add(heading);
        this.add(searchBar);
        this.add(search);
        this.add(idDiv);
        this.add(modelDiv);
        this.add(kiloDiv);
        this.repaint();

        Mybutton louerBtn = new Mybutton("Louer ce scooter", Color.WHITE, Color.BLUE);
        Mybutton plusBtn = new Mybutton("plus de details", Color.white, Color.GREEN);
        this.add(louerBtn);
        this.add(plusBtn);
        

        this.add(exit);

        this.setVisible(true);
        this.show();
    }
}