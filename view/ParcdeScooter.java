package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JPanel;

import view.components.DataDiv;
import view.components.HeadingText;
import view.components.Mybutton;
import view.components.Myframe;

public class ParcdeScooter extends Myframe {
    
    ParcdeScooter() {
        super("Parc de Scooter", 500, 1200);
        JPanel header = new JPanel();
        HeadingText headingText = new HeadingText("Saisir le parc des Scooters");
        header.setBackground(Color.DARK_GRAY);
        headingText.setFont(new Font("Arial",Font.BOLD,18));
        headingText.setBackground(Color.DARK_GRAY);
        headingText.setForeground(Color.WHITE);
        header.add(headingText,BorderLayout.CENTER);

        JPanel mainHome = new JPanel();
        mainHome.setLayout(new GridLayout(4, 1,20,20));

        JPanel container1 = new JPanel();
        container1.setLayout(new GridLayout(2,1));
        JPanel container2 = new JPanel();
        container2.setLayout(new GridLayout(2,1));

        Mybutton visualiserLocation = new Mybutton("Visualiser", Color.white, Color.BLUE);
        Mybutton visualiserDispo = new Mybutton("Visualiser", Color.WHITE, Color.BLUE);
        visualiserDispo.setPreferredSize(new Dimension(200,150));
        visualiserLocation.setPreferredSize(new Dimension(200,150));

        DataDiv nombreScooter = new DataDiv("nombre des scooter", "12500");

        DataDiv scooterEnLocation = new DataDiv("nombre de Scooter en Locations", "500");
        container1.add(scooterEnLocation);
        container1.add(visualiserLocation);

        DataDiv scooterDispo = new DataDiv("nombre de scooter en Dispo", "12000");
        container2.add(scooterDispo);
        container2.add(visualiserDispo);

        DataDiv moyenKilo = new DataDiv("le Kilometrage Moyen", "750.2548");




        mainHome.add(nombreScooter);
        mainHome.add(container1);
        mainHome.add(container2);
        mainHome.add(moyenKilo);
        
        this.add(header,BorderLayout.NORTH);
        this.add(mainHome,BorderLayout.CENTER);
    }
}
