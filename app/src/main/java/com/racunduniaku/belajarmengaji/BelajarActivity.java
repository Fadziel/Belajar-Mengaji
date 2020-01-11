package com.racunduniaku.belajarmengaji;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;


public class BelajarActivity extends AppCompatActivity {
    ImageButton pindah;

    private AdView madView;
    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        madView = (AdView) findViewById(R.id.adView);
        madView.loadAd(new AdRequest.Builder().build());

        //

        //menyiapkan iklan
        interstitialAd = new InterstitialAd(BelajarActivity.this);
        //ID Iklan nya
        interstitialAd.setAdUnitId(getString(R.string.admob_interstitial_unit_id));
        AdRequest adRequest = new AdRequest.Builder().build();
        //muat iklannya
        interstitialAd.loadAd(adRequest);
        //persiapan iklannya
        interstitialAd.setAdListener(new AdListener() {

        public void onAdLoaded() {
        //memanggil display
         displayIntertial();
        }

        });





        pindah = (ImageButton) findViewById(R.id.menu_hijaiyah1);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //suaraButton.start();
                Intent intent = new Intent(BelajarActivity.this,HijaiyahActivity.class);
                startActivity(intent);
                //mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.menu_harokat);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //suaraButton.start();
                Intent intent = new Intent(BelajarActivity.this,HarokatActivity.class);
                startActivity(intent);
                //mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.menu_tanwin);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //suaraButton.start();
                Intent intent = new Intent(BelajarActivity.this,TanwinActivity.class);
                startActivity(intent);
                //mp.stop();
            }
        });


    }

    private void displayIntertial() {
        if (interstitialAd.isLoaded()){
            interstitialAd.show();
        }
    }

    public void btnback(View view) {

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);

        startActivity(intent);

    }
}
