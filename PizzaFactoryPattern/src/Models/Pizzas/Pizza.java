package Models.Pizzas;

import Models.Stores.StoreLocation;

public abstract class Pizza {

    protected PizzaLocalType _type;
    protected StoreLocation _storeWhereCooked;

    public PizzaLocalType getPizza(){
        return this._type;
    }

    public StoreLocation getStore(){
        return this._storeWhereCooked;
    }

    public Pizza(PizzaLocalType t, StoreLocation s){
        this._type = t;
        this._storeWhereCooked = s;
    }

    @Override
    public String toString(){
        return "Pizzaart = " + this._type + " ;  Herstellungsort = " + this._storeWhereCooked;
    }

}
