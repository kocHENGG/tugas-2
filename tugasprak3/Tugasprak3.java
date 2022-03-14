/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprak3;


import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Tugasprak3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int pilih;
        double panjang, lebar, tinggi, jarijari;
        int ulangi=0;
        System.out.println("TUGAS 2 'BALOK & TABUNG'");
        
        do{
        System.out.println("Pilihan Menu : ");
        System.out.println("1. Balok");
        System.out.println("2. Tabung");
        System.out.println("3. Exit");
        System.out.print("Pilih : ");
        pilih = input.nextInt();
        
        if (pilih==1)
        {
            System.out.print("Masukkan nilai panjang : ");
            panjang = input.nextDouble();
            System.out.print("Masukkan nilai lebar : ");
            lebar = input.nextDouble();
            System.out.print("Masukkan nilai tinggi : ");
            tinggi = input.nextDouble();
            
            BALOK balok = new BALOK(panjang, lebar, tinggi);
            System.out.println("Luas Persegi Panjang = " + balok.luas());
            System.out.println("Keliling Persegi Panjang = " + balok.keliling());
            System.out.println("Volume Balok = " + balok.volume());
            System.out.println("Luas Permukaan = " + balok.luaspermukaan());
            System.out.print("Ulangi? (y:1||n:0)");
            ulangi = input.nextInt();
        }
        else if (pilih==2)
        {
            System.out.print("Input Jari-Jari = ");
            jarijari = input.nextDouble();
            System.out.print("Input Tinggi = ");
            tinggi = input.nextDouble();
            
            TABUNG tabung = new TABUNG(tinggi, jarijari);
            System.out.println("Luas Lingkaran = " + tabung.luas());
            System.out.println("Keliling Lingkaran = " + tabung.keliling());
            System.out.println("Volume Tabung : " + tabung.volume());
            System.out.println("Luas Permukaan : " + tabung.luaspermukaan());
            System.out.print("Ulangi? (y:1||n:0)");
            ulangi = input.nextInt();
        }
                }while (ulangi==1 && pilih!=0);
    }
    
}
