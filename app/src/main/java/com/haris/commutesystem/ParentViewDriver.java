package com.haris.commutesystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ParentViewDriver extends AppCompatActivity {

    private Button btnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_view_driver);

        btnView = findViewById(R.id.btnViewDriver);

        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ParentViewDriver.this, ViewDriverOnMapActivity.class);
                startActivity(intent);
            }
        });

    }
}