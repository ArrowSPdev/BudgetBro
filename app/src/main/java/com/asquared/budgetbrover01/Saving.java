package com.asquared.budgetbrover01;

public class Saving {
    private String SavingName;
    private double SavingAmount;
    private String DateDue;

    public Saving(String savingName, double savingAmount, String dateDue) {
        this.SavingName = savingName;
        this.SavingAmount = savingAmount;
        this.DateDue = dateDue;
    }

    public String getSavingName() {
        return SavingName;
    }

    public void setSavingName(String savingName) {
        this.SavingName = savingName;
    }

    public double getSavingAmount() {
        return SavingAmount;
    }

    public void setSavingAmount(double savingAmount) {
        SavingAmount = savingAmount;
    }

    public String getDateDue() {
        return DateDue;
    }

    public void setDateDue(String dateDue) {
        DateDue = dateDue;
    }
}
