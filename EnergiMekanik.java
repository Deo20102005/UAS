
package com.mycompany.deomercy;

/**
 *
 * Yohanes Deomercy Kurniawan, 20102005
 */
public class EnergiMekanik {
    private float Ep1, Ek1;
    
    public void SetEp1(float nil){
        this.Ep1 = nil;
    }
    public void SetEk1(float nil){
        this.Ek1 = nil;
    }
    public float GetEp1(){
        return this.Ep1;
    }
    public float GetEk1(){
        return this.Ek1;
    }
    public float HitungEM(){
        return this.Ep1 * this.Ek1;
    }
}
