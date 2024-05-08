package view;

import view.components.HeadingText;
import view.components.Mybutton;
import view.components.Myframe;
import view.components.MytextField;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class RetournerScooter extends Myframe {
    RetournerScooter(Myframe prev) {
        super("Retourner Scooter", 500, 1200);
        this.setLayout(new BorderLayout());
        
        JLabel heading = new JLabel("Retourner Scooter");
        heading.setFont(new Font("Arial", Font.BOLD, 18));

        Mybutton exitBtn = new Mybutton("annuler", Color.white, Color.red);
        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                RetournerScooter.this.setVisible(false);
            }
        });
        Mybutton valider = new Mybutton("valider", Color.white, Color.blue);

        JPanel footer = new JPanel();
        footer.setLayout(new FlowLayout());
        footer.add(exitBtn);
        footer.add(valider);

        JPanel mainPanel = new JPanel(new GridLayout(3, 1));
        
        JPanel headingDiv = new JPanel();
        headingDiv.add(new HeadingText("Information Locataire"));

        JPanel secondDiv = new JPanel();
        secondDiv.setLayout(new GridLayout(3, 2, 10, 20));
        
        MytextField nomField = new MytextField("Nom", 80, 120, false);
        MytextField prenomField = new MytextField("Prenom", 80, 120, false);
        MytextField telephoneField = new MytextField("Telephone", 80, 120, true);
        MytextField dateRetour = new MytextField("Date Retour", 80, 120, false);
        MytextField idScooterField = new MytextField("ID Scooter", 80, 120, true);
        MytextField kilometrageField = new MytextField("Kilometrage", 80, 120, true);

        secondDiv.add(nomField);
        secondDiv.add(prenomField);
        secondDiv.add(telephoneField);
        secondDiv.add(dateRetour);
        secondDiv.add(idScooterField);
        secondDiv.add(kilometrageField);

        mainPanel.add(headingDiv);
        mainPanel.add(secondDiv);

        this.add(mainPanel, BorderLayout.CENTER);
        this.add(heading, BorderLayout.NORTH);
        this.add(footer, BorderLayout.SOUTH);
    }
}
