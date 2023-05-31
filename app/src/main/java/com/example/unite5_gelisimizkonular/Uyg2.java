package com.example.unite5_gelisimizkonular;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Uyg2  extends AppCompatActivity {
    RadioButton rbAcik, rbKaranlik;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    int veri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg2);

    }
}