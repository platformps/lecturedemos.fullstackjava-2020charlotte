package com.github.perschola.model;

public class Item implements ItemInterface {
    private String itemName;
    private String itemDesc;
    private Double itemPrice;
    private Integer quantity;
    private Integer availableQuantity;

    @Override
    public String getItemName() {
        return itemName;
    }

    @Override
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String getItemDesc() {
        return itemDesc;
    }

    @Override
    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    @Override
    public Double getItemPrice() {
        return itemPrice;
    }

    @Override
    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    @Override
    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", itemDesc='" + itemDesc + '\'' +
                ", itemPrice=" + itemPrice +
                ", quantity=" + quantity +
                ", availableQuantity=" + availableQuantity +
                '}';
    }
}
