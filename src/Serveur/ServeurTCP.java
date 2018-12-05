package Serveur;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * Created by Karim on 21/11/2018.
 */
public class ServeurTCP {

    private ListeAuth liste;
    private int port;

    public ServeurTCP( int port) {
        this.port = port;
    }


    /*public static void serveur(){
       Gerer1Client.(ssg,liste);
    }*/


    public  void travail(){
        //creation serveur
        try {
            ServerSocket ssg = new ServerSocket(port);
            Socket ss = ssg.accept();
            Gerer1Client gc = new Gerer1Client(liste,ss);
            gc.travail();
            ssg.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
