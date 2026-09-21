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

        //Membuat objek Motor dengan data awal
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

        Truk Truk1 = new Truk("Mitsubishi", "Kuning", "Fuso", 6);
        //Menggunakan Setter untuk mengubah nilai atribut
        Truk1.setMerk("Hino");
        Truk1.setWarna("Hijau");
        Truk1.setTipe("Dutro");
        Truk1.setJumlahRoda(6);
        //Menggunakan Getter untuk mengambil nilai atribut
        System.out.println("\n=== Data Truk ===");
        System.out.println("Merk : " + Truk1.getMerk());
        System.out.println("Warna : " + Truk1.getWarna());
        System.out.println("Tipe : " + Truk1.getTipe());
        System.out.println("Jumlah Roda : " + Truk1.getJumlahRoda());

        // Membuat objek Pesawat dengan data awal
        Pesawat pesawat1 = new Pesawat("Boeing", "Putih", "Lion Air", 6);
        // Menggunakan Setter untuk mengubah nilai atribut
        pesawat1.setMerk("Airbus");
        pesawat1.setWarna("Putih");
        pesawat1.setMaskapai("Super Air Indonesia");
        pesawat1.setJumlahRoda(6);
        // Menggunakan Getter untuk mengambil nilai atribut
        System.out.println("\n=== Data Pesawat ===");
        System.out.println("Merk : " + pesawat1.getMerk());
        System.out.println("Warna : " + pesawat1.getWarna());
        System.out.println("Maskapai : " + pesawat1.getMaskapai());
        System.out.println("JumlahRoda : " + pesawat1.getJumlahRoda());

        // Membuat objek Sepeda dengan data awal
        Sepeda sepeda1 = new Sepeda("Polygon", "Biru", "Xtrada 5", 2);
        // Menggunakan Setter untuk mengubah nilai atribut
        sepeda1.setMerk("United");
        sepeda1.setWarna("Hitam");
        sepeda1.setTipe("Miami");
        sepeda1.setJumlahRoda(2);
        // Menggunakan Getter untuk mengambil nilai atribut
        System.out.println("\n=== Data Sepeda ===");
        System.out.println("Merk : " + sepeda1.getMerk());
        System.out.println("Warna : " + sepeda1.getWarna());
        System.out.println("Tipe : " + sepeda1.getTipe());
        System.out.println("Jumlah Roda : " + sepeda1.getJumlahRoda());

        //Membuat objek Bus dengan data awal
        Bus bus1 = new Bus("Mercedes-Benz", "Putih", "OH 1626", 6);
        //Mengunakan Setter untuk mengubah nilai atribut
        bus1.setMerk("Scania");
        bus1.setWarna("Merah");
        bus1.setTipe("K410");
        bus1.setJumlahRoda(6);
        //Menggunakan Getter untuk mengambil nilai atribut
        System.out.println("\n=== Data Bus ===");
        System.out.println("Merk : " + bus1.getMerk());
        System.out.println("Warna : " + bus1.getWarna());
        System.out.println("Tipe : " + bus1.getTipe());
        System.out.println("Jumlah Roda :" + bus1.getJumlahRoda());
    }

}
