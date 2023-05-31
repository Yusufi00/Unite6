package com.example.unite5_gelisimizkonular.uyg3;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.unite5_gelisimizkonular.R;

import org.w3c.dom.Text;

public class UrunDetay<btnDegistir, btnSil, btnGeri> extends AppCompatActivity {


    SQLiteDatabase database;
    ImageView urunResim;
    TextView  textViewUrunAdi, textViewUrunFiyat, textViewUrunAdet;
    Button btnResimEkle, btnDegistir, btnSil, btnGeri;

    int id;

    ActivityResultLauncher<Intent> galleryLauncher;
    ActivityResultLauncher<String> galleryPermission;





    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg4);

        tanimlamalar();

        Intent i = getIntent();
        id = i.getIntExtra("id", 0);
        try {

            database = this.openOrCreateDatabase("Urun",MODE_PRIVATE, null);
            Cursor cursor =database.rawQuery("SELECT * FROM urunler WHERE id=?", new String[]String.valueOf((id)});
        Cursor cursor;
        int kolonUrunAdi = cursor.getColumnIndex("urunadi");
        int kolonFiyat = cursor.getColumnIndex("Fiyat");

        int kolonAdet = cursor.getColumnIndex("Adet");

        int kolonResim = cursor.getColumnIndex("resim");
        while (cursor.moveToNext()) {

            textViewUrunAdi.setText(cursor.getString(kolonUrunAdi));
            textViewUrunFiyat.setText(cursor.getString(kolonFiyat) + "");
            textViewUrunAdet.setText(cursor.getString(kolonFiyat) + "");
            byte [] bytes = cursor.getBlob(kolonResim);
            Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0,bytes.length);
        }
        cursor.close();
    }

    private void tanimlamalar() {
        textViewUrunAdi = findViewById(R.id.satirUrunAdi);
        textViewUrunFiyat = findViewById(R.id.satirUrunFiyat);
        textViewUrunAdet = findViewById(R.id.satirUrunAdet);
        urunResim = findViewById(R.id.satirUrunResmi);
    }
}
