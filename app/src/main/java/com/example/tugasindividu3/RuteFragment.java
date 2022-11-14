package com.example.tugasindividu3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

public class RuteFragment extends Fragment {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_rute,container,false);
        addFragment(view);
        return view;
    }

    private void addFragment(View view) {
        tabLayout=view.findViewById(R.id.tab_layout);
        viewPager=view.findViewById(R.id.viewpager);
        ViewPagerAdapter adapter=new ViewPagerAdapter(getChildFragmentManager());
        adapter.addFragment(new Tab_Rute1(),"Pegangsaan - Velodrome");
        adapter.addFragment(new Tab_Rute2(),"Velodrome - Pegangsaan");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}