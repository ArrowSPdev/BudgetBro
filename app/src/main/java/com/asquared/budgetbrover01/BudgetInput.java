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

public class BudgetInput extends AppCompatActivity {

    public ListView BudgetLVInputPage;
    public Button confirmBudgetBtn;
    public EditText BudgetEdt;
    public ArrayList<String> BudgetListInput;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saving_input_page);

        // on below line we are initializing our variables.
        BudgetLVInputPage = findViewById(R.id.BudgetLV);
        confirmBudgetBtn = findViewById(R.id.ConfirmBudget);
        BudgetEdt = findViewById(R.id.EdtBudget);
        BudgetListInput = new ArrayList<>();



        // on the below line we are initializing the adapter for our list view.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, BudgetListInput);


        // on below line we are adding click listener for our button.
        confirmBudgetBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // on below line we are getting text from edit text
                String item = BudgetEdt.getText().toString();

                // on below line we are checking if item is not empty
                if (!item.isEmpty()) {

                    // on below line we are adding item to our list.
                    BudgetListInput.add(item);

                    // on below line we are notifying adapter
                    // that data in list is updated to
                    // update our list view.
                    adapter.notifyDataSetChanged();
                }

            }
        });
    }
}
