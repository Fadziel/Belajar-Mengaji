package com.racunduniaku.belajarmengaji;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {
    ImageButton pindah;
    MediaPlayer mp;

    private AdView madView;
    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        madView = (AdView) findViewById(R.id.adView);
        madView.loadAd(new AdRequest.Builder().build());

        //

        //menyiapkan iklan
        //interstitialAd = new InterstitialAd(MainActivity.this);
        //ID Iklan nya
        //interstitialAd.setAdUnitId(getString(R.string.admob_interstitial_unit_id));
        //AdRequest adRequest = new AdRequest.Builder().build();
        //muat iklannya
        //interstitialAd.loadAd(adRequest);
        //persiapan iklannya
        //interstitialAd.setAdListener(new AdListener() {

           // public void onAdLoaded() {
                //memanggil display
               // displayIntertial();
            //}

        //});

        loadAdMobBannerAd();

        final MediaPlayer suaraButton = MediaPlayer.create(this, R.raw.button);
        mp = MediaPlayer.create(getBaseContext(),R.raw.backsound);
        mp.start();

        pindah = (ImageButton) findViewById(R.id.bt_belajar);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(MainActivity.this,BelajarActivity.class);
                startActivity(intent);
                mp.stop();
            }
        });

        pindah = (ImageButton) findViewById(R.id.bt_kuis);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suaraButton.start();
                Intent intent = new Intent(MainActivity.this,KuisActivity.class);
                startActivity(intent);
                mp.stop();
            }
        });

        


    }

    private void loadAdMobBannerAd() {
        if (Config.ENABLE_ADMOB_BANNER_ADS) {
            madView = (AdView) findViewById(R.id.adView);
            AdRequest adRequest = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, GDPR.getBundleAd(MainActivity.this)).build();
            madView.loadAd(adRequest);
            madView.setAdListener(new AdListener() {

                @Override
                public void onAdClosed() {
                }

                @Override
                public void onAdFailedToLoad(int error) {
                    madView.setVisibility(View.GONE);
                }

                @Override
                public void onAdLeftApplication() {
                }

                @Override
                public void onAdOpened() {
                }

                @Override
                public void onAdLoaded() {
                    madView.setVisibility(View.VISIBLE);
                }
            });
            Log.d("MainActivity", "AdMob Banner is Enabled");

        } else {
            Log.d("MainActivity", "AdMob Banner is Disabled");
        }
    }




    private void displayIntertial() {
        if (interstitialAd.isLoaded()){
            interstitialAd.show();
        }
    }
}
