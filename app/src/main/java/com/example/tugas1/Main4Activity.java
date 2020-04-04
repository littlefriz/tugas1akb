package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main4Activity extends AppCompatActivity {
    TextView mTextView;
    Button btnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
            mTextView = (TextView)findViewById(R.id.tampilNama);

            mTextView.setText("Beres! Sekarang " + getIntent().getStringExtra("mytext")+" udah bisa ngecek penggunaan HP mu tiap hari buat bantu kamu" +
                    " ngatur waktu :)");

            btnExit = (Button)findViewById(R.id.keluar);
            btnExit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                }
            });
    }
}
