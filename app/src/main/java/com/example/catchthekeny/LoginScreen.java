package com.example.catchthekeny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
    }

    public void start(View view){
        Intent intent = new Intent(LoginScreen.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void close(View view){
        Toast.makeText(this, "See you later!", Toast.LENGTH_SHORT).show();
        System.exit(0);
    }

}