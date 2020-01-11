package com.racunduniaku.belajarmengaji;

/**
 * Created by Fadziel Asyahid on 20/12/2019.
 */

import java.util.Random;

/**
 * Created by Fadziel Asyahid on 20/12/2019.
 */
public class Harokat {

    private int soal[] = {
            R.drawable.bc_alif,
            R.drawable.bc_ja,
            R.drawable.bc_tsa,
            R.drawable.bc_ain,
            R.drawable.bc_dho,
            R.drawable.bc_ba,
            R.drawable.bc_dza,
            R.drawable.bc_wa,
            R.drawable.bc_syin,

            R.drawable.hc_dhi,
            R.drawable.hc_zi,
            R.drawable.hc_shi,
            R.drawable.hc_khi,
            R.drawable.hc_ni,
            R.drawable.hc_ri,
            R.drawable.hc_qi,
            R.drawable.hc_fi,
            R.drawable.hc_ngi,

            R.drawable.dc_dhu,
            R.drawable.dc_fu,
            R.drawable.dc_wu,
            R.drawable.dc_shu,
            R.drawable.dc_lu,
            R.drawable.dc_mu,
            R.drawable.dc_thu,
            R.drawable.dc_bu,
            R.drawable.dc_ngu,
            R.drawable.dc_zu
    };

    private int jawaban[] = {
            R.drawable.fatah_a,
            R.drawable.fatah_ja,
            R.drawable.fatah_tsa,
            R.drawable.fatah_aa,
            R.drawable.fatah_dzo,
            R.drawable.fatah_ba,
            R.drawable.fatah_dza,
            R.drawable.fatah_wa,
            R.drawable.fatah_sya,

            R.drawable.kasroh_dhi,
            R.drawable.kasroh_zi,
            R.drawable.kasroh_shi,
            R.drawable.kasroh_khi,
            R.drawable.kasroh_ni,
            R.drawable.kasroh_ri,
            R.drawable.kasroh_qi,
            R.drawable.kasroh_fi,
            R.drawable.kasroh_ain,

            R.drawable.domah_dhuu,
            R.drawable.domah_fu,
            R.drawable.domah_wu,
            R.drawable.domah_shu,
            R.drawable.domah_lu,
            R.drawable.domah_mu,
            R.drawable.domah_thu,
            R.drawable.domah_bu,
            R.drawable.domah_uu,
            R.drawable.domah_zu
    };

    public int[] getlist(){
        return soal;

    }
    public int[] getlist2(){
        return jawaban;
    }

    public int getrandomhuruf(){
        int rnd = new Random().nextInt(soal.length);
        return rnd;
    }

    public int getimagesoal(int i){
        return soal[i];
    }

    public int getimagejwbn(int i){
        return jawaban[i];
    }

    public int getjumlah() {
        return soal.length;
    }

    public int getjumlah2(){
        return jawaban.length;
    }
}