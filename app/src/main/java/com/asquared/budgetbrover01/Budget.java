 /*package com.asquared.budgetbrover01;

import java.util.ArrayList;
import java.util.Date;

public class Budget
{
    public static ArrayList<com.asquared.budgetbrover01.Budget> budgetArrayList = new ArrayList<>();
    public static String BUDGET_EDIT_EXTRA =  "budgetEdit";

    private int id;
    private String budgetName;
    private String budgetDescription;


    public Budget(int id, String budgetName, String budgetDescription)
    {
        this.id = id;
        this.budgetName = budgetName;
        this.budgetDescription = budgetDescription;
    }

    public static com.asquared.budgetbrover01.Budget getBudgetForID(int passedNoteID)
    {
        for (com.asquared.budgetbrover01.Budget budget : budgetArrayList)
        {
            if(budget.getId() == passedNoteID)
                return budget;
        }

        return null;
    }


    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getBudgetName()
    {
        return budgetName;
    }

    public void setBudgetName(String budgetName)
    {
        this.budgetName = budgetName;
    }

    public String getBudgetDescription()
    {
        return budgetDescription;
    }

    public void setBudgetDescription(String budgetDescription)
    {
        this.budgetDescription = budgetDescription;
    }
}*/