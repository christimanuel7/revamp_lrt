package com.example.tugasindividu3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTabHost;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.google.android.material.tabs.TabLayout;

public class JadwalFragment extends Fragment {

    TabLayout tabLayout;
    ViewPager viewPager;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_jadwal,container,false);
        addFragment(view);
        return view;
    }

    private void addFragment(View view) {
        tabLayout=view.findViewById(R.id.tab_layout);
        viewPager=view.findViewById(R.id.viewpager);
        ViewPagerAdapter adapter=new ViewPagerAdapter(getChildFragmentManager());
        adapter.addFragment(new Tab_Jadwal1(),"Pegangsaan - Velodrome");
        adapter.addFragment(new Tab_Jadwal2(),"Velodrome - Pegangsaan");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}