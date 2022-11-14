package com.example.tugasindividu3;

public class Stasiun {
    String nama,alamat,no_telp,fasilitas;
    Integer image;

    public Stasiun(String nama, String alamat, Integer image) {
        this.nama = nama;
        this.alamat = alamat;
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
