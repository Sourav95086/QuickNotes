package com.NextGenius.quicknotes;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class LogIn_Activity extends AppCompatActivity {

    EditText edt1;
    Button btm;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        edt1 = findViewById(R.id.EnteredPassword);
        btm = findViewById(R.id.loginbutton);
        txt = findViewById(R.id.gotoForgotPassword);

        btm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String EnterdPass = edt1.getText().toString();
                SharedPreferences sp = getSharedPreferences("signup",MODE_PRIVATE);
                String RealPassword = sp.getString("Pasword",null);
               // Toast.makeText(getApplicationContext(), "password is "+RealPassword, Toast.LENGTH_SHORT).show();
                if(EnterdPass.equals(RealPassword)){
                    SharedPreferences.Editor edit = sp.edit();
                    edit.putBoolean("new/old_user",true);
                    edit.apply();
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    finish();
                }else{
                    Toast.makeText(LogIn_Activity.this, "Wrong Password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Forgot_Pass_Activity.class));
                finish();
            }
        });

    }



}