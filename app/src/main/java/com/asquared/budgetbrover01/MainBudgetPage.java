package com.asquared.budgetbrover01;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import com.asquared.budgetbrover01.BudgetInput;

import java.util.ArrayList;

public class MainBudgetPage extends AppCompatActivity {

    // on below line we are creating variables.
    public ListView BudgetLV;
    public Button addBudgetBtn;
    public EditText BudgetEdt;
    public ArrayList<String> BudgetList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_budget_page);

        // on below line we are initializing our variables.
        BudgetLV = findViewById(R.id.BudgetLV);
        addBudgetBtn = findViewById(R.id.AddBudget);
        BudgetList = new ArrayList<>();



        // on the below line we are initializing the adapter for our list view.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, BudgetList);

        // on below line we are setting adapter for our list view.
        ListView lv = (ListView) findViewById(R.id.BudgetLV);
        lv.setAdapter(adapter);


        addBudgetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoBudgetInputPage();
            }

            private void gotoBudgetInputPage() {
                Intent intent = new Intent(MainBudgetPage.this, BudgetInput.class);
                startActivity(intent);
            }
        });


        }
    }
