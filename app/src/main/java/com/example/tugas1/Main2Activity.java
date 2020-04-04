package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    Button btnMasuk;
    EditText txtMasuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnMasuk = (Button)findViewById(R.id.buttonMasuk);
        txtMasuk = (EditText)findViewById(R.id.kodeMasuk);
        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            check();
             }
        });
    }
    public void check() {
        if(txtMasuk.getText().toString().equals("A1B2C3")){
            Intent i = new Intent(getApplicationContext(),Main3Activity.class);
            startActivity(i);
        }else{
            Toast.makeText(this,"Kode Salah (A1B2C3)",Toast.LENGTH_SHORT).show();
        }
    }
}
