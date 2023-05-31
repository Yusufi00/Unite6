package com.example.unite5_gelisimizkonular;

import android.util.Log;

public class Personel {
   public int yas;

    public void setYas(int yas) {
        if(yas<18 || yas>55){
            Log.e("Kapsülleme", "Hatalı yaş");
            yas = 18;
        }
       this.yas = yas;
    }

    public int getYas() {
        return yas;
    }
}
