package com.haris.commutesystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartingActivity extends AppCompatActivity {

    private Button Driver, Parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);

        Driver = findViewById(R.id.btnDriver);
        Parent = findViewById(R.id.btnParent);

        Driver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentDriver = new Intent(StartingActivity.this, DriverLoginActivity.class);
                startActivity(intentDriver);
                finish();
            }
        });

        Parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentParent = new Intent(StartingActivity.this, ParentLoginActivity.class);
                startActivity(intentParent);
                finish();
            }
        });

    }
}