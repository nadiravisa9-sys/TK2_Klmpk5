/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tk2_klmpk5;

/**
 *
 * @author NADIRA
 */
public class Mobil {
    String merk;
    String warna;
    String tipe;
    int jumlahRoda;

    public Mobil(String merk, String warna, String tipe, int jumlahRoda) {
        this.merk = merk;
        this.warna = warna;
        this.tipe = tipe;
        this.jumlahRoda = jumlahRoda;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getJumlahRoda() {
        return jumlahRoda;
    }

    public void setJumlahRoda(int jumlahRoda) {
        this.jumlahRoda = jumlahRoda;
    }

    
}
