package com.example.boosstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class novelActivity extends AppCompatActivity  {

    private TextView tvBukuNovel, tvShaf, tvspb, tvLoveAtoZ, tvazzamine, tvLangkahkaki,
            tvDescshaf,tvDescspb, tvDescazzamine, tvDescLoveAtoZ, tvDescLangkahkaki,
            tvharga1, tvharga2, tvharga4,tvharga3 , tvharga5;

    private ImageView igshaf, igspb, igLoveAtoZ,igazzamine, igLangkahkaki ;

    private CardView cardshaf,cardspb, cardazzamine, cardLoveAtoZ,cardLangkahkaki;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bnovelactivity);

        tvBukuNovel = findViewById(R.id.tvBukuNovel);

        cardshaf = findViewById(R.id.cardshaf);
        cardspb = findViewById(R.id.cardspb);
        cardazzamine =findViewById(R.id.cardazzamine);
        cardLoveAtoZ = findViewById(R.id.cardLoveAtoZ);
        cardLangkahkaki = findViewById(R.id.cardLangkahKaki);

        cardshaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvShaf = findViewById(R.id.tvShaf);
                tvDescshaf = findViewById(R.id.tvDescShaf);
                tvharga1 = findViewById(R.id.tvharga1);

                Intent Shaf = new Intent(novelActivity.this, DetailActivity.class);


                Shaf.putExtra("foto", R.drawable.sf);
                Shaf.putExtra("buku", tvShaf.getText().toString());
                Shaf.putExtra("harga", tvharga1.getText().toString());
                Shaf.putExtra("Sinopsis", tvDescshaf.getText().toString());
                startActivity(Shaf);

            }
        });

        cardspb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvspb = findViewById(R.id.tvspb);
                tvDescspb = findViewById(R.id.tvDescSpb);
                tvharga2 = findViewById(R.id.tvharga2);

                Intent SPB = new Intent(novelActivity.this, DetailActivity.class);

                SPB.putExtra("foto", R.drawable.santripilihanbunda);
                SPB.putExtra("buku", tvspb.getText().toString());
                SPB.putExtra("harga", tvharga2.getText().toString());
                SPB.putExtra("Sinopsis", tvDescspb.getText().toString());
                startActivity(SPB);
            }
        });

        cardazzamine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvazzamine = findViewById(R.id.tvazzamine);
                tvDescazzamine = findViewById(R.id.tvDescAzzamine);
                tvharga3 = findViewById(R.id.tvharga3);

                Intent Azzamine = new Intent(novelActivity.this, DetailActivity.class);

                Azzamine.putExtra("foto", R.drawable.azzamine);
                Azzamine.putExtra("buku", tvazzamine.getText());
                Azzamine.putExtra("harga", tvharga3.getText());
                Azzamine.putExtra("Sinopsis", tvDescazzamine.getText());
                startActivity(Azzamine);
            }
        });

        cardLoveAtoZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvLoveAtoZ = findViewById(R.id.tvLoveAtoZ);
                tvDescLoveAtoZ = findViewById(R.id.tvDescLoveAtoZ);
                tvharga4 = findViewById(R.id.tvharga4);

                Intent LoveAtoZ = new Intent(novelActivity.this, DetailActivity.class);

                LoveAtoZ.putExtra("foto", R.drawable.lovefromatoz);
                LoveAtoZ.putExtra("buku", tvLoveAtoZ.getText().toString());
                LoveAtoZ.putExtra("harga", tvharga4.getText().toString());
                LoveAtoZ.putExtra("Sinopsis", tvDescLoveAtoZ.getText().toString());
                startActivity(LoveAtoZ);
            }
        });

        cardLangkahkaki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvLangkahkaki = findViewById(R.id.tvDescLangkahKaki);
                tvDescLangkahkaki = findViewById(R.id.tvDescLangkahKaki);
                tvharga5 = findViewById(R.id.tvharga5);

                Intent LangkahKaki = new Intent(novelActivity.this, DetailActivity.class);

                LangkahKaki.putExtra("foto", R.drawable.langkahkaki);
                LangkahKaki.putExtra("buku", tvLangkahkaki.getText().toString());
                LangkahKaki.putExtra("harga", tvharga5.getText().toString());
                LangkahKaki.putExtra("Sinopsis", tvDescLangkahkaki.getText().toString());
                startActivity(LangkahKaki);
            }
        });
    }


}