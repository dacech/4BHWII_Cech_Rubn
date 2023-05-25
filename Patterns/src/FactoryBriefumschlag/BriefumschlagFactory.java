package FactoryBriefumschlag;

public class BriefumschlagFactory {
    public Briefumschlag createBriefumschlag(String stichwort, double gewicht) {
        switch (stichwort) {
            case "A4":
                return new A4Briefumschlag(gewicht);
            case "A5":
                return new A5Briefumschlag(gewicht);
            case "A6":
                return new A6Briefumschlag(gewicht);
            default:
                throw new IllegalArgumentException("Ungültiges Stichwort: " + stichwort);
        }
    }
}
