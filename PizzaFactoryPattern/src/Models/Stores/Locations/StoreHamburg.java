package Models.Stores.Locations;

import Models.Pizzas.*;
import Models.Pizzas.Types.PizzaCalzone;
import Models.Pizzas.Types.PizzaHawaii;
import Models.Pizzas.Types.PizzaSalami;
import Models.Stores.Store;
import Models.Stores.StoreLocation;

public class StoreHamburg extends Store {

    public StoreHamburg(StoreLocation l) {
        super(l);
    }

    @Override
    public Pizza cook(PizzaType p) {
        if(p == PizzaType.Salami) return new PizzaSalami(PizzaLocalType.HamburgSalami, StoreLocation.Hamburg);
        if(p == PizzaType.Calzone) return new PizzaCalzone(PizzaLocalType.HamburgCalzone, StoreLocation.Hamburg);
        return new PizzaHawaii(PizzaLocalType.HamburgHawaii, StoreLocation.Hamburg);
    }

    @Override
    public Pizza cook(PizzaType p, StoreLocation s) {
        if(p == PizzaType.Salami){
            if(s == StoreLocation.Berlin) return new PizzaSalami(PizzaLocalType.BerlinSalami, StoreLocation.Hamburg);
            if(s == StoreLocation.Hamburg) return new PizzaSalami(PizzaLocalType.HamburgSalami, StoreLocation.Hamburg);
            return new PizzaSalami(PizzaLocalType.RostockSalami, StoreLocation.Hamburg);
        }
        if(p == PizzaType.Hawaii){
            if(s == StoreLocation.Berlin) return new PizzaHawaii(PizzaLocalType.BerlinHawaii, StoreLocation.Hamburg);
            if(s == StoreLocation.Hamburg) return new PizzaHawaii(PizzaLocalType.HamburgHawaii, StoreLocation.Hamburg);
            return new PizzaHawaii(PizzaLocalType.RostockHawaii, StoreLocation.Hamburg);
        }
        //if(p == PizzaVariation.Calzone){
        if(s == StoreLocation.Berlin) return new PizzaCalzone(PizzaLocalType.BerlinCalzone, StoreLocation.Hamburg);
        if(s == StoreLocation.Hamburg) return new PizzaCalzone(PizzaLocalType.HamburgCalzone, StoreLocation.Hamburg);
        return new PizzaCalzone(PizzaLocalType.RostockCalzone, StoreLocation.Hamburg);
        //}
    }
}
