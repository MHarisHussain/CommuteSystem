package com.haris.commutesystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ParentLoginActivity extends AppCompatActivity {

    private EditText email, password;
    private Button btnParent, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_login);

        email = findViewById(R.id.extended_Email);
        password = findViewById(R.id.extended_Password);

        btnParent = findViewById(R.id.btnLoginParent);
        btnBack = findViewById(R.id.btnBackP);


        btnParent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = email.getText().toString();
                String userPassword = password.getText().toString();
                if(userName.equals("osama@gmail.com") && userPassword.equals("1234")){
                    Intent intent = new Intent(ParentLoginActivity.this, ParentViewDriver.class);
                    startActivity(intent);
                    finish();    
                }else{
                    Toast.makeText(ParentLoginActivity.this, "Sorry your credentials are not correct", Toast.LENGTH_SHORT).show();
                }
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