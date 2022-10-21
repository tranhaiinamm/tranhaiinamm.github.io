package com.example.ktgk_tranhainam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Activity_item1 extends AppCompatActivity {

     Toolbar toolbar;
     TextView txtTimeSong, getTxtTotalTimeSong;
     SeekBar sktime;
     ImageButton imgplay, imgrepeat, imgnext, imgpre, imgrandom;
     ViewPager viewPagerplaynhac;
    BottomNavigationView navBottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item1);

        Button button = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        navBottom = (BottomNavigationView) findViewById(R.id.nav_bottom);

        navBottom.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        onClickToHome();
                        break;
                    case R.id.payment:
                        onClickToProfile();
                        break;
                    case R.id.notification:
                        break;
                    case R.id.account:
                        onClickToAccount();
                        break;
                }
                return true;
            }
        });

    }
    private void onClickToAccount(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    private void onClickToHome(){
        Intent intent = new Intent(this, Activity_list.class);
        startActivity(intent);
        finish();
    }
    private void onClickToProfile(){
        Intent intent = new Intent(this, profileActivity.class);
        startActivity(intent);
        finish();
    }
}