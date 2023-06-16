package Proxy_Drucker;

import Proxy_Drucker.Drucker;
import Proxy_Drucker.Proxy;


public class Main {
    public static void main(String[] args) {

        Drucker drucker = new Proxy();

        drucker.Drucken(6, "SW");
    }
    // weil: Arbeitsobjekt verschleiern
    //       Überprüfen (Parameter) -> Security

}