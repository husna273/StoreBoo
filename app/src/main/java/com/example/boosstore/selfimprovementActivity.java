package com.example.boosstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class selfimprovementActivity extends AppCompatActivity {

    private TextView tvSelfImprovement, tvatomichabit, tvinsecurity, tvfilosofiteras, tvSelfhealing, tvPsycology ,
            tvDescAtomic,tvDescinsecurity, tvDescfilosofi, tvDescselfhealing, tvDescpsycology,
            tvharga6, tvharga7, tvharga8,tvharga9 , tvharga10;

    private ImageView igatomic, iginsecurity, igfilosof,igselfhealing, igpsychology ;

    private CardView cardatomichabit,cardInsecurity, cardfilosof, cardselfhealing,cardPsychology;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selfimprovement);

        tvSelfImprovement = findViewById(R.id.tvSelfImprovement);

        cardatomichabit = findViewById(R.id.cardatomichabit);
        cardInsecurity = findViewById(R.id.cardInsecurity);
        cardfilosof =findViewById(R.id.cardfilosof);
        cardselfhealing = findViewById(R.id.cardselfhealing);
        cardPsychology = findViewById(R.id.cardPsychology);

        cardatomichabit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvatomichabit = findViewById(R.id.tvatomichabit);
                tvharga6 = findViewById(R.id.tvharga6);
                tvDescAtomic = findViewById(R.id.tvDescatomichabit);

                Intent atomicHabbit = new Intent(selfimprovementActivity.this, DetailActivity.class);

                atomicHabbit.putExtra("foto", R.drawable.atomichabit);
                atomicHabbit.putExtra("buku", tvatomichabit.getText());
                atomicHabbit.putExtra("harga", tvharga6.getText());
                atomicHabbit.putExtra("Sinopsis", tvDescAtomic.getText());
                startActivity(atomicHabbit);
            }
        });
        cardInsecurity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvinsecurity = findViewById(R.id.tvinsecurity);
                tvharga7 = findViewById(R.id.tvharga7);
                tvDescinsecurity = findViewById(R.id.tvDescinsecurity);

                Intent insecurity = new Intent(selfimprovementActivity.this, DetailActivity.class);

                insecurity.putExtra("foto", R.drawable.insecurity);
                insecurity.putExtra("buku", tvinsecurity.getText());
                insecurity.putExtra("harga", tvharga7.getText());
                insecurity.putExtra("Sinopsis", tvDescinsecurity.getText());
                startActivity(insecurity);
            }
        });

        cardfilosof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvfilosofiteras = findViewById(R.id.tvfilosofiteras);
                tvharga8 = findViewById(R.id.tvharga8);
                tvDescfilosofi = findViewById(R.id.tvDescfilosofi);

                Intent filososfi = new Intent(selfimprovementActivity.this, DetailActivity.class);

                filososfi.putExtra("foto", R.drawable.filosofiteras);
                filososfi.putExtra("buku", tvfilosofiteras.getText());
                filososfi.putExtra("harga", tvharga8.getText());
                filososfi.putExtra("Sinopsis", tvDescfilosofi.getText());
                startActivity(filososfi);
            }
        });

        cardselfhealing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSelfhealing = findViewById(R.id.tvSelfhealing);
                tvharga9 = findViewById(R.id.tvharga9);
                tvDescselfhealing = findViewById(R.id.tvDescselfhealing);

                Intent selfhealing = new Intent(selfimprovementActivity.this, DetailActivity.class);

                selfhealing.putExtra("foto", R.drawable.selfhealingwithquran);
                selfhealing.putExtra("buku", tvSelfhealing.getText());
                selfhealing.putExtra("harga", tvharga9.getText());
                selfhealing.putExtra("Sinopsis", tvDescselfhealing.getText());
                startActivity(selfhealing);
            }
        });

        cardPsychology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvPsycology = findViewById(R.id.tvPsycology);
                tvharga10= findViewById(R.id.tvharga10);
                tvDescpsycology = findViewById(R.id.tvDescpsycology);

                Intent pyschology = new Intent(selfimprovementActivity.this, DetailActivity.class);

                pyschology.putExtra("foto", R.drawable.pyschologyofmoney);
                pyschology.putExtra("buku", tvPsycology.getText());
                pyschology.putExtra("harga", tvharga10.getText());
                pyschology.putExtra("Sinopsis", tvDescpsycology.getText());
                startActivity(pyschology);
            }
        });
    }
}