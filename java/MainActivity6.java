package com.example.bukosss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    private TextView timerCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        LinearLayout btnHome = findViewById(R.id.btnHome);
        timerCount = findViewById(R.id.timerCount);
        long totalTimeInMillis = 3600000 + 2700000 + 5000;

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6.this, MainActivity5.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        new CountDownTimer(totalTimeInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                int hours = (int) (millisUntilFinished /3600000);
                int minutes = (int) (millisUntilFinished % 3600000) / 60000;
                int seconds = (int) (millisUntilFinished % 60000) / 1000;
                timerCount.setText(String.format("%02d:%02d:%02d", hours, minutes, seconds));
            }
            @Override
            public void onFinish() {
                timerCount.setText("Waktu habis! Silahkan pesan kembali!");
            }
        }.start();
    }
}