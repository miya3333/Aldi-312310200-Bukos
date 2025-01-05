package com.example.bukosss; // REGISTER PAGE

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button btnRegister = findViewById(R.id.btnRegis);
        TextView btnLogin = findViewById(R.id.registerButton);
        ToggleButton toggleButton = findViewById(R.id.toggleButton);
        ImageView statusImage = findViewById(R.id.statusImage);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, MainActivity4_2.class);
                startActivity(intent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, MainActivity3.class);
                startActivity(intent);
            }
        });

        toggleButton.setOnCheckedChangeListener(((buttonView, isChecked) -> {
            if (isChecked) {
                statusImage.setImageResource(R.drawable.accept);
            } else {
                statusImage.setImageResource(R.drawable.or);
            }
        }));
    }
}