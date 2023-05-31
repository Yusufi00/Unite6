package com.example.unite5_gelisimizkonular;

public class Dortgen {
        public Integer kisaKenar;
        public Integer uzunKenar;

    public Dortgen(Integer kisaKenar, Integer uzunKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

    public Dortgen(Integer kisaKenar) {
        this.kisaKenar = kisaKenar;
this.uzunKenar = kisaKenar;
}
    public Integer alanBul(){
            Integer alan;
            alan = kisaKenar * uzunKenar;
            return alan;

        }
    }

