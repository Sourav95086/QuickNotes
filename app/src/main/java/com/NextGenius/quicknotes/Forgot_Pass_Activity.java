package com.NextGenius.quicknotes;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Forgot_Pass_Activity extends AppCompatActivity {

    EditText editText1 , editText2;
    Button bt ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_forgot_pass);

        editText1 = findViewById(R.id.CheckAnswer);
        editText2 = findViewById(R.id.NewPassword);
        bt = findViewById(R.id.ForgotPassword);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String GivenAnswer = editText1.getText().toString();
                String NewPassword = editText2.getText().toString();
                SharedPreferences sp = getSharedPreferences("signup",MODE_PRIVATE);
                String RealAnswer = sp.getString("Answer",null);
                if(GivenAnswer.equals(RealAnswer)){
                    SharedPreferences.Editor edit = sp.edit();
                    edit.putString("Pasword",NewPassword);
                    edit.apply();
                    Toast.makeText(Forgot_Pass_Activity.this, "Password Changed ", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(), LogIn_Activity.class));
                    finish();
                }else {
                    Toast.makeText(Forgot_Pass_Activity.this, "Account Not Found", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}