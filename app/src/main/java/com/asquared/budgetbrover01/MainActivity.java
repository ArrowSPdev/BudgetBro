package com.asquared.budgetbrover01;

import android.content.Intent;
import android.os.Bundle;

import com.asquared.budgetbrover01.databinding.ActivitySavingsInputBinding;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.asquared.budgetbrover01.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ImageButton savingButton;
    Button svgsBtntest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton savingButton = (ImageButton) findViewById(R.id.savingButton);
        Button svgsBtntest = (Button) findViewById(R.id.svgsBtntest);
        savingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoSavingsPage();
            }
        });

        svgsBtntest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoSavingsInput();
            }
        });

    }

    private void gotoSavingsPage() {
        Intent intent = new Intent(MainActivity.this, MainSavingsPage.class);
        startActivity(intent);
    }

    private void gotoSavingsInput() {
        Intent intent = new Intent(MainActivity.this, SavingsInput.class);
        startActivity(intent);
    }
}
