/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tk2_klmpk5;

/**
 *
 * @author NADIRA
 */
public class TK2_Klmpk5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //// Membuat objek Motor dengan data awal
        Motor motor1 = new Motor("Yamaha", "Merah", "Vega R", 2);
        //Menggunakan Setter untuk mengubah nilai atribut
        motor1.setMerk("Honda");
        motor1.setWarna("Putih");
        motor1.setTipe("Vario");
        motor1.setJumlahRoda(2);
        //Menggunakan Getter untuk mengambil nilai atribut
        System.out.println("=== Data Motor ===");
        System.out.println("Merk : " + motor1.getMerk());
        System.out.println("Warna : " + motor1.getWarna());
        System.out.println("Tipe : " + motor1.getTipe());
        System.out.println("Jumlah Roda : " + motor1.getJumlahRoda());
        
        // Membuat Onjek Mobil dengan data awal
        Mobil mobil1 = new Mobil("Toyota", "Hitam", "Aplhard", 4);
        // Menggunakan Setter untuk mengubah nilai atribut
        mobil1.setMerk("Honda");
        mobil1.setWarna("Putih");
        mobil1.setTipe("Civic");
        mobil1.setJumlahRoda(4);
        //Menggunakan Getter untuk mengambil nilai atribut
        System.out.println("\n=== Data Mobil ===");
        System.out.println("Merk : " + mobil1.getMerk());
        System.out.println("Warna : " + mobil1.getWarna());
        System.out.println("Tipe : " + mobil1.getTipe());
        System.out.println("Jumlah Roda : " + mobil1.getJumlahRoda());

    }
    
}
