package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Card extends JPanel {

    public Card(int idScotter, String model, float kilometrage, String status) {
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

        JLabel statusLabel = new JLabel("Status: " + status);
        this.add(statusLabel);
    }
}