package com.iapps.myselfapp.Entity;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "Profile")
public class homeProfile implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "ttl")
    private String ttl;

    @ColumnInfo(name = "nama")
    private String nama;

    @ColumnInfo(name = "alamat")
    private String alamat;

    @ColumnInfo(name = "jk")
    private String jk;

    @ColumnInfo(name = "goldar")
    private String goldar;

    @ColumnInfo(name = "nim")
    private String nim;

    @ColumnInfo(name = "makanan")
    private String makanan;

    @ColumnInfo(name = "minuman")
    private String minuman;

    @ColumnInfo(name = "lagu")
    private String lagu;

    @ColumnInfo(name = "film")
    private String film;

    @ColumnInfo(name = "hoby")
    private String hoby;

    public homeProfile(int id, String ttl, String nama, String alamat, String jk, String goldar, String nim, String makanan, String minuman,String lagu, String film, String hoby) {
        this.id = id;
        this.ttl = ttl;
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk;
        this.goldar = goldar;
        this.nim = nim;
        this.makanan = makanan;
        this.minuman = minuman;
        this.lagu = lagu;
        this.film = film;
        this.hoby = hoby;
    }

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public String getMinuman() {
        return minuman;
    }

    public void setMinuman(String makanan) {
        this.minuman = minuman;
    }

    public String getLagu() {
        return lagu;
    }

    public void setLagu(String lagu) {
        this.lagu = lagu;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public String getHoby() {
        return hoby;
    }

    public void setHoby(String hoby) {
        this.hoby = hoby;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
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

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getGoldar() {
        return goldar;
    }

    public void setGoldar(String goldar) {
        this.goldar = goldar;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
