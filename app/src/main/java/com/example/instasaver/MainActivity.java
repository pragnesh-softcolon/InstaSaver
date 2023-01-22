package com.example.instasaver;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.instasaver.Fragment.help;
import com.example.instasaver.Fragment.igtv;
import com.example.instasaver.Fragment.photo;
import com.example.instasaver.Fragment.profile;
import com.example.instasaver.Fragment.reel;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity
{
    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;
    Boolean result;
    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        navigationView=findViewById(R.id.navigationview);
        drawerLayout = findViewById(R.id.drawerlayout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        if(savedInstanceState==null)
        {
            navigationView.setCheckedItem(R.id.Reel);
            loadFrag(new reel(),true);
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        navigationView.setNavigationItemSelectedListener(item -> {
            int id=item.getItemId();
            navigationView.setCheckedItem(id);
            switch (id)
            {
                case R.id.Photo:
                {
                    loadFrag(new photo(),false);
                    drawerLayout.closeDrawer(GravityCompat.START);
                    break;
                }
                case R.id.Help:
                {
                    loadFrag(new help(),false);
                    drawerLayout.closeDrawer(GravityCompat.START);
                    break;
                }
                case R.id.Reel:
                {
                    loadFrag(new reel(),false);
                    drawerLayout.closeDrawer(GravityCompat.START);
                    break;
                }
                case R.id.IGTV:
                {
                    loadFrag(new igtv(),false);
                    drawerLayout.closeDrawer(GravityCompat.START);
                    break;
                }
                case R.id.Profile:
                {
                    loadFrag(new profile(),false);
                    drawerLayout.closeDrawer(GravityCompat.START);
                    break;
                }
                default:
                {
                    Toast.makeText(MainActivity.this, "Something is Wrong", Toast.LENGTH_SHORT).show();
                    finish();
                    break;
                }
            }
            return true;
        });
    }

    public void loadFrag(Fragment fragment, Boolean flag)
    {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        if (flag)
            ft.add(R.id.framelayout,fragment);
        else
            ft.replace(R.id.framelayout,fragment);
        ft.commit();
        result=flag;
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {

        if (actionBarDrawerToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}