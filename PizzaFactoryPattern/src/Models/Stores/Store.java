package Models.Stores;

import Models.Pizzas.Pizza;
import Models.Pizzas.PizzaType;

public abstract class Store {

    protected StoreLocation _loc;

    public StoreLocation getStoreLocation(){
        return this._loc;
    }

    public Store(StoreLocation l){
        this._loc = l;
    }

    public abstract Pizza cook(PizzaType p);
    public abstract Pizza cook(PizzaType p, StoreLocation s);

    @Override
    public String toString(){
        return this._loc + "";
    }

}
