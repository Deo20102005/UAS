
package com.mycompany.deomercy;

/**
 *
 * Yohanes Deomercy Kurniawan, 20102005
 */
public class EnergiKinetik extends Energi{
    private float v;
    public void Setkecepatan(float nil){
        this.v = nil;
    }
    public float Getkecepatan(){
        return this.v;
    }
    public float HitungEK(){
        return this.m * this.v * this.v;
    }
}
