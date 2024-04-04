import model.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Engine engine = new Engine(new Parc());

        System.out.println("bienvenue dans notre programe");
        System.out.println("S'il vous plait choisie une option:" );
        System.out.println("1-> ajouter scooter: ");
        System.out.println("2-> supprimer scooter: ");
        System.out.println("3-> louer scooter: ");
        System.out.println("4-> retourner scooter: ");
        System.out.println("5-> afficher etat scooter scooter: ");
        System.out.println("6-> afficher parc ensemble scooter: ");
        System.out.println("7-> afficher resultat de parc scooter: ");
        Scanner input = new Scanner(System.in);
        int response;
        do {
            
            response = input.nextInt();
            switch (response) {
                case 1:
                    System.out.println("donner votre model de scooter: ");
                    String model = input.next();
                    System.out.println("donner sont kilometrage: ");
                    float kilometrage = input.nextFloat();
                    System.out.println("est disponibles: 1 pour vrai 0 pour faux ");
                    int tmporary = input.nextInt();
                    boolean estDisponible;
                    if(tmporary==1){
                        estDisponible = true;
                    }else{
                        estDisponible = false;
                    }
                
                    engine.ajouterScooter(model, kilometrage, estDisponible);
                    break;
                case 2:
                    System.out.println("donner id de scooter: ");
                    int idscooter = input.nextInt();
                    engine.supprimerScooter(idscooter);
                    break;
                case 3:
                    System.out.println("donner nom de clinet:");
                    String nom = input.next();
                    System.out.println("donner sont prenom:");
                    String prenom = input.next();
                    System.out.println("donner sont numero de telephone");
                    String telephone = input.next();
                    Client tmpClient = engine.parc.getClientByPhone(telephone);
                    if(tmpClient!=null){    
                        engine.parc.LIstClient.add(new Client(nom, prenom, telephone));
                    }
                    System.out.println("donner id scooter: ");
                    int identifiant = input.nextInt();
                    engine.louerScooter(engine.parc.getClientByPhone(telephone), identifiant);
                    break;
                case 4:
                    System.out.println("donne le nouveau kilometrage");
                    float kilom = input.nextFloat();
                    System.out.println("donner date de retour");
                    String tmp = input.next();
                    LocalDate date_retour = LocalDate.parse(tmp);
                    System.out.println("donner id scooter");
                    int idScot = input.nextInt();
                    System.out.println("donner numero telephone:");
                    String tel = input.next();
                    engine.retourScooter(engine.parc.getClientByPhone(tel), kilom, idScot, date_retour);
                    break;
                case 5:
                    System.out.println("donner id de scooter");
                    int id = input.nextInt();
                    engine.etatScooter(id);
                    break;
                case 6:
                    engine.etatParcEnsembleScooter();
                    break;
                case 7:
                    engine.parcDesScooter();
                    break;
                default:
                System.out.println("votre choix n'exist pas ai revoire :)");
                    break;
            }
        } while (response<8);
    }
}