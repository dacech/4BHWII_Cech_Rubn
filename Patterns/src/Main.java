import FactoryBriefumschlag.Briefumschlag;
import FactoryBriefumschlag.BriefumschlagFactory;

/*
public class Main {
    public static void main(String[] args) {


        Drucker_V1 d1 = Drucker_V1.getDrucker_V1();
        // => weil prv!

        d1.Drucken();

        System.out.println(d1.Drucken());

    }
}

 */     //Singleton

public class Main {
    public static void main(String[] args) {
        BriefumschlagFactory factory = new BriefumschlagFactory();

        Briefumschlag a4Umschlag = factory.createBriefumschlag("A4", 10.0);
        System.out.println(a4Umschlag.get_groesse() + " Umschlag wiegt " + a4Umschlag.get_gewicht() + " Gramm.");


    }
}