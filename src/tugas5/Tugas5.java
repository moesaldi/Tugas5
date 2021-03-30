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
public class Tugas5 {

    public static void main(String[] args) {
       Tabung tabung = new Tabung();
       
       System.out.println("default ");
       System.out.println("Radius = "+tabung.radius);
       System.out.println("Tinggi = "+tabung.tinggi);
       System.out.println("Luas Alas = "+tabung.getLuasAlas());
       System.out.println("Volume = "+tabung.getVolume());
       
       tabung.SetTabung(5,10) ;
       System.out.println("\nObject pertama ");
       System.out.println("Radius = "+tabung.radius);
       System.out.println("Tinggi = "+tabung.tinggi);
       System.out.println("Luas Alas = "+tabung.getLuasAlas());
       System.out.println("Volume = "+tabung.getVolume());
       
       tabung.SetTabung(7.5,15.5) ;
       System.out.println("\nObject Kedua ");
       System.out.println("Radius = "+tabung.radius);
       System.out.println("Tinggi = "+tabung.tinggi);
       System.out.println("Luas Alas = "+tabung.getLuasAlas());
       System.out.println("Volume = "+tabung.getVolume());
    }
    
}
