package com.codegym.ndt.sell_product.model;

public class CartItem {
    private long idCartItem;
    private long quantity;
    private Product product;
    private Cart cart;

    public CartItem(){}
    public long getIdCartItem() {
        return idCartItem;
    }

    public void setIdCartItem(long idCartItem) {
        this.idCartItem = idCartItem;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
