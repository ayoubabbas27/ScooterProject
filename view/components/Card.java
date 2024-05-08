package view.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Card extends JPanel{
    String id;
    String model;
    String kilo;

    public Card(String idScotter, String model, String kilometrage) {
        this.id =idScotter;
        this.kilo = kilometrage;
        this.model = model;
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setPreferredSize(new Dimension(300, 60));
        
        this.setBackground(Color.WHITE);
        this.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));

        JLabel idLabel = new JLabel("ID: " + idScotter);
        idLabel.setFont(new Font("Arial", Font.BOLD, 12));
        this.add(idLabel);

        JLabel modelLabel = new JLabel("Model: " + model);
        this.add(modelLabel);

        JLabel kiloLabel = new JLabel("Kilometrage: " + kilometrage);
        this.add(kiloLabel);

    }
    
    
}