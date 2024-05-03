package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import view.components.DataDiv;
import view.components.Mybutton;
import view.components.Myframe;

public class ParcdeScooter extends Myframe {
    ParcdeScooter() {
        super("Parc de Scooter", 500, 1200);
        JPanel heading = new JPanel();
        heading.setLayout(new FlowLayout());
        JLabel textheading = new JLabel("Saisie de parc des scooters");
        textheading.setFont(new Font("Arial", Font.BOLD, 18));
        heading.add(textheading, FlowLayout.CENTER);
        heading.setForeground(Color.white);
        heading.setBackground(Color.darkGray);

        DataDiv nombreDeScooter = new DataDiv("Nombre De Scooters", "120");
        DataDiv nombreLocalisation = new DataDiv("Nombre de Scooters en Location", "40");
        DataDiv nombreScooterDispo = new DataDiv("Nombre de Scooter Disponible", "80");
        DataDiv nombreKilometrage = new DataDiv("Nombre Moyen de kilometrage est : ", "360.145");

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 1));

        mainPanel.add(nombreDeScooter);
        mainPanel.add(nombreLocalisation);
        mainPanel.add(nombreScooterDispo);
        mainPanel.add(nombreKilometrage);

        JPanel footer = new JPanel(new FlowLayout());
        Mybutton retourBtn = new Mybutton("Retourner à la page précédente", Color.white, Color.red);
        retourBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                setVisible(false);
                new HomePage().setVisible(true);
            }
        });
        footer.add(retourBtn, FlowLayout.CENTER);

        this.setLayout(new BorderLayout());
        this.add(heading, BorderLayout.NORTH);
        this.add(mainPanel, BorderLayout.CENTER);
        this.add(footer, BorderLayout.SOUTH);
    }
}
