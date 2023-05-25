package FactoryBriefumschlag;

public class A6Briefumschlag implements Briefumschlag {
    private final double _gewicht;
    private final String _groesse;

    public A6Briefumschlag(double gewicht) {
        this._gewicht = gewicht;
        this._groesse = "A6";
    }

    @Override
    public double get_gewicht() {
        return _gewicht;
    }

    @Override
    public String get_groesse() {
        return _groesse;
    }
}
