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
public class bulat implements menghitungbangun {
    double jarijari;
    double phi=3.14;
    
    public bulat(double jarijari)
    { this.jarijari = jarijari;     }
    
    @Override 
    public double luas() 
    { return phi*jarijari*jarijari;     }
    
    @Override 
    public double keliling()
    { return 2*phi*jarijari;        }
    
    public double getjarijari()
    { return jarijari;      }
    
    public double getphi()
    {  return phi;      }
    
}
