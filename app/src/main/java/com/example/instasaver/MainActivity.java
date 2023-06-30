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
import android.app.DownloadManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.MenuItem;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.widget.Toast;

import com.example.instasaver.Fragment.help;
import com.example.instasaver.Fragment.igtv;
import com.example.instasaver.Fragment.photo;
import com.example.instasaver.Fragment.profile;
import com.example.instasaver.Fragment.reel;
import com.example.instasaver.Pref.pref;
import com.example.instasaver.utils.textUtils;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity
{
    BottomNavigationView navigationView;
    Boolean result = true;
    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        navigationView=findViewById(R.id.navigationview);

        if(savedInstanceState==null)
        {
            loadFrag(new reel(),true);
        }
        navigationView.setOnItemSelectedListener(item -> {
            int id=item.getItemId();
            switch (id)
            {
                case R.id.Photo:
                {
                    loadFrag(new photo(),false);
                    break;
                }
                case R.id.Help:
                {
                    loadFrag(new help(),false);
                    break;
                }
                case R.id.Reel:
                {
                    loadFrag(new reel(),true);
                    break;
                }
                case R.id.IGTV:
                {
                    loadFrag(new igtv(),false);
                    break;
                }
                case R.id.Profile:
                {
                    loadFrag(new profile(),false);
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
    public boolean onCreateOptionsMenu(android.view.Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu2,menu);
        return true;
    }

    public void loadFrag(Fragment fragment, Boolean flag)
    {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        if (flag)
            ft.replace(R.id.framelayout,fragment);
        else
            ft.replace(R.id.framelayout,fragment);
        ft.commit();
        result=flag;
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
//        Toast.makeText(this, ""+item, Toast.LENGTH_SHORT).show();
        if(item.getItemId() == R.id.update){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(textUtils.UPDATE_URL));
            startActivity(intent);
//            Toast.makeText(this, "Update", Toast.LENGTH_SHORT).show();
            return super.onOptionsItemSelected(item);
        }
        if (item.getItemId() == R.id.logout)
        {
            new pref(getApplicationContext()).deleteCookie();
            Intent intent = new Intent(MainActivity.this, webviewLogin.class);
            startActivity(intent);
            finish();
//            Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show();
            return super.onOptionsItemSelected(item);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        if(result)
        {
            Log.e("anyText", "onBackPressed: "+result );
            finish();
        }
        else
        {
            Log.e("anyText", "onBackPressed: "+result );
            loadFrag(new reel(),true);
        }
    }
}