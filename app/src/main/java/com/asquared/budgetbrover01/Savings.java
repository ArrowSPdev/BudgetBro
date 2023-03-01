package com.asquared.budgetbrover01;

import java.util.ArrayList;

public class Savings
{
    public static ArrayList<Savings> savingsArrayList = new ArrayList<>();

    private int id;
    private String name;
    private String amount;
    private String deleted;

    public void SavingsAdapter(int id, String name, String amount, String deleted)
    {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.deleted = deleted;
    }

    public void SavingsAdapter(int id, String name, String amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        deleted = null;
    }

    public Savings(int id, String savingsname, String savingsamount) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }
}


