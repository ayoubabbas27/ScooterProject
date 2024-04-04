package model;


import java.util.*;


public class Client {
    private String nom;
    private String prenom;
    private String telephone;
    private int IdClient;
    private Vector<Location> listLoc;
    private Parc parc;


    public Client(String nom,String prenom,String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.IdClient = new Random().nextInt(Integer.MAX_VALUE);
    }
    
    public int getIdClient() {
        return IdClient;
    }
    
    public Vector<Location> getListLoc() {
        return listLoc;
    }

    public String getNom() {
        return nom;
    }

    public Parc getParc() {
        return parc;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTelephone() {
        return telephone;
    }

}