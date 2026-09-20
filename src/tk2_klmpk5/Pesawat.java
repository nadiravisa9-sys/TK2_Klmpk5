/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tk2_klmpk5;

/**
 *
 * @author LENOVO
 */
public class Pesawat {
    String Merk;
    String Warna;
    String Maskapai;
    int jumlahRoda;

    public Pesawat(String Merk, String Warna, String Maskapai, int jumlahRoda) {
        this.Merk = Merk;
        this.Warna = Warna;
        this.Maskapai = Maskapai;
        this.jumlahRoda = jumlahRoda;
    }

    public String getMerk() {
        return Merk;
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }

    public String getMaskapai() {
        return Maskapai;
    }

    public void setMaskapai(String Maskapai) {
        this.Maskapai = Maskapai;
    }

    public int getJumlahRoda() {
        return jumlahRoda;
    }

    public void setJumlahRoda(int jumlahRoda) {
        this.jumlahRoda = jumlahRoda;
    }
    
}
