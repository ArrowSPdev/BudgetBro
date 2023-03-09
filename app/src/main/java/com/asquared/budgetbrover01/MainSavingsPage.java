package com.asquared.budgetbrover01;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainSavingsPage extends AppCompatActivity {



    private ListView savingsLV;
    Button BtnSvgInput;
    private ArrayList<String> svgsList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_savings_page);

        // on below line we are setting adapter for our list view.
        ListView lv = (ListView) findViewById(R.id.SavingsLV);
        ListAdapter adapter;


        Button BtnSvgInput = (Button) findViewById(R.id.BtnSvgInput);

        BtnSvgInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoSavingInput(); }
        });
    }

    private void gotoSavingInput()  {
    Intent intent = new Intent(MainSavingsPage.this, SavingInputPage.class);
    startActivity(intent);
    }
}
