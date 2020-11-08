package com.dm.cart.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CartResponse {

    @JsonProperty("cartItems")
    List<Item> cartItems;

    public List<Item> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<Item> cartItems) {
        this.cartItems = cartItems;
    }
}
