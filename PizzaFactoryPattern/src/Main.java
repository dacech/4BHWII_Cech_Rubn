import Models.Pizzas.Pizza;
import Models.Pizzas.PizzaType;
import Models.Stores.Store;
import Models.Stores.StoreFactory;
import Models.Stores.StoreLocation;

public class Main {

    public static void main(String[] args) {

        Store store = StoreFactory.newLocation(StoreLocation.Hamburg);

        Pizza normalPizza = store.cook(PizzaType.Salami);
        Pizza overloadPizza = store.cook(PizzaType.Hawaii, StoreLocation.Hamburg);

        //Ausgabe
        System.out.println("Normale Pizza: "    + normalPizza.toString());
        System.out.println("Überladene Pizza: " + overloadPizza.toString());

    }

}
