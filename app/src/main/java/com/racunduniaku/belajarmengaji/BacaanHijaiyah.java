package com.racunduniaku.belajarmengaji;

import java.util.Random;

public class BacaanHijaiyah {

    private int listhuruf[] = {
            R.drawable.pop_ain,
            R.drawable.pop_ba,
            R.drawable.pop_ta,
            R.drawable.pop_haa,
            R.drawable.pop_ja,
            R.drawable.pop_tho,
            R.drawable.pop_wau,
            R.drawable.pop_tsa,
            R.drawable.pop_kof,
            R.drawable.pop_lam,
            R.drawable.pop_mim,
            R.drawable.pop_nun,
            R.drawable.pop_ha,
            R.drawable.pop_alif,
            R.drawable.pop_ro,
            R.drawable.pop_za,
            R.drawable.pop_ya,
            R.drawable.pop_kha,
            R.drawable.pop_da,
            R.drawable.pop_sod
    };

    private int listhuruf2[] = {
            R.drawable.aa_ain,
            R.drawable.aa_ba,
            R.drawable.aa_ta,
            R.drawable.aa_haa,
            R.drawable.aa_ja,
            R.drawable.aa_tho,
            R.drawable.aa_wau,
            R.drawable.aa_tsa,
            R.drawable.aa_kof,
            R.drawable.aa_lam,
            R.drawable.aa_mim,
            R.drawable.aa_nun,
            R.drawable.aa_ha,
            R.drawable.aa_alif,
            R.drawable.aa_ro,
            R.drawable.aa_za,
            R.drawable.aa_ya,
            R.drawable.aa_kha,
            R.drawable.aa_da,
            R.drawable.aa_sod
    };

    public int[] getlist(){
        return listhuruf;
    }
    public int[] getlist2(){
        return listhuruf2;
    }

    public int getrandomhuruf(){
        int rnd = new Random().nextInt(listhuruf.length);
        return rnd;
    }

    public int getimagesoal(int i){
        return listhuruf[i];
    }

    public int getimagejwbn(int i){
        return listhuruf2[i];
    }

    public int getjumlah(){
        return listhuruf.length;
    }
    public int getjumlah2(){
        return listhuruf2.length;
    }
}
