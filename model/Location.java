package model;
import java.time.LocalDate;

public class Location {
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private float kilometrage;
    private Scooter location;
    private Client client;
    private Retoure retour;
    
    public Location(Client client,Scooter scooter,LocalDate date_debut , LocalDate date_fin) {
        this.dateDebut = date_debut;
        this.dateFin = date_fin;
        this.client = client;
        location=scooter;
    }

    public Location(){

    }

    public void setRetour(float kilometrage,LocalDate date_retour,Client client) {
        this.location.kilometrage = kilometrage;
        this.retour = new Retoure(client,date_retour, kilometrage, this);
    }
    public Client getClient() {
        return client;
    }
    public LocalDate getDateDebut() {
        return dateDebut;
    }
    public LocalDate getDateFin() {
        return dateFin;
    }
    public float getKilometrage() {
        return kilometrage;
    }
    public Scooter getLocation() {
        return location;
    }
    public Retoure getRetour() {
        return retour;
    }
    public boolean isIntersect(LocalDate date_1 , LocalDate date_2){
        if(date_1.isAfter(this.dateDebut)&&date_2.isBefore(date_2)){
            return false;
        }else if(date_1.isAfter(this.dateDebut)&&date_2.isAfter(this.dateFin)&&date_1.isBefore(this.dateFin)){
            return false;
        }else if(date_1.isBefore(this.dateDebut)&&date_2.isAfter(this.dateDebut)&&date_2.isBefore(this.dateFin)){
            return false;
        }else if(date_1.isBefore(this.dateDebut)&&date_2.isAfter(this.dateFin)){
            return false;
        }else{
            return true;
        }
    }

}