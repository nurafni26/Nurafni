package com.tugasday1.nurafni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_tampilan);
    }

    public void clickRS(View view) {
        //gambar RS di click
        Intent i = new Intent(this,RS.class);
        startActivity(i);
    }
}