package com.example.boosstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class kuliahActivity extends AppCompatActivity {

    private TextView tvbukuKuliah, tvalin, tvmatdis, tvTermo, tvProbstat, tvTRK ,
            tvDescALIN,tvDescmatdis, tvDesctermo, tvDescprobstat, tvDescTRK,
            tvharga11, tvharga12, tvharga13,tvharga14 , tvharga15;

    private ImageView igalin, igmatdis, igtermo,igprobstat, igTRK ;

    private CardView cardAlin,cardMatdis, cardTermo, cardProbstat,cardTRK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliah);

        tvbukuKuliah = findViewById(R.id.tvbukuKuliah);

        cardAlin = findViewById(R.id.cardAlin);
        cardMatdis = findViewById(R.id.cardMatdis);
        cardTermo =findViewById(R.id.cardTermo);
        cardProbstat = findViewById(R.id.cardProbstat);
        cardTRK = findViewById(R.id.cardTRK);

        cardAlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvalin = findViewById(R.id.tvalin);
                tvharga11 = findViewById(R.id.tvharga11);
                tvDescALIN = findViewById(R.id.tvDescalin);

                Intent Alin = new Intent(kuliahActivity.this, DetailActivity.class);

                Alin.putExtra("foto", R.drawable.alin);
                Alin.putExtra("buku", tvalin.getText());
                Alin.putExtra("harga", tvharga11.getText());
                Alin.putExtra("Sinopsis", tvDescALIN.getText());
                startActivity(Alin);
            }
        });

        cardMatdis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmatdis = findViewById(R.id.tvmatdis);
                tvharga12 = findViewById(R.id.tvharga12);
                tvDescmatdis = findViewById(R.id.tvDescmatdis);

                Intent Matdis = new Intent(kuliahActivity.this, DetailActivity.class);

                Matdis.putExtra("foto", R.drawable.matdis);
                Matdis.putExtra("buku", tvmatdis.getText());
                Matdis.putExtra("harga", tvharga12.getText());
                Matdis.putExtra("Sinopsis", tvDescmatdis.getText());
                startActivity(Matdis);
            }
        });

        cardTermo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvTermo = findViewById(R.id.tvTermo);
                tvharga13 = findViewById(R.id.tvharga13);
                tvDesctermo = findViewById(R.id.tvDesctermo);


                Intent Termo = new Intent(kuliahActivity.this, DetailActivity.class);

                Termo.putExtra("foto", R.drawable.termo);
                Termo.putExtra("buku", tvTermo.getText());
                Termo.putExtra("harga", tvharga13.getText());
                Termo.putExtra("Sinopsis", tvDesctermo.getText());
                startActivity(Termo);
            }
        });

        cardProbstat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvProbstat = findViewById(R.id.tvProbstat);
                tvharga14 = findViewById(R.id.tvharga14);
                tvDescprobstat = findViewById(R.id.tvDescprobstat);


                Intent Probstat = new Intent(kuliahActivity.this, DetailActivity.class);

                Probstat.putExtra("foto", R.drawable.probstat);
                Probstat.putExtra("buku", tvProbstat.getText());
                Probstat.putExtra("harga", tvharga14.getText());
                Probstat.putExtra("Sinopsis", tvDescprobstat.getText());
                startActivity(Probstat);
            }
        });

        cardTRK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvTRK = findViewById(R.id.tvTRK);
                tvharga15 = findViewById(R.id.tvharga15);
                tvDescTRK = findViewById(R.id.tvDesctrk);


                Intent TRK = new Intent(kuliahActivity.this, DetailActivity.class);

                TRK.putExtra("foto", R.drawable.ece);
                TRK.putExtra("buku", tvTRK.getText());
                TRK.putExtra("harga", tvharga15.getText());
                TRK.putExtra("Sinopsis", tvDescTRK.getText());
                startActivity(TRK);
            }
        });
    }
}