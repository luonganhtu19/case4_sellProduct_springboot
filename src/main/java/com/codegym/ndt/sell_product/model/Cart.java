package com.codegym.ndt.sell_product.model;

public class Cart {
    private long idCart;
    private User user;
    private String statusCart;

    public Cart(){}
    public long getIdCart() {
        return idCart;
    }

    public void setIdCart(long idCart) {
        this.idCart = idCart;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getStatusCart() {
        return statusCart;
    }

    public void setStatusCart(String statusCart) {
        this.statusCart = statusCart;
    }
}
