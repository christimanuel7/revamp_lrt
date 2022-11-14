package com.example.tugasindividu3;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class BerandaFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_beranda, container,false);
        ImageButton btnPromosi1 = (ImageButton) view.findViewById(R.id.promosi1);
        ImageButton btnPromosi2 = (ImageButton) view.findViewById(R.id.promosi2);
        ImageButton btnPromosi3 = (ImageButton) view.findViewById(R.id.promosi3);
        ImageButton btnPromosi4 = (ImageButton) view.findViewById(R.id.promosi4);

        ImageButton btnTelpon= (ImageButton) view.findViewById(R.id.btn_telpon);

        btnPromosi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent promosi_1 = new Intent(getActivity(),WebpageActivity.class);
                startActivity(promosi_1);
            }
        });

        btnPromosi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent promosi_2 = new Intent(getActivity(),WebpageActivity2.class);
                startActivity(promosi_2);
            }
        });

        btnPromosi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent promosi_3 = new Intent(getActivity(),WebpageActivity3.class);
                startActivity(promosi_3);
            }
        });

        btnPromosi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent promosi_4 = new Intent(getActivity(),WebpageActivity4.class);
                startActivity(promosi_4);
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