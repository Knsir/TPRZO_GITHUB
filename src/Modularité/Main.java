package Modularité;

import Serveur.ClientTCP;
import Serveur.ServeurTCP;
import Serveur_UDP.Serveur_UDP;
//import ServeurUDP.ServeurUDP;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Karim on 21/11/2018.
 */
public class Main {

    public static void main(String[]args){
        System.out.println("Lancement du Serveur");
        System.out.println("Tapez 1 pour lancer un Serveur TCP | Tapez 2 pour lancer un Serveur UDP");
        Scanner scanner = new Scanner(System.in);
        String clav=scanner.nextLine();
        switch(clav){
            case "1":
                System.out.println("Le lanceur TCP est lancé");
                ServeurTCP s = new ServeurTCP(28414);
                s.travail();
                break;
            case "2":
                System.out.println("Le serveur UDP est lancé");
                Serveur_UDP sudp=new Serveur_UDP(28414);
                sudp.work();
                break;
            default:
                System.out.println("Erreur de Frappe");
                break;
        }




    }
}
