package Modularité;

import Serveur.ClientTCP;
import Serveur.ServeurTCP;


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
            default:
                System.out.println("Erreur de Frappe");
                break;
        }




    }
}
