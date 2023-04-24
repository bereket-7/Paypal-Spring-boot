package com.example.pay;

public class Order {

    private Double totalPrice;

    private String currency;

    private String intent;

    private String method;
    
    private String description;

    public Order() {
    }

    public Order(Double totalPrice, String currency, String intent, String method, String description) {
        this.totalPrice = totalPrice;
        this.currency = currency;
        this.intent = intent;
        this.method = method;
        this.description = description;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
