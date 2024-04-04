package model;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.Vector;

public class Engine {
    public Parc parc;

    Scanner input = new Scanner(System.in);

    public Engine(Parc parc){
        this.parc = parc;
    }

    public void louerScooter(Client client,int idScooter){
        Scooter scooter =parc.getScooterById(idScooter);
        System.out.println("Donner votre date de debut:");
        String tempo = input.next();
        LocalDate date_debut = LocalDate.parse(tempo);
        System.out.println("Donner votre date de fin:");
        tempo = input.next();
        LocalDate date_fin = LocalDate.parse(tempo);
        try {
            if(scooter!=null||scooter.getEtat()){
                parc.louerScooter(client, scooter, date_debut, date_fin);
            }else{
                System.out.println("ce n'exist pas :(");
            }    
        } catch (Exception e) {
            System.out.println("error: "+e);
        }
        
    }

    public void ajouterScooter(String model , float kilometrage , boolean estDisponible){
        parc.setListScotter(new Scooter(model, kilometrage, estDisponible));
    }

    public void supprimerScooter(int idScooter){
        Vector<Scooter> liScooters = parc.getListscooter();
        Vector<Scooter> tmp = new Vector<>();
        for(Scooter element:liScooters){
            if(element.getId() == idScooter){
                continue;
            }else{
                tmp.add(element);
            }
        }
        parc.setListscooter(tmp);
    }

    public void retourScooter(Client client,float kilometrage,int idScooter,LocalDate date_retour){
        try {
            parc.locations.forEach(element ->{
                if(element.getClient().getIdClient()==client.getIdClient()){
                    element.setRetour(kilometrage, date_retour, client);
                }
            });
        } catch (Exception e) {
            System.out.println("error: "+e);
        }
    }


    public void etatScooter(int idScooter){
        Scooter scooter = parc.getScooterById(idScooter);
        if(scooter==null){
            System.out.println("ce scooter n'exist pas :( ");
        }else{
            System.out.println("scooter trouver :)");
            System.out.println("Id : "+scooter.getId());
            System.out.println("model: "+scooter.getModele());
            System.out.println("kilometrage: "+ scooter.getKilometrage());
            System.out.println("Etat: "+(scooter.getEtat()? "Disponible":"Non Disponible"));
        }

    }
    public void etatParcEnsembleScooter(){
        Vector<Scooter> scooterList = parc.getListscooter();
        System.out.println("");
        for(Scooter scooter:scooterList){
            System.out.println("Id : "+scooter.getId());
            System.out.println("Model: "+scooter.getModele());
            System.out.println("kilometrage: "+scooter.getKilometrage());
            System.out.println("etat: "+(scooter.getEtat()?"Disponible":"Non Disponible"));
            System.out.println("--------------------------------------------------------------------------");
        }

    }

    public void parcDesScooter(){
        System.out.println("Nombre total des scooter est : "+parc.getNbrMaxScooters());
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Les scooter en location sont: ");
        Vector<Scooter> parcScooter = parc.getListscooter();
        for(Scooter scooter : parcScooter){
            if(!scooter.estDisponible){
                System.out.println("scooter : "+scooter.getId());
            }
        }
        System.out.println("----------------------------------------------");
        System.out.println("en total :"+parc.getNbrScootersLoues());

        System.out.println("Les scooter disponibles sont: ");
        for(Scooter scooter:parcScooter){
            if(scooter.estDisponible){
                System.out.println("scooter: "+scooter.getId());
            }
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("en total :"+ parc.getNbrScootersDisponibles());

        System.out.println("Le kilometrage moyenne: ");
        float tmp =0;
        for(Scooter scooter : parcScooter){
            tmp+= scooter.getKilometrage();
        }
        System.out.println(tmp);

    }
    
}
