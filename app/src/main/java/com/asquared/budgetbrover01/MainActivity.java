package com.asquared.budgetbrover01;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton savingButton;
    ImageButton BudgetButton;
    Button svgsBtntest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton savingButton = (ImageButton) findViewById(R.id.savingButton);
        ImageButton budgetButton = (ImageButton) findViewById(R.id.budgetButton);
        Button svgsBtntest = (Button) findViewById(R.id.svgsBtntest);

        savingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoSavingsPage();
            }
        });
        budgetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoBudgetPage();
            }
        });

    }

    private void gotoBudgetPage() {
        Intent intent = new Intent(MainActivity.this, MainBudgetPage.class);
        startActivity(intent);
    }

    private void gotoSavingsPage() {
        Intent intent = new Intent(MainActivity.this, MainSavingsPage.class);
        startActivity(intent);
    }
}
