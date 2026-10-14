/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tk2_klmpk5.model;

/**
 *
 * @author NADIRA
 */
public class Kendaraan {
    
    private String merk;
    private String warna;
    private String tipe;
    private String jumlahRoda;
    
     public Kendaraan() {
    }
      public Kendaraan(String merk, String warna,
                     String tipe, String jumlahRoda) {
        this.merk = merk;
        this.warna = warna;
        this.tipe = tipe;
        this.jumlahRoda = jumlahRoda;
    }
      public void tampilkan() {
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tipe: " + tipe);
        System.out.println("Jumlah Roda: " + jumlahRoda);
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

    public String getJumlahRoda() {
        return jumlahRoda;
    }

    public void setJumlahRoda(String jumlahRoda) {
        this.jumlahRoda = jumlahRoda;
    }
      
}
