package com.dev.wages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.dev.wages.pages.LoginActivity;
import com.dev.wages.pages.Register;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //TODO check for trouble
                goToPage(Register.class);
            }
        },3000);
    }

    void goToPage(Class page){
        Intent navigate = new Intent(getApplicationContext(),page);
        startActivity(navigate);
        finish();
    }
}