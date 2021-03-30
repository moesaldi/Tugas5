/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author Optimoes
 */
public class nomer2 {
    
    public static void main(String[] args) {
        GregorianCalendar tanggal = new GregorianCalendar();
     
        System.out.println("Current date : "+tanggal.get(GregorianCalendar.DATE)+"-"+tanggal.get(GregorianCalendar.MONTH)+"-"+tanggal.get(GregorianCalendar.YEAR));
        long hari = TimeUnit.MILLISECONDS.toDays(tanggal.getTimeInMillis());
        long tahun,bulan;
        tahun = hari / 365;
        hari = hari % 365;
        bulan = hari / 30;
        hari = hari % 30;
        
        System.out.println("Rentang waktu hari ini dengan tanggal 1 Januari 1970 adalah "+tahun+" tahun "+bulan+" bulan "+hari+" hari");           
    }

}
