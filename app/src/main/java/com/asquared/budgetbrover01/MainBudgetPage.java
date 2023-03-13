/*package com.asquared.budgetbrover01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainBudgetPage extends AppCompatActivity {

    // on below line we are creating variables.
    public ListView BudgetLV;
    public Button addBudgetBtn;
    public EditText BudgetEdt;
    public ArrayList<String> BudgetList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_budget_page);

        // on below line we are initializing our variables.
        BudgetLV = findViewById(R.id.BudgetLV);
        addBudgetBtn = findViewById(R.id.AddBudget);
        BudgetList = new ArrayList<>();



        // on the below line we are initializing the adapter for our list view.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, BudgetList);

        // on below line we are setting adapter for our list view.
        ListView lv = (ListView) findViewById(R.id.BudgetLV);
        lv.setAdapter(adapter);


        addBudgetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoBudgetInputPage();
            }

            private void gotoBudgetInputPage() {
                Intent intent = new Intent(MainBudgetPage.this, BudgetInput.class);
                startActivity(intent);
            }
        });


        }
    }

public class MainBudgetPage extends AppCompatActivity
{
    private ListView BudgetLV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_budget_page);
        initWidgets();
        //loadFromDBToMemory();
        setBudgetAdapter();
        setOnClickListener();
    }


    private void initWidgets()
    {
        BudgetLV = findViewById(R.id.BudgetLV);
    }

    /*private void loadFromDBToMemory()
    {
        SQLiteManager sqLiteManager = SQLiteManager.instanceOfDatabase(this);
        sqLiteManager.populateNoteListArray();
    }

    private void setBudgetAdapter()
    {
        BudgetAdapter noteAdapter = new BudgetAdapter(getApplicationContext(), Budget.nonDeletedBudgets());
        BudgetLV.setAdapter(noteAdapter);
    }


    private void setOnClickListener()
    {
        BudgetLV.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
            {
                Budget selectedBudget = (Budget) BudgetLV.getItemAtPosition(position);
                Intent editNoteIntent = new Intent(getApplicationContext(), BudgetDetailActivity.class);
                editNoteIntent.putExtra(BudgetLV.BUDGET_EDIT_EXTRA, selectedBudget.getId());
                startActivity(editNoteIntent);
            }
        });
    }


    public void newNote(View view)
    {
        Intent newBudgetIntent = new Intent(this, BudgetDetailActivity.class);
        startActivity(newBudgetIntent);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        setBudgetAdapter();
    }
} */