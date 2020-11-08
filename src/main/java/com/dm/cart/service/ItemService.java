package com.dm.cart.service;

import com.dm.cart.model.Item;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ItemService {

    public List<Item> getItems() {

        //Item1
        Item item1 = new Item();                 //item properties as new object
        item1.setName("eraser");                    //set the name of item
        item1.setColor("red");                   // set the name of color

        //Item2
        Item item2  = new Item();
        item2.setName("pencil");
        item2.setColor("blue");

        //populate list of items.
        List<Item> items = new ArrayList<>();         // list of item, list is the interface
        items.add(item1);                              // add the cart item to the cart items-list
        items.add(item2);

        return items;

    }




}
