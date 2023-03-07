package com.asquared.budgetbrover01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageButton savingButton;
    Button svgsBtntest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        savingButton= (ImageButton) findViewById(R.id.savingButton);
                savingButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent=new Intent(MainActivity.this,MainSavingsPage.class);
                        startActivity(intent);

                    }
                });

    }
}
