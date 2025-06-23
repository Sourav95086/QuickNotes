package com.NextGenius.quicknotes;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Splash_Screen_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash_screen);

        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sp = getSharedPreferences("signup",MODE_PRIVATE);
                Boolean check = sp.getBoolean("new/old_user",false); //  check is a boolean checks new user or old user true means new user false means old user
                if(check){
                    startActivity(new Intent(getApplicationContext(), LogIn_Activity.class));
                    finish();
                }else{
                    startActivity(new Intent(getApplicationContext(), SignUp_Activity.class));
                    finish();
                }

            }
        },4000);

    }
}