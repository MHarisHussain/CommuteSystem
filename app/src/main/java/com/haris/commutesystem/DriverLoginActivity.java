package com.haris.commutesystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.developer.mtextfield.ExtendedEditText;
import com.google.firebase.auth.FirebaseAuth;

public class DriverLoginActivity extends AppCompatActivity {

    private Button btnLogin,btnBack;
    private ExtendedEditText mEmail, mPassword;

    private FirebaseAuth auth;
    private FirebaseAuth.AuthStateListener mAuthListner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_login);

        btnLogin = findViewById(R.id.btnLoginDriver);
        btnBack = findViewById(R.id.btnBackD);
        
        mEmail = findViewById(R.id.extended_Email);
        mPassword = findViewById(R.id.extended_Password);
            
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userEmail = mEmail.getText().toString();
                String userPassword = mPassword.getText().toString();
                if(userEmail.equals("khalid@gmail.com") && userPassword.equals("4321")){
                    Intent intent = new Intent(DriverLoginActivity.this, MainNavDriver.class);
                    startActivity(intent);
                    finish();    
                }else{
                    Toast.makeText(DriverLoginActivity.this, "Sorry your credentials are not correct", Toast.LENGTH_SHORT).show();   
                }
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DriverLoginActivity.this, StartingActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();

    }

    @Override
    protected void onStart() {
        super.onStart();

    }
}