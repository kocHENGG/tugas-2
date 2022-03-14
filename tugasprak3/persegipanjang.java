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
public class persegipanjang implements menghitungbangun {
    
    double panjang;
    double lebar;
    
    public persegipanjang (double panjang, double lebar)
    {
        this.panjang = panjang;
        this. lebar = lebar;  }
    
    @Override 
    public double luas() {
        return panjang*lebar;  }
    
    @Override 
    public double keliling() {
        return 2*panjang + 2*lebar; }
    
    public double luas (double x, double y)
    {  return x*y;   }
    
    public double getpanjang ()
    {return panjang;   }
    
    public double getlebar ()
    {return lebar;      };
}
