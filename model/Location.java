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
        scooter.estDisponible = false;
        location=scooter;
    }

    public Location(){

    }

    public void setRetour(float kilometrage,LocalDate date_retour,Client client) {
        this.location.kilometrage = kilometrage;
        this.location.estDisponible = true;
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


}