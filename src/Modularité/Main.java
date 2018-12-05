package Modularité;

import Serveur.ClientTCP;
import Serveur.ServeurTCP;
import ServeurUDP.ServeurUDP;

import java.io.IOException;

/**
 * Created by Karim on 21/11/2018.
 */
public class Main {
    public static void main(String[]args){
        System.out.println("Lancement du Serveur");
        System.out.println("Tapez 1 pour lancer un Serveur TCP | Tapez 2 pour lancer un Serveur UDP");

        ServeurTCP s=new ServeurTCP(28414);

            s.travail();

    }
}
