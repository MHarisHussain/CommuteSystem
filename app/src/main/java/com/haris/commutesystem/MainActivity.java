package com.haris.commutesystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button Driver, Parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Driver = findViewById(R.id.btnDriver);
        Parent = findViewById(R.id.btnParent);

        Driver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentDriver = new Intent(MainActivity.this, DriverActivity.class);
                startActivity(intentDriver);
                finish();
            }
        });

        Parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentParent = new Intent(MainActivity.this, ParentActivity.class);
                startActivity(intentParent);
                finish();
            }
        });

    }
}