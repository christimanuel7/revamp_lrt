package com.example.tugasindividu3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class StasiunAdapter extends RecyclerView.Adapter<StasiunAdapter.StasiunViewHolder>{

    Context context;
    ArrayList<Stasiun>stasiunArrayList;

    public StasiunAdapter(Context context, ArrayList<Stasiun> stasiunArrayList) {
        this.context=context;
        this.stasiunArrayList=stasiunArrayList;
    }

    @NonNull
    @Override
    public StasiunViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.item_stasiun,parent,false);
        return new StasiunViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull StasiunViewHolder holder, int position) {
        Stasiun stasiun=stasiunArrayList.get(position);
        holder.txtStasiun.setText(stasiun.nama);
        holder.txtAlamat.setText(stasiun.alamat);
        holder.titleImage.setImageResource(stasiun.image);
    }

    @Override
    public int getItemCount() {
        return stasiunArrayList.size();
    }

    public static class StasiunViewHolder extends RecyclerView.ViewHolder{

        ImageView titleImage;
        TextView txtStasiun,txtAlamat;

        public StasiunViewHolder(@NonNull View itemView) {
            super(itemView);
            titleImage=itemView.findViewById(R.id.img_stasiun);
            txtStasiun=itemView.findViewById(R.id.txt_stasiun);
            txtAlamat=itemView.findViewById(R.id.txt_alamat);

        }
    }
}
