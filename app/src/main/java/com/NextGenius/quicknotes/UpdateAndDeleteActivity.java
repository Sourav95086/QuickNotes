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

import java.util.ArrayList;

public class UpdateAndDeleteActivity extends AppCompatActivity {

    EditText ed1 , ed2 ;
    Button btm1 , btm2;
//    ArrayList<ModalClass> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_update_and_delete);

        ed1 = findViewById(R.id.editTitle);
        ed2 = findViewById(R.id.editContent);
        btm1 = findViewById(R.id.UpdateButton);
        btm2 = findViewById(R.id.DeleteButton);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String note = intent.getStringExtra("note");
        int id = intent.getIntExtra("id",-1);


        ed1.setText(title);
        ed2.setText(note);


        btm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newTitle = ed1.getText().toString();
                String newnote = ed2.getText().toString();
                ModalClass mc = new ModalClass();
                mc.sl_no = id;
                mc.title = newTitle;
                mc.note = newnote;
                DataBase db = new DataBase(getApplicationContext());
                db.updateNotes(mc);
              startActivity(new Intent(getApplicationContext(), MainActivity.class));
               finishAffinity();
            }
        });
        btm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataBase db = new DataBase(getApplicationContext());
                db.DeleteNote(id);
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finishAffinity();
            }
        });



    }
}