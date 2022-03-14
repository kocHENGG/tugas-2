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
public class TABUNG extends bulat implements menghitungluas {
    double tinggi;
    
    public TABUNG (double tinggi, double jarijari)
    {
        super(jarijari);
        this.tinggi = tinggi;
    }
    
    @Override
    public double luaspermukaan()
    {
         return 2*super.luas() + 2*super.getphi()*super.getjarijari()*tinggi;
    }
    
    @Override 
    public double volume()
    {
        return super.luas()*tinggi;
    }
}
