package com.example.unite5_gelisimizkonular;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.unite5_gelisimizkonular.uyg3.Uyg3;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createDB();
    }

    private void createDB() {
        database = this.openOrCreateDatabase("Urun", MODE_PRIVATE, null);

        String TABLO = "CREATE TABLE IF NOT EXISTS urunler(id INTEGER PRIMARY KEY, urunadi TEXT, fiyat DOUBLE, adet INTEGER)";
        database.execSQL(TABLO);
    }

    public void uyg1Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg1.class);
        startActivity(i);


    }

    public void uyg2Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg2.class);
        startActivity(i);
    }

    public void uyg3Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg3.class);
        startActivity(i);
    }

    public void uyg4Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg4.class);
        startActivity(i);
    }

    public void uyg5Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg5.class);
        startActivity(i);
    }

    public void uyg6Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg6.class);
        startActivity(i);
    }

    public void uyg7Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg7.class);
        startActivity(i);
    }

    public void uyg8Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg8.class);
        startActivity(i);
    }

    public void uyg9Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg9.class);
        startActivity(i);
    }

    public void uyg10Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg10.class);
        startActivity(i);
    }
}