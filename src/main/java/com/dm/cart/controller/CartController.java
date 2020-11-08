package com.dm.cart.controller;

import com.dm.cart.model.Item;
import com.dm.cart.model.CartResponse;
import com.dm.cart.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class CartController {

    //1. field based DI
//    @Autowired
     private ItemService itemService;

    //2. setter based DI
//    @Autowired
//    void setItemService (ItemService itemService){
//        this.itemService = itemService;
//    }

    //3. const based DI
    @Autowired
     CartController(ItemService itemService){
         this.itemService = itemService;
     }

    @GetMapping(value = "/getCartItems", produces = MediaType.APPLICATION_JSON_VALUE)
    public CartResponse getCartItems(){

        // populate Cart Response
        CartResponse cartResponse = new CartResponse();
        cartResponse.setCartItems(itemService.getItems());                // pass the cart items in cart response

        // return the response
        return cartResponse;


    }


}
