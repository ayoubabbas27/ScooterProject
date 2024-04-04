package model;
import java.util.*;

public class Scooter {


    public int id;
    public String modele;
    public float kilometrage;
    public boolean estDisponible;
    public Location scooter;
    public Parc parc;

    public Scooter(String model , float kilometrage ,boolean estDisponible) {
        this.modele = model;
        this.kilometrage = kilometrage;
        this.estDisponible =estDisponible;
        this.id = new Random().nextInt(Integer.MAX_VALUE);
        
    }
    public int getId() {
        return id;
    }
    public float getKilometrage() {
        return kilometrage;
    }
    public String getModele() {
        return modele;
    }
    public Parc getParc() {
        return parc;
    }
    public Location getScooter() {
        return scooter;
    }
    public boolean getEtat(){
        return this.estDisponible;
    }


}