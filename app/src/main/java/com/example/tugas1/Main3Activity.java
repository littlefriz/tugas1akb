package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {

    EditText editNama;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button1 = (Button)findViewById(R.id.btnLanjut);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editNama = (EditText)findViewById(R.id.editNama);
                String text = editNama.getText().toString();

                Intent intent = new Intent(v.getContext(),Main4Activity.class);
                intent.putExtra("mytext",text);
                startActivity(intent);
            }
        });

    }
}
