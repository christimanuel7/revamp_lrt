package com.example.tugasindividu3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class StasiunFragment extends Fragment {

    private ArrayList<Stasiun> StasiunArrayList;
    private String[] stasiunHeading;
    private String[] stasiunAlamat;
    private int[] imageResourceID;
    private RecyclerView recyclerview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_stasiun, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        dataInitialize();

        recyclerview=view.findViewById(R.id.recycler_view);
        recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerview.setHasFixedSize(true);
        StasiunAdapter stasiunAdapter=new StasiunAdapter(getContext(),StasiunArrayList);
        recyclerview.setAdapter(stasiunAdapter);
        stasiunAdapter.notifyDataSetChanged();
    }

    private void dataInitialize(){
        StasiunArrayList=new ArrayList<>();
        stasiunHeading=new String[]{
            getString(R.string.judul_stasiun1),
            getString(R.string.judul_stasiun2),
            getString(R.string.judul_stasiun3),
            getString(R.string.judul_stasiun4),
            getString(R.string.judul_stasiun5),
            getString(R.string.judul_stasiun6),
        };

        stasiunAlamat=new String[]{
                getString(R.string.alamat_stasiun1),
                getString(R.string.alamat_stasiun2),
                getString(R.string.alamat_stasiun3),
                getString(R.string.alamat_stasiun4),
                getString(R.string.alamat_stasiun5),
                getString(R.string.alamat_stasiun6),
        };

        imageResourceID=new int[]{
                R.drawable.stasiun_pd,
                R.drawable.stasiun_bu,
                R.drawable.stasiun_bs,
                R.drawable.stasiun_pl,
                R.drawable.stasiun_eq,
                R.drawable.stasiun_vd,
        };

        for(int i=0;i<stasiunHeading.length;i++){
            Stasiun stasiun=new Stasiun(stasiunHeading[i],stasiunAlamat[i],imageResourceID[i]);
            StasiunArrayList.add(stasiun);
        }
    }
}