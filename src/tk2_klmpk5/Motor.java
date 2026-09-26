/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tk2_klmpk5;

/**
 *
 * @author Sirdzat
 */
public class Motor {
    String Merk;
    String Warna;
    String Tipe;
    String jumlahRoda;
    
        public Motor() {
        this.Merk = "";
        this.Warna = "";
        this.Tipe = "";
        this.jumlahRoda = "";
    }

    public Motor(String Merk, String Warna, String Tipe, String jumlahRoda) {
        this.Merk = Merk;
        this.Warna = Warna;
        this.Tipe = Tipe;
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

    public String getTipe() {
        return Tipe;
    }

    public void setTipe(String Tipe) {
        this.Tipe = Tipe;
    }

    public String getJumlahRoda() {
        return jumlahRoda;
    }

    public void setJumlahRoda(String jumlahRoda) {
        this.jumlahRoda = jumlahRoda;
    }
}
