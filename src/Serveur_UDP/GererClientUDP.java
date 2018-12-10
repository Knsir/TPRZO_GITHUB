package Serveur_UDP;

import Serveur.GererProto;
import Serveur.ListeAuth;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.net.DatagramPacket;


/**
 * Created by Karim on 05/12/2018.
 */
public class GererClientUDP {
    private byte[] tampon;
    private ListeAuth l;

    public GererClientUDP(byte[] tampon) {
        this.tampon=tampon;
    }

    public void travail(){
        // objet Java permettant de recevoir un datagramme UDP
        DatagramPacket dgram = new DatagramPacket(tampon, tampon.length);
        ListeAuth liste = new ListeAuth();

        GererProtocole gp=new GererProtocole(dgram,liste,tampon);
        gp.travail();

    }

}
