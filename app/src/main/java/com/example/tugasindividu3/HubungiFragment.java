package com.example.tugasindividu3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HubungiFragment extends Fragment {
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hubungi, container,false);

        CardView btnFb=view.findViewById(R.id.btn_facebook);
        CardView btnTwitter=view.findViewById(R.id.btn_twitter);
        CardView btnIg=view.findViewById(R.id.btn_instagram);
        CardView btnTelepon=view.findViewById(R.id.btn_telepon);

        btnFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent facebookIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.link_facebook)));
                startActivity(facebookIntent);
            }
        });

        btnTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent twitterIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.link_twitter)));
                startActivity(twitterIntent);
            }
        });

        btnIg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent instagramIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.link_instagram)));
                startActivity(instagramIntent);
            }
        });

        btnTelepon.setOnClickListener(new View.OnClickListener() {
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