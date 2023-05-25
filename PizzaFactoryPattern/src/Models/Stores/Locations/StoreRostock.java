package Models.Stores.Locations;

import Models.Pizzas.*;
import Models.Pizzas.Types.PizzaCalzone;
import Models.Pizzas.Types.PizzaHawaii;
import Models.Pizzas.Types.PizzaSalami;
import Models.Stores.Store;
import Models.Stores.StoreLocation;

public class StoreRostock extends Store {

    public StoreRostock(StoreLocation l) {
        super(l);
    }

    @Override
    public Pizza cook(PizzaType p) {
        if(p == PizzaType.Salami) return new PizzaSalami(PizzaLocalType.RostockSalami, StoreLocation.Rostock);
        if(p == PizzaType.Calzone) return new PizzaCalzone(PizzaLocalType.RostockCalzone, StoreLocation.Rostock);
        return new PizzaHawaii(PizzaLocalType.RostockHawaii, StoreLocation.Rostock);
    }

    @Override
    public Pizza cook(PizzaType p, StoreLocation s) {
        if(p == PizzaType.Salami){
            if(s == StoreLocation.Berlin) return new PizzaSalami(PizzaLocalType.BerlinSalami, StoreLocation.Rostock);
            if(s == StoreLocation.Hamburg) return new PizzaSalami(PizzaLocalType.HamburgSalami, StoreLocation.Rostock);
            return new PizzaSalami(PizzaLocalType.RostockSalami, StoreLocation.Rostock);
        }
        if(p == PizzaType.Hawaii){
            if(s == StoreLocation.Berlin) return new PizzaHawaii(PizzaLocalType.BerlinHawaii, StoreLocation.Rostock);
            if(s == StoreLocation.Hamburg) return new PizzaHawaii(PizzaLocalType.HamburgHawaii, StoreLocation.Rostock);
            return new PizzaHawaii(PizzaLocalType.RostockHawaii, StoreLocation.Rostock);
        }
        //if(p == PizzaVariation.Calzone){
        if(s == StoreLocation.Berlin) return new PizzaCalzone(PizzaLocalType.BerlinCalzone, StoreLocation.Rostock);
        if(s == StoreLocation.Hamburg) return new PizzaCalzone(PizzaLocalType.HamburgCalzone, StoreLocation.Rostock);
        return new PizzaCalzone(PizzaLocalType.RostockCalzone, StoreLocation.Rostock);
        //}
    }

}
