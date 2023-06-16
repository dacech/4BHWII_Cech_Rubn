package Proxy_Drucker;

public class Proxy implements Drucker{
    public void Drucken(int seiten, String farbe)
    {
        Drucker CoDr = new CODrucker();
        Drucker SwDr = new SWDrucker();
        if(seiten <= 0)
        {
            System.out.println("Seitenzahl zu klein!");
        }
        if((seiten >= 50) &&(seiten <500))
        {
            System.out.println("Seitenzahl > 50 --> schwarz-weißer Druck!");
            SwDr.Drucken(seiten, "SW");
        }else if(seiten >= 500)
        {
            System.out.println("Seitenzahl > 500 --> kein Druck!");
        }else
        {
            CoDr.Drucken(seiten, farbe);
        }
    }
}
