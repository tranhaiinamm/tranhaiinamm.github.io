package com.example.ktgk_tranhainam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class profileActivity extends AppCompatActivity {
    BottomNavigationView navBottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
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

