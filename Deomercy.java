package com.mycompany.deomercy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * Yohanes Deomercy Kurniawan, 20102005
 */
public class Deomercy {

    public static void main(String[] args) {
        String pil="";
        String ulang="ya";
        float v=0, m=0, g=0, h=0 , Ep1=0, Ek1=0;
        
        EnergiMekanik EM = new EnergiMekanik();
        EnergiKinetik EK = new EnergiKinetik();      
        EnergiPotensial EP = new EnergiPotensial();
        
        BufferedReader dtIN = new BufferedReader(new InputStreamReader(System.in));
        
        while("ya".equals(ulang)){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("            Hitung Energi");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("1. EnergiPotensial");
        System.out.println("2. EnergiKinetik");
        System.out.println("3. EnergiMekanik");
        System.out.println("");
        System.out.print("pilihan: ");
        try{
            pil = dtIN.readLine();
        }catch(IOException e){
            System.out.println("Terjadi kendala");
        }
        switch(pil){
        case "1":
            System.out.println("Menghitung Energi Potensial");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            //$$$$$$$$$$$$$$$$$$$$$$$$$$//
            System.out.print("Isikan Nilai massa : ");
            try{
                m = Float.parseFloat(dtIN.readLine());
            }catch(IOException e){
            System.out.println("Terjadi kendala");
            }
            System.out.print("Isikan Nilai gravitasi : ");
            try{
                g = Float.parseFloat(dtIN.readLine());
            }catch(IOException e){
            System.out.println("Terjadi kendala");
            }
            System.out.print("Isikan Nilai tinggi : ");
            try{
                h = Float.parseFloat(dtIN.readLine());
            }catch(IOException e){
            System.out.println("Terjadi kendala");
            }
            EP.Setmassa(m);
            EP.Setgravitasi(g);
            EP.Settinggi(h);
            
            System.out.println("Jadi Hasilnya  : "+EP.HitungEP()+"joule");
            break;
            
        case "2":
            System.out.println("Menghitung Energi Kinetik");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            //$$$$$$$$$$$$$$$$$$$$$$$$$$//
            System.out.print("Isikan Nilai massa : ");
            try{
                m = Float.parseFloat(dtIN.readLine());
            }catch(IOException e){
            System.out.println("Terjadi kendala");
            }
            System.out.print("Isikan Nilai kecepatan : ");
            try{
                v = Float.parseFloat(dtIN.readLine());
            }catch(IOException e){
            System.out.println("Terjadi kendala");
            }
            EK.Setmassa(m);
            EK.Setkecepatan(v);
                        
            System.out.println("Jadi Hasilnya  : "+EK.HitungEK() +"joule");
            break;
            
        case "3":
            System.out.println("Menghitung Energi Mekanik");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            //$$$$$$$$$$$$$$$$$$$$$$$$$$//
            System.out.print("Isikan Nilai Ep : ");
            try{
                Ep1 = Float.parseFloat(dtIN.readLine());
            }catch(IOException e){
            System.out.println("Terjadi kendala");
            }
            System.out.print("Isikan Nilai Ek : " );
            try{
                Ek1 = Float.parseFloat(dtIN.readLine());
            }catch(IOException e){
            System.out.println("Terjadi kendala");
            }
            EM.SetEp1(Ep1);
            EM.SetEk1(Ek1);

            System.out.println("Jadi Hasilnya  : "+EM.HitungEM() +"joule");
            break;
        }
    }
    
}
}
