package com.NextGenius.quicknotes;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Add_Note_Activity extends AppCompatActivity {

    EditText title , content ;
    Button addnote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_note);


        //geting id's

        title = findViewById(R.id.Title);
        content = findViewById(R.id.Content);
        addnote = findViewById(R.id.AddNoteButton);


        //click listner of add button adding data to database

        addnote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title1 = title.getText().toString();
                String note = content.getText().toString();

                DataBase db = new DataBase(getApplicationContext());
                db.StoreData(title1,note);

               startActivity(new Intent(Add_Note_Activity.this, MainActivity.class));
               finish();
            }
        });

    }
}