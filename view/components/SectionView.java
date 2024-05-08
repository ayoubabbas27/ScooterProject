package view.components;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import model.Scooter;
import view.data.Data;

public class SectionView extends JPanel {
    private Scooter[] myList = { 
        new Scooter("yamaha", 1451),
        new Scooter("BMW", 18288),
        new Scooter("Mercedes", 178852),
        new Scooter("TMAX", 15482),
    };

    public SectionView(Aside aside) {
        this.setBackground(Color.RED);
        this.setLayout(new FlowLayout(FlowLayout.LEADING, 30, 20));

        for (int i = 0; i < myList.length; i++) {
            Card card = new Card(String.valueOf(myList[i].getId()), myList[i].getModele(), String.valueOf(myList[i].getKilometrage()));
            card.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    Data.idClicked = card.id;
                    Data.modelClicked = card.model;
                    Data.kiloClicked = card.kilo;
                    aside.repaint();
                }
            });
            this.add(card);
        }
    }
}