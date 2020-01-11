package com.racunduniaku.belajarmengaji;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class KuisActivity extends AppCompatActivity {

    ImageButton pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        pindah = (ImageButton) findViewById(R.id.menu_kuis_hijaiyah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KuisActivity.this, KuisTebakHijaiyahActivity.class);
                startActivity(intent);

            }
        });

        pindah = (ImageButton) findViewById(R.id.menu_kuis_harokat);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KuisActivity.this, KuisTebakHarokatActivity.class);
                startActivity(intent);

            }
        });

        pindah = (ImageButton) findViewById(R.id.menu_kuis_tanwin);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KuisActivity.this, KuisTebakTanwinActivity.class);
                startActivity(intent);

            }
        });

        pindah = (ImageButton) findViewById(R.id.menu_kuis_bacaan);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KuisActivity.this, KuisTebakBacaanActivity.class);
                startActivity(intent);
            }
        });
    }

    public void btnback(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);

        startActivity(intent);
    }
}
