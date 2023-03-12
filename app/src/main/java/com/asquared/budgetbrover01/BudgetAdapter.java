package com.asquared.budgetbrover01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class BudgetAdapter extends ArrayAdapter<Budget>
{
    public BudgetAdapter(Context context, ArrayList<com.asquared.budgetbrover01.Budget> notes)
    {
        super(context, 0, notes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        Budget budget = getItem(position);
        if(convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.budget_cell, parent, false);

        TextView title = convertView.findViewById(R.id.budgetTitle);
        TextView desc = convertView.findViewById(R.id.budgetDesc);

        title.setText(budget.getTitle());
        desc.setText(budget.getDescription());

        return convertView;
    }
}