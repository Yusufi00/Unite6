package com.example.unite5_gelisimizkonular.Uyg10;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.unite5_gelisimizkonular.R;
public class Uyg10 extends AppCompatActivity {

    public Asker asker;
    public Tankci tankci;
    String mesaj = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg10);
        asker = new Asker();
        tankci = new Tankci();
        TextView textViewMesaj = findViewById(R.id.textViewMesaj);
        Button buttonAsker = findViewById(R.id.buttonAsker);
        Button buttonTankci = findViewById(R.id.buttonTankci);
        buttonAsker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesaj = asker.atesEt();
                textViewMesaj.setText(mesaj);
            }
        });
        buttonTankci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesaj = tankci.atesEt();
                textViewMesaj.setText(mesaj);
            }
        });
    }
}
