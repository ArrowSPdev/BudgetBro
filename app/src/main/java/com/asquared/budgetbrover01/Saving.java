package com.asquared.budgetbrover01;

import java.util.ArrayList;

public class Saving
{
    public static ArrayList<Saving> savingArrayList = new ArrayList<>();

    private int id;
    private String SavingName;
    private String SavingAmount;
    //private String DateDue;

    public Saving(int id, String savingName, String savingAmount) {
        this.id = id;
        SavingName = savingName;
        SavingAmount = savingAmount;
        //DateDue = dateDue;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSavingName() {
        return SavingName;
    }

    public void setSavingName(String savingName) {
        SavingName = savingName;
    }

    public String getSavingAmount() {
        return SavingAmount;
    }

    public void setSavingAmount(String savingAmount) {
        SavingAmount = savingAmount;
    }

    //public String getDateDue() {
    //    return DateDue;
   // }

    //public void setDateDue(String dateDue)
    //{
     //   DateDue = dateDue;
    }


