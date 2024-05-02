import model.*;
import view.*;
import view.components.Myframe;

import java.time.LocalDate;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.println("bienvenue dans notre programe");
        
        System.out.println("donner le nombre de scooter que vous avez dans votre parc: ");
        int nombreScooter = input.nextInt();
        Engine engine = new Engine(new Parc(nombreScooter));
        if(nombreScooter>0){
            for(int index = 0 ; index<nombreScooter;index++){
                String model;
                float kilo;
                System.out.println("donner sont model: ");
                model = input.next();
                System.out.println("donner sont kilometrage:  ");
                kilo = input.nextFloat();
                engine.ajouterScooter(model, kilo);
            }
        }

        System.out.println("S'il vous plait choisie une option:" );
        System.out.println("1-> ajouter scooter: ");
        System.out.println("2-> supprimer scooter: ");
        System.out.println("3-> louer scooter: ");
        System.out.println("4-> retourner scooter: ");
        System.out.println("5-> afficher etat scooter scooter: ");
        System.out.println("6-> afficher parc ensemble scooter: ");
        System.out.println("7-> afficher resultat de parc scooter: ");
        int response;
        do {
            
            response = input.nextInt();
            switch (response) {
                case 1:
                    try {
                        System.out.println("donner votre model de scooter: ");
                        String model = input.next();
                        System.out.println("donner sont kilometrage: ");
                        float kilometrage = input.nextFloat();
                        
                    
                        engine.ajouterScooter(model, kilometrage);
                    } catch (Exception e) {
                        System.out.println("une erreur c'est produit");
                    }
                    break;
                case 2:
                    try{
                        System.out.println("donner id de scooter: ");
                        int idscooter = input.nextInt();
                        engine.supprimerScooter(idscooter);
                    }catch(Exception e){
                        System.out.println("une erreur c'est produit");
                    }
                    break;
                case 3:
                    try {
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
                    } catch (Exception e) {
                        System.out.println("une erreur c'est produit ");
                    }
                    break;
                case 4:
                    try {
                        System.out.println("donner id scooter");
                        int idScot = input.nextInt();
                        System.out.println("donne le nouveau kilometrage");
                        float kilom = input.nextFloat();
                        System.out.println("donner date de retour");
                        String tmp = input.next();
                        LocalDate date_retour = LocalDate.parse(tmp);
                        System.out.println("donner numero telephone:");
                        String tel = input.next();
                        engine.retourScooter(engine.parc.getClientByPhone(tel), kilom, idScot, date_retour);    
                    } catch (Exception e) {
                        System.out.println("une erreur c'est produit");
                    }
                    
                    break;
                case 5:
                try {
                    System.out.println("donner id de scooter");
                    int id = input.nextInt();
                    engine.etatScooter(id);
                    
                } catch (Exception e) {
                    System.out.println("une erreur c'est produit");
                }
                    break;
                case 6:
                    try{

                        engine.etatParcEnsembleScooter();
                    }catch(Exception e){
                        System.out.println("une erreur c'est produit");
                    }
                    break;
                case 7:
                    try{

                        engine.parcDesScooter();
                    }catch(Exception e){
                        System.out.println("une erreur c'est produit");
                    }
                    break;
                default:
                System.out.println("votre choix n'exist pas ai revoire :)");
                    break;
            }
        } while (response<8);*/

        //Welcome welcomePage = new Welcome();
        HomePage home = new HomePage();
    }
}