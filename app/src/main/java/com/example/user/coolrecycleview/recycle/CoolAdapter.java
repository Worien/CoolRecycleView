package com.example.user.coolrecycleview.recycle;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.user.coolrecycleview.R;

import java.util.List;

/**
 * Created by user on 8/16/2016.
 */
public class CoolAdapter extends RecyclerView.Adapter<CoolAdapter.CoolViewHolder> {

    List<String> items;

    public CoolAdapter(List<String> items) {
        this.items = items;
    }

    @Override
    public CoolViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cool_item, parent, false);
        CoolViewHolder coolViewHolder = new CoolViewHolder(v);
        return coolViewHolder;
    }

    @Override
    public void onBindViewHolder(CoolViewHolder holder, int position) {
        holder.txtCool.setText(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class CoolViewHolder extends RecyclerView.ViewHolder {
        TextView txtCool;
        public CoolViewHolder(View itemView) {
            super(itemView);
            txtCool = (TextView) itemView.findViewById(R.id.txt_cool);
        }
    }
}
