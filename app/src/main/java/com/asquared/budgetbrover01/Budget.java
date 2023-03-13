/*package com.asquared.budgetbrover01;

import java.util.ArrayList;
import java.util.Date;

public class Budget
{
    public static ArrayList<com.asquared.budgetbrover01.Budget> budgetArrayList = new ArrayList<>();
    public static String BUDGET_EDIT_EXTRA =  "budgetEdit";

    private int id;
    private String title;
    private String description;
    private Date deleted;

    public Budget(int id, String title, String description, Date deleted)
    {
        this.id = id;
        this.title = title;
        this.description = description;
        this.deleted = deleted;
    }

    public Budget(int id, String title, String description)
    {
        this.id = id;
        this.title = title;
        this.description = description;
        deleted = null;
    }

    public static codewithcal.au.sqliteandroidstudiotutorial.Budget getBudgetForID(int passedNoteID)
    {
        for (codewithcal.au.sqliteandroidstudiotutorial.Budget budget : budgetArrayList)
        {
            if(budget.getId() == passedNoteID)
                return budget;
        }

        return null;
    }

    public static ArrayList<codewithcal.au.sqliteandroidstudiotutorial.Budget> nonDeletedNotes()
    {
        ArrayList<codewithcal.au.sqliteandroidstudiotutorial.Budget> nonDeleted = new ArrayList<>();
        for(codewithcal.au.sqliteandroidstudiotutorial.Budget budget : budgetArrayList)
        {
            if(budget.getDeleted() == null)
                nonDeleted.add(budget);
        }

        return nonDeleted;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Date getDeleted()
    {
        return deleted;
    }

    public void setDeleted(Date deleted)
    {
        this.deleted = deleted;
    }
}*/