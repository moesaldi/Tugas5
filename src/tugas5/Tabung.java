/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5;

/**
 *
 * @author Optimoes
 */
public class Tabung {
    public double radius,tinggi;
    
    Tabung(){
        radius = 1;
        tinggi =1;
    }
    
    Tabung(double rad,double t){
        radius = rad;
        tinggi = t;
    }
    
    public void SetTabung(double rad,double t){
        radius = rad;
        tinggi = t;
    }
    
    public double getVolume(){
        double volume;
        volume = Math.PI * radius * radius * tinggi;
        return volume;
    }
    
    public double getLuasAlas(){
        double luasAlas;
        luasAlas = Math.PI * radius * radius;
        return luasAlas;
    }
    
    public void setRadius(double rad){
        radius = rad;
    }
    
    public void setTinggi(double t){
        tinggi = t;
    }
}
