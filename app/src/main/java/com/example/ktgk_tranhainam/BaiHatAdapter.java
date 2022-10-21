package com.example.ktgk_tranhainam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class BaiHatAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<BaiHat> baiHatList;

    public BaiHatAdapter(Context context, int layout, List<BaiHat> baiHatList) {
        this.context = context;
        this.layout = layout;
        this.baiHatList = baiHatList;
    }

    @Override
    public int getCount() {
        return baiHatList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        convertView = inflater.inflate(layout, null);
//
//        TextView tvTenBaiHat = (TextView) convertView.findViewById(R.id.tvTenBaiHat);
//        TextView tvCaSi = (TextView) convertView.findViewById(R.id.tvCaSi);
//        ImageView imgBaiHat = (ImageView) convertView.findViewById(R.id.imgBaiHat);
//
//        tvTenBaiHat.setText(baiHatList.get(position).tenBaiHat);
//        tvCaSi.setText(baiHatList.get(position).caSi);
////        imgBaiHat.setImageResource(baiHatList.get(position).hinhAnh);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(layout, null);

        BaiHat baiHat = baiHatList.get(position);

        TextView tvTenBaiHat = convertView.findViewById(R.id.tvTenBaiHat);
        TextView tvCaSi = convertView.findViewById(R.id.tvCaSi);
        ImageView imgBaiHat = convertView.findViewById(R.id.imgBaiHat);

        tvTenBaiHat.setText(baiHat.getTenBaiHat());
        tvCaSi.setText(baiHat.getCaSi());
        imgBaiHat.setImageResource(baiHat.getHinhAnh());


        return convertView;
    }
}
