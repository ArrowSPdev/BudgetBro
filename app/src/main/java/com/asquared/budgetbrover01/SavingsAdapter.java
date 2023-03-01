package com.asquared.budgetbrover01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class SavingsAdapter extends ArrayAdapter<Savings>
{
    public SavingsAdapter(Context context, List<Savings> notes)
    {
        super(context, 0, notes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

      Savings savings = null;  getItem(position);
      if(convertView == null)
          convertView = LayoutInflater.from(getContext()).inflate(R.layout.saving_cell, parent, false);

        TextView name = convertView.findViewById(R.id.cellSavingName);
        TextView amount = convertView.findViewById(R.id.cellAmount);

        name.setText(savings.getName());
        amount.setText(savings.getAmount());

        return convertView;
    }
}