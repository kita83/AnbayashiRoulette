package com.app.strkita.anbayashiroulette;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

/**
 *
 * Created by strkita on 2017/06/15.
 */

public class AnbayashiAdapter extends RecyclerView.Adapter<AnbayashiViewHolder> {
    private ArrayList<AnbayashiData> rouletteDataset;

    public AnbayashiAdapter(ArrayList<AnbayashiData> rourette) {
        this.rouletteDataset = rourette;
    }

    @Override
    public AnbayashiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);
        return new AnbayashiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AnbayashiViewHolder holder, final int listPosition) {
        holder.textViewNumber.setText(rouletteDataset.get(listPosition).getNumber() + "本");
        holder.textViewComment.setText(rouletteDataset.get(listPosition).getComment());
        holder.base.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),
                        "おまけ" + rouletteDataset.get(listPosition).getAddition() + "本",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        if (rouletteDataset != null) {
            return rouletteDataset.size();
        } else {
            return 0;
        }
    }
}
