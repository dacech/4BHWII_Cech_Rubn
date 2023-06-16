package Proxy_Drucker;

public class CODrucker implements Drucker{
    public void Drucken(int seiten, String farbe)
    {
        System.out.println("Drucke " + seiten + " Seiten im CODrucker");
    }
}
