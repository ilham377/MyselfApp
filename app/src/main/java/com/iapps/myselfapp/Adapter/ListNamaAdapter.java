package com.iapps.myselfapp.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.iapps.myselfapp.Entity.nama;
import com.iapps.myselfapp.R;

import java.util.ArrayList;

public class ListNamaAdapter extends RecyclerView.Adapter<ListNamaAdapter.ListViewHolder> {
    private ArrayList<nama> listN;
    public ListNamaAdapter(ArrayList<nama> list){
        this.listN=list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_homefragment_nama,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        nama day = listN.get(position);
        holder.tvNama.setText(day.getNama());
        holder.tvNim.setText(day.getNim());

    }

    @Override
    public int getItemCount() {
        return listN.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama, tvNim;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvNim = itemView.findViewById(R.id.tv_nim);
        }
    }
}
