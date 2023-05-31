package com.example.unite5_gelisimizkonular.Uyg8;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.unite5_gelisimizkonular.R;

public class Uyg8 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg8);
        TextView textViewBilgi = findViewById(R.id.textViewBilgi);
        //Araba düğmeleri
        Button buttonArabaKapi = findViewById(R.id.buttonArabaKapi);
        Button buttonArabaHiz = findViewById(R.id.buttonArabaHiz);
        Button buttonArabaCalistir = findViewById(R.id.buttonArabaCalistir);
        Button buttonArabaIseGit = findViewById(R.id.buttonArabaIseGit);
        //Minibüs düğmeleri
        Button buttonMinibusKapi = findViewById(R.id.buttonMinibusKapi);
        Button buttonMinibusHiz = findViewById(R.id.buttonMinibusHiz);
        Button buttonMinibusCalistir = findViewById(R.id.buttonMinibusCalistir);
        Button buttonMinibusYolcuIndir = findViewById(R.id.buttonMinibusYolcuIndir);
        //Yeni bir araba nesnesi oluşturuldu.
        Araba araba = new Araba();
        //Araba koltuk sayısı ve hız tanımlanır.
        araba.setKapiSayisi(5);
        araba.setMaksimumHiz(210);
        //Yeni bir minibüs nesnesi oluşturuldu.
        Minibus minibus = new Minibus();
        //Minibüs koltuk sayısı ve hız tanımlanır.
        minibus.setKapiSayisi(3);
        minibus.setMaksimumHiz(170);
        //Düğme tıklanma olayları
        buttonArabaKapi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewBilgi.setText(araba.kapiSayisiniGoster());
            }
        });
        buttonArabaHiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewBilgi.setText(araba.maksimumHizGoster());
            }
        });
        buttonArabaCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewBilgi.setText(araba.calistir());
            }
        });
        buttonArabaIseGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewBilgi.setText(araba.iseGit());
            }
        });
        buttonMinibusKapi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewBilgi.setText(minibus.kapiSayisiniGoster());
            }
        });
        buttonMinibusHiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewBilgi.setText(minibus.maksimumHizGoster());
            }
        });
        buttonMinibusCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewBilgi.setText(minibus.calistir());
            }
        });
        buttonMinibusYolcuIndir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewBilgi.setText(minibus.yolcuIndir());
            }
        });
    }
}
