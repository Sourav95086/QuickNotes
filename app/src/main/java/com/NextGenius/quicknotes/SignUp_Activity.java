package com.NextGenius.quicknotes;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUp_Activity extends AppCompatActivity {

    EditText ed1 , ed2;
    Button btn ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);

        ed1 = findViewById(R.id.Answer);
        ed2 = findViewById(R.id.Password);
        btn = findViewById(R.id.Signupbtn);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Answer , Password;
                Answer = ed1.getText().toString();
                Password = ed2.getText().toString();
                SharedPreferences sp = getSharedPreferences("signup",MODE_PRIVATE);
                SharedPreferences.Editor edit = sp.edit();
                edit.putString("Answer",Answer);
                edit.putString("Pasword",Password);
                edit.putBoolean("new/old_user",true);
                edit.apply();
                startActivity(new Intent(getApplicationContext(),LogIn_Activity.class));
                finish();
            }
        });
    }
    public void gotologin(View view){
        startActivity(new Intent(getApplicationContext(),LogIn_Activity.class));
        finish();
    }
}


