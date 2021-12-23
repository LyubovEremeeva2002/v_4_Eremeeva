package com.example.variant4;


import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements OnClickListener {


    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNext =  findViewById(R.id.btnNext);
    }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, contacts.class);
            startActivity(intent);
        }
    }



