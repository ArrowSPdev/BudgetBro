package com.asquared.budgetbrover01;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class SavingInputPage extends AppCompatActivity {

   // Button BtnSvgInput;

    private EditText EdtSavingName, EdtSavingAmount;

    //public ListView savingsLV;
    //public Button addsvgBtn;
    //public ArrayList<String> svgsList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saving_input_page);
        initWidgets();
    }

    private void initWidgets()
    {
        EdtSavingName = findViewById(R.id.EdtSavingName);
        EdtSavingAmount = findViewById(R.id.EdtSavingAmount);
    }

    public void saveSaving(View view)
    {
        String svgName = String.valueOf(EdtSavingName.getText());
        String svgAmount = String.valueOf(EdtSavingAmount.getText());

        int id =Saving.savingArrayList.size();
        Saving newSaving = new Saving(id, svgName, svgAmount);
        Saving.savingArrayList.add(newSaving);
        finish();

    }





        // on below line we are initializing our variables.
        //savingsLV = findViewById(R.id.SavingsLV);
        //addsvgBtn = findViewById(R.id.BtnAdd);
        //svgnameEdt = findViewById(R.id.EdtSavingName);
        //svgsList = new ArrayList<>();



        // on the below line we are initializing the adapter for our list view.
        //ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, svgsList);


        // on below line we are adding click listener for our button.
       // addsvgBtn.setOnClickListener(new View.OnClickListener() {

           // @Override
           // public void onClick(View v) {
                // on below line we are getting text from edit text
                //String item = svgnameEdt.getText().toString();

                // on below line we are checking if item is not empty
               // if (!item.isEmpty()) {

                    // on below line we are adding item to our list.
                    //svgsList.add(item);

                    // on below line we are notifying adapter
                    // that data in list is updated to
                    // update our list view.
                    //adapter.notifyDataSetChanged();
               // }

           // }
       // });
   // }
}
