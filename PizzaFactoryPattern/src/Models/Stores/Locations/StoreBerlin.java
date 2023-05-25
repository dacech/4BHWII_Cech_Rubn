package Models.Stores.Locations;

import Models.Pizzas.*;
import Models.Pizzas.Types.PizzaCalzone;
import Models.Pizzas.Types.PizzaHawaii;
import Models.Pizzas.Types.PizzaSalami;
import Models.Stores.Store;
import Models.Stores.StoreLocation;

public class StoreBerlin extends Store {

    public StoreBerlin(StoreLocation l) {
        super(l);
    }

    @Override
    public Pizza cook(PizzaType p) {
        if(p == PizzaType.Salami) return new PizzaSalami(PizzaLocalType.BerlinSalami, StoreLocation.Berlin);
        if(p == PizzaType.Calzone) return new PizzaCalzone(PizzaLocalType.BerlinCalzone, StoreLocation.Berlin);
        return new PizzaHawaii(PizzaLocalType.BerlinHawaii, StoreLocation.Berlin);
    }

    @Override
    public Pizza cook(PizzaType p, StoreLocation s) {
        if(p == PizzaType.Salami){
            if(s == StoreLocation.Berlin) return new PizzaSalami(PizzaLocalType.BerlinSalami, StoreLocation.Berlin);
            if(s == StoreLocation.Hamburg) return new PizzaSalami(PizzaLocalType.HamburgSalami, StoreLocation.Berlin);
            return new PizzaSalami(PizzaLocalType.RostockSalami, StoreLocation.Berlin);
        }
        if(p == PizzaType.Hawaii){
            if(s == StoreLocation.Berlin) return new PizzaHawaii(PizzaLocalType.BerlinHawaii, StoreLocation.Berlin);
            if(s == StoreLocation.Hamburg) return new PizzaHawaii(PizzaLocalType.HamburgHawaii, StoreLocation.Berlin);
            return new PizzaHawaii(PizzaLocalType.RostockHawaii, StoreLocation.Berlin);
        }
        //if(p == PizzaVariation.Calzone){
        if(s == StoreLocation.Berlin) return new PizzaCalzone(PizzaLocalType.BerlinCalzone, StoreLocation.Berlin);
        if(s == StoreLocation.Hamburg) return new PizzaCalzone(PizzaLocalType.HamburgCalzone, StoreLocation.Berlin);
        return new PizzaCalzone(PizzaLocalType.RostockCalzone, StoreLocation.Berlin);
        //}
    }

}
