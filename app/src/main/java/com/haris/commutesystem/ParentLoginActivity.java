package com.haris.commutesystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ParentLoginActivity extends AppCompatActivity {

    private Button btnParent, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_login);

        btnParent = findViewById(R.id.btnLoginParent);
        btnBack = findViewById(R.id.btnBackP);

        btnParent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ParentLoginActivity.this, ParentViewDriver.class);
                startActivity(intent);
                finish();
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ParentLoginActivity.this, StartingActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}