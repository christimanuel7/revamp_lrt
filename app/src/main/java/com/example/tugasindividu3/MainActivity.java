package com.example.tugasindividu3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_open, R.string.navigation_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.bringToFront();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new BerandaFragment()).commit();
            navigationView.setCheckedItem(R.id.menu_beranda);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.menu_beranda:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new BerandaFragment()).commit();
                break;
            case R.id.menu_rute:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new RuteFragment()).commit();
                break;
            case R.id.menu_stasiun:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new StasiunFragment()).commit();
                break;
            case R.id.menu_jadwal:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new JadwalFragment()).commit();
                break;
            case R.id.menu_tentang:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new TentangFragment()).commit();
                break;
            case R.id.menu_hubungi:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HubungiFragment()).commit();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }
}