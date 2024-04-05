package model;
import java.time.LocalDate;
import java.util.*;


public class Parc {

    private  int nbrMaxScooters;

    private  int nbrScootersDisponibles;

    private  int nbrScootersLoues;
    public Vector<Location> locations = new Vector<Location>();
    public  Vector<Scooter> Listscooter =new Vector<Scooter>();
    public  Vector<Client> LIstClient = new Vector<Client>();
    public  Vector<Retoure> listRetour = new Vector<Retoure>();

    public Parc(int nombreScooter) {
        this.nbrMaxScooters = nombreScooter;
    }

    private int getScooterLouer(){
        int tmp = 0;
        for (Scooter elScooter : this.Listscooter) {
            if(elScooter.estDisponible == false){
                tmp++;
            }
        }
        return tmp;
    }

    public  void  setListScotter(Scooter scooter){
        Listscooter.add(scooter);
        nbrMaxScooters = Listscooter.size();
        nbrScootersLoues = getScooterLouer();
        nbrScootersDisponibles = nbrMaxScooters - nbrScootersLoues;
    }

    public Vector<Client> getListClient(){
        return LIstClient;
    }
    public Client getClientByPhone(String telephone){
        Client tmpClient = null;
        
        for(Client element:this.LIstClient){
            if(element.getTelephone()==telephone){
                tmpClient = element;
            }
        }
        return tmpClient;
    }

    public  void louerScooter(Client client,Scooter scooter,LocalDate date_debut,LocalDate date_fin){
        locations.add(new Location(client, scooter, date_debut, date_fin));
    }
    
    public  Vector<Scooter> getListscooter() {
        return Listscooter;
    }
    public int getNbrMaxScooters() {
        return nbrMaxScooters;
    }
    public  int getNbrScootersDisponibles() {
        return nbrScootersDisponibles;
    }
    public int getNbrScootersLoues() {
        return nbrScootersLoues;
    }
    public Scooter getScooterById(int id){
        Scooter scooter = null;
        for(Scooter scotele : Listscooter){
            if(scotele.getId()== id){
                scooter = scotele;
            }
        }
        return scooter;
    }
    public Vector<Retoure> getListRetour() {
        return listRetour;
    }
    public Vector<Client> getLIstClient() {
        return LIstClient;
    }
    public void setListscooter(Vector<Scooter> listscooter) {
        Listscooter = listscooter;
    }
    
}