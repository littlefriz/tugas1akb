package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/*
Nama  : Afri Suhendra
Nim   : 10117169
Kelas : IF-5

Tanggal 03/04/2020 > Pembuatan Halaman Pertama,Halaman Kedua
Tanggal 04/04/2020 > Pembuatan Halaman Ketiga dan ke-empat
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMasuk = (Button)findViewById(R.id.btnMulai);
        btnMasuk.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent= new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(startIntent);
            }
        });
    }
}
