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

public class SavingAdapter extends ArrayAdapter<Saving> {

    public SavingAdapter(Context context, List<Saving> savings)
    {
        super(context, 0, savings);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        Saving saving = getItem(position);
        if(convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.saving_cell, parent, false);

        TextView svgname = convertView.findViewById(R.id.cellSavingName);
        TextView svgamount = convertView.findViewById(R.id.cellSavingAmount);

        svgname.setText(saving.getSavingName());
        svgamount.setText(saving.getSavingAmount());

        return convertView;
    }
}
