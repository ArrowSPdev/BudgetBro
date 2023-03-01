package com.asquared.budgetbrover01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;


public class MainSavingsPage extends AppCompatActivity {

    private ListView savingsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_savings_page);

        initWidgets();
        setSavingsAdapter();
    }
    private void initWidgets()
    {
        savingsListView = findViewById(R.id.savingsListView);
    }

    private void setSavingsAdapter()
    {
        SavingsAdapter savingsAdapter = new SavingsAdapter(getApplicationContext(), Savings.savingsArrayList);
        savingsListView.setAdapter(savingsAdapter);
    }
    public void newSaving(View view)
    {
        Intent newSavingsIntent = new Intent(this, SavingsDetailActivity.class);
        startActivity(newSavingsIntent);
    }
}