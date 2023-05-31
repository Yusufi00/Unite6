package com.example.unite5_gelisimizkonular;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Uyg1 extends AppCompatActivity {

    EditText kullaniciEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg1);

        kullaniciEdit.findViewById(R.id.kullaniciEdit);
        SharedPreferences sharedPreferences=this.getPreferences(Context.MODE_PRIVATE);
        String gelenveri=sharedPreferences.getString("kullanici","");
        if(!gelenveri.isEmpty()) {
            kullaniciEdit.setText(gelenveri);
        }

    }



    public void btnKaydetClick(View view){
        String veri;
        veri = kullaniciEdit.getText().toString();
        SharedPreferences sharedPreferences = this.getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("kullanici", veri);
        editor.apply();
    }
}
