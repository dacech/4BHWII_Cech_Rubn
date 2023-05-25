package Models.Stores;

import Models.Stores.Locations.StoreBerlin;
import Models.Stores.Locations.StoreHamburg;
import Models.Stores.Locations.StoreRostock;

public class StoreFactory {

    public static Store newLocation(StoreLocation loc){

        if(loc == StoreLocation.Berlin) return new StoreBerlin(loc);
        if(loc == StoreLocation.Hamburg) return new StoreHamburg(loc);
        return new StoreRostock(loc);
    }

}
