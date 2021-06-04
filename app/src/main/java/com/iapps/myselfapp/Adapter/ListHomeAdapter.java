package com.iapps.myselfapp.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.iapps.myselfapp.Entity.profile;
import com.iapps.myselfapp.R;

import java.util.ArrayList;

public class ListHomeAdapter extends RecyclerView.Adapter<ListHomeAdapter.ListViewHolder>{
    private ArrayList<profile> listProfile;

    public ListHomeAdapter(ArrayList<profile> list){
        this.listProfile=list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_homefragment,parent,false);
        return new ListViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        profile prof = listProfile.get(position);
        holder.tvJudul.setText(prof.getJudul());
        holder.tvDetail.setText(prof.getDetail());
    }

    @Override
    public int getItemCount() {
        return listProfile.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tvJudul,tvDetail;

        ListViewHolder(View itemView) {
            super(itemView);
            tvJudul = itemView.findViewById(R.id.tv_heading);
            tvDetail = itemView.findViewById(R.id.tv_detail);
        }
    }
}
