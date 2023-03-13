/*package com.asquared.budgetbrover01;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class BudgetInput extends AppCompatActivity {

    // Button BtnSvgInput;

    private EditText EdtBudgetName, EdtBudgetAmount;

    //public ListView savingsLV;
    //public Button addsvgBtn;
    //public ArrayList<String> svgsList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget_input);
        initWidgets();
    }

    private void initWidgets()
    {
        EdtBudgetName = findViewById(R.id.EdtBudgetName);
        EdtBudgetAmount = findViewById(R.id.EdtBudgetAmount);
    }

    public void saveBudget(View view)
    {
        String budgetName = String.valueOf(EdtBudgetName.getText());
        String budgetAmount = String.valueOf(EdtBudgetAmount.getText());

        int id =Budget.BudgetArrayList.size();
        Budget newBudget = new Budget(id, budgetName, budgetAmount);
        Budget.BudgetArrayList.add(newBudget);
        finish();

    }
}*/