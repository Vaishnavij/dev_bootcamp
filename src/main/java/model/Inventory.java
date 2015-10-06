package model;

import java.util.*;

/**
 * Created by vaishnavi on 06/10/15.
 */
public class Inventory {

    //private Map<Item,Integer> inventoryList = new HashMap<Item,Integer>();

    private List<Item> itemList ;

    public Inventory(List<Item> itemList){
        this.itemList = new ArrayList<>(itemList);
    }


    public List<Item> getAvailableItems(){

       return Collections.unmodifiableList(itemList);
    }
}

