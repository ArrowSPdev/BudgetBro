package com.asquared.budgetbrover01;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainSavingsPage extends AppCompatActivity {

    private ListView savingsLV;

    // private List<Saving> savings = new ArrayList<>();
   // private ArrayAdapter<Saving> adapter;
   // Button BtnSvgInput;
    //private ArrayList<String> svgsList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_savings_page);

        initWidgets();
        setSavingAdapter();

        //on below line we are setting adapter for our list view.
        //ListView lv = (ListView) findViewById(R.id.SavingsLV);
        //ListAdapter adapter;


       //Button BtnSvgInput = (Button) findViewById(R.id.BtnSvgInput);

        //BtnSvgInput.setOnClickListener(new View.OnClickListener() {
           // @Override
            //public void onClick(View v) {
            //    gotoSavingInput(); }
       // });
    }





    private void initWidgets()
    {
        savingsLV = findViewById(R.id.SavingsLV);

    }

    private void setSavingAdapter()
    {
        SavingAdapter savingAdapter = new SavingAdapter(getApplicationContext(), Saving.ArrayList);
        savingsLV.setAdapter(savingAdapter);

    }

    public void newSaving(View view)
    {
        Intent newSavingIntent = new Intent(this, SavingInputPage.class);
        startActivity(newSavingIntent);
    }
}
