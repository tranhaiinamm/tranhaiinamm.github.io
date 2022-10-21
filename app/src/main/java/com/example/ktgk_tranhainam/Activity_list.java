package com.example.ktgk_tranhainam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class Activity_list extends AppCompatActivity {
//    private ListView listView;
//    private String[] listData;
//    private ArrayAdapter<String> adapter;
//    private Context context;
    ListView lv;
    ArrayList<BaiHat> arrayList;
    BaiHatAdapter adapter;
    BottomNavigationView navBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);




    lv = (ListView) findViewById(R.id.lvBaiHat);
    arrayList = new ArrayList<>();

    arrayList.add(new BaiHat("Waiting For You", "MONO, Onionn", R.drawable.img));
    arrayList.add(new BaiHat("Chuyện Đôi Ta",   "Emcee L, Muộii ", R.drawable.img_1));
    arrayList.add(new BaiHat("Em Là","MONO, Onionn", R.drawable.img_2 ));
    arrayList.add(new BaiHat("PhieuLing","Hải Lưu", R.drawable.img_3 ));
    arrayList.add(new BaiHat("Người Kế Nhiệm","Anh Khoa", R.drawable.img_4 ));
    arrayList.add(new BaiHat("Vì Mẹ Anh Bắt Chia Tay","Miu Lê, Karik, Châu Đăng Khoa", R.drawable.img_5 ));
    adapter = new BaiHatAdapter(this, R.layout.dong_baihat,arrayList);
    lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent();
                    intent.setClass(Activity_list.this,Activity_item1.class);
                    startActivity(intent);
                }
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
