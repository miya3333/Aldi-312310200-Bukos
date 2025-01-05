package com.example.bukosss; //HOME PAGE

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        View contentFrame = findViewById(R.id.contentFrame);
        LinearLayout btnPesanan = findViewById(R.id.btnPesanan);

        btnPesanan.setOnClickListener(v -> {
            ObjectAnimator animator = ObjectAnimator.ofFloat(contentFrame, "translationX", 0f, 500f);
            animator.setDuration(300);
            animator.start();
        });

        btnPesanan.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
               startActivity(intent);
               overridePendingTransition(0, 0);
           }
        });
    }
}