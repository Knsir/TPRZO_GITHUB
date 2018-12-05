package Serveur;

import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by Karim on 21/11/2018.
 */
public class GererProto {

    private ListeAuth liste;
    private String chaine;
    //private PrintStream sortieSocket;

    public String travail(String Req) {
        String reponse = "ERROR : souci inconnu";
        // decoupage
        System.out.println(Req);
        System.out.println(chaine);
       chaine=Req;
            if (chaine != null) {
                System.out.println("Rentre dans la boucle");
                String tab[] = chaine.split(" ");
                reponse = "BAD";
                System.out.println(tab[0]);
                System.out.println(tab.length);
                if (tab.length == 3) {
                    System.out.println("pre pre Test");
                    switch (tab[0]){
                        case "chk":
                            reponse="Good";
                            if (liste.tester(tab[1], tab[2])) {
                                reponse = "GOOD";
                            }
                            break;
                        default:
                            reponse="probleme Switch";
                    }
                }
            }
            System.out.println(reponse);
            return reponse;
        }
}
