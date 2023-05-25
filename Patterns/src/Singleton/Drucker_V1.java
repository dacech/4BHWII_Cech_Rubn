package Singleton;

public class Drucker_V1 {

    private static final Drucker_V1 Instance = new Drucker_V1();

     //privater Konstruktor der nur innerhalb der Klasse
     //aufgerufen werden kann

    private Drucker_V1(){
    //prv => !
    }

    public static Drucker_V1 getDrucker_V1(){
        //gibt Instance zurück
        return Instance;
    }

    public static String Drucken(){
        //drucken
        String druck = "Ich bin die Instanz " + Drucker_V1.getDrucker_V1();
        return druck;
    }

}
