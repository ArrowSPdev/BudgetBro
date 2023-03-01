package com.asquared.budgetbrover01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SavingsDetailActivity extends AppCompatActivity
{
    private EditText savingsnameEditText, savingsamountEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savings_detail);
        initWidgets();
    }

    private void initWidgets()
    {
        savingsnameEditText = findViewById(R.id.savingsnameEditText);
        savingsamountEditText = findViewById(R.id.savingsamountEditText);
    }

    public void newSavingName(View view)
    {
        String savingsname = String.valueOf(savingsnameEditText.getText());
        String savingsamount = String.valueOf(savingsamountEditText.getText());

        int id = Savings.savingsArrayList.size();
        Savings newSavings = new Savings(id, savingsname, savingsamount);
        Savings.savingsArrayList.add(newSavings);
        finish();
    }
}