package com.example.ktgk_tranhainam;

public class BaiHat {
    public String tenBaiHat, caSi;
    public int hinhAnh;

    public BaiHat(String tenBaiHat, String caSi, int hinhAnh) {
        this.tenBaiHat = tenBaiHat;
        this.caSi = caSi;
        this.hinhAnh= hinhAnh;
    }

    public String getTenBaiHat() {
        return tenBaiHat;
    }

    public void setTenBaiHat(String tenBaiHat) {
        this.tenBaiHat = tenBaiHat;
    }

    public String getCaSi() {
        return caSi;
    }

    public void setCaSi(String caSi) {
        this.caSi = caSi;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
