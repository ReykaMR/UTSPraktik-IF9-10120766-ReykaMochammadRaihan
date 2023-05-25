package com.example.utspraktik_if9_10120766_reykamochammadraihan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

/*
    Tanggal Pengerjaan  : Rabu, 25 Mei 2023
    Nim     : 10120766
    Nama    : Reyka Mochammad Raihan
    Kelas   : IF-9
*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnKembaliKeAtasButton = findViewById(R.id.btnKembaliKeAtas);
        ScrollView scrollView = findViewById(R.id.scrollView);

        btnKembaliKeAtasButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.fullScroll(ScrollView.FOCUS_UP);
            }
        });
    }
}