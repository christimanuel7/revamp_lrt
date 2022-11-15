package com.example.tugasindividu3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class BerandaFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_beranda, container,false);

        Button btnRute= view.findViewById(R.id.btn_rute);
        Button btnStasiun= view.findViewById(R.id.btn_stasiun);
        Button btnJadwal= view.findViewById(R.id.btn_jadwal);

        ImageButton btnPromosi1 =  view.findViewById(R.id.promosi1);
        ImageButton btnPromosi2 =  view.findViewById(R.id.promosi2);
        ImageButton btnPromosi3 =  view.findViewById(R.id.promosi3);
        ImageButton btnPromosi4 =  view.findViewById(R.id.promosi4);

        Button btnBerita1 = view.findViewById(R.id.btn_berita1);
        Button btnBerita2 = view.findViewById(R.id.btn_berita2);
        Button btnBerita3 = view.findViewById(R.id.btn_berita3);
        Button btnBerita4 = view.findViewById(R.id.btn_berita4);

        ImageButton btnTelpon= view.findViewById(R.id.btn_telpon);

        btnRute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Fragment ruteFrag=new RuteFragment();
               FragmentTransaction fRute=getActivity().getSupportFragmentManager().beginTransaction();
               fRute.replace(R.id.fragment_container,ruteFrag).commit();
               getActivity().setTitle(getString(R.string.menu_rute));
            }
        });

        btnStasiun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment stasiunFrag=new StasiunFragment();
                FragmentTransaction fRute=getActivity().getSupportFragmentManager().beginTransaction();
                fRute.replace(R.id.fragment_container,stasiunFrag).commit();
                getActivity().setTitle(getString(R.string.menu_stasiun));
            }
        });

        btnJadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment jadwalFrag=new JadwalFragment();
                FragmentTransaction fRute=getActivity().getSupportFragmentManager().beginTransaction();
                fRute.replace(R.id.fragment_container,jadwalFrag).commit();
                getActivity().setTitle(getString(R.string.menu_jadwal));
            }
        });

        btnPromosi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent promosi_1 = new Intent(getActivity(), PromosiActivity.class);
                startActivity(promosi_1);
            }
        });

        btnPromosi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent promosi_2 = new Intent(getActivity(), PromosiActivity2.class);
                startActivity(promosi_2);
            }
        });

        btnPromosi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent promosi_3 = new Intent(getActivity(), PromosiActivity3.class);
                startActivity(promosi_3);
            }
        });

        btnPromosi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent promosi_4 = new Intent(getActivity(), PromosiActivity4.class);
                startActivity(promosi_4);
            }
        });

        btnBerita1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent berita_1 = new Intent(getActivity(),BeritaActivity.class);
                startActivity(berita_1);
            }
        });

        btnBerita2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent berita_2 = new Intent(getActivity(),BeritaActivity2.class);
                startActivity(berita_2);
            }
        });

        btnBerita3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent berita_3 = new Intent(getActivity(),BeritaActivity3.class);
                startActivity(berita_3);
            }
        });

        btnBerita4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent berita_4 = new Intent(getActivity(),BeritaActivity4.class);
                startActivity(berita_4);
            }
        });

        btnTelpon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor = "02180617490" ;
                Intent panggil = new Intent(Intent. ACTION_DIAL);
                panggil.setData(Uri. fromParts("tel",nomor,null));
                startActivity(panggil);
            }
        });
        return view;
    }
}