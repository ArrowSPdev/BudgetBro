package com.asquared.budgetbrover01;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class SavingsInput extends AppCompatActivity {

    private ListView savingsLV;
    private Button addBtn;
    private EditText itemEdt;
    private ArrayList<String> svgsList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // on below line we are initializing our variables.
        savingsLV = findViewById(R.id.idLVSavings);
        addBtn = findViewById(R.id.idBtnAdd);
        itemEdt = findViewById(R.id.idEdtSavingName);
        svgsList = new ArrayList<>();

        // on below line we are adding items to our list
        svgsList.add("C++");
        svgsList.add("Python");

        // on the below line we are initializing the adapter for our list view.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, svgsList);

        // on below line we are setting adapter for our list view.
        View viewById = findViewById(R.id.idLVSavings);
        savingsLV.setAdapter(adapter);

        // on below line we are adding click listener for our button.
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // on below line we are getting text from edit text
                String item = itemEdt.getText().toString();

                // on below line we are checking if item is not empty
                if (!item.isEmpty()) {

                    // on below line we are adding item to our list.
                    svgsList.add(item);

                    // on below line we are notifying adapter
                    // that data in list is updated to
                    // update our list view.
                    adapter.notifyDataSetChanged();
                }

            }
        });
    }
}
