
package com.mycompany.deomercy;

/**
 *
 * Yohanes Deomercy Kurniawan, 20102005
 */
public class EnergiPotensial extends Energi{
    public float g, h;
    
    public void Setgravitasi(float nil){
        this.g = nil;
    }
    public void Settinggi(float nil){
        this.h = nil;
    }
    public float Getgravitasi(){
        return this.g;
    }
    public float Gettinggi(){
        return this.h;
    }
    public float HitungEP(){
        return this.m * this.g * this.h;
    }
}
