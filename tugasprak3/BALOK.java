/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprak3;

/**
 *
 * @author ACER
 */
public class BALOK extends persegipanjang implements menghitungluas {
    Double tinggi;
    
       public BALOK (double panjang, double lebar, double tinggi)
       {
           super(panjang,lebar);
           this.tinggi = tinggi;
       }
       
       @Override 
       public double luaspermukaan()
       {
           return 2*(super.luas() + super.luas(super.getpanjang(), tinggi) + super.luas(super.getlebar(), tinggi));
       }
       
       @Override 
       public double volume()
       {
           return super.luas()*tinggi;
       }
}
