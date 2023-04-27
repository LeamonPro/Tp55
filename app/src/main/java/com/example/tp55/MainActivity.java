package com.example.tp55;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,ville,latitude,longitude;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.Name);
        ville=findViewById(R.id.Ville);
        latitude=findViewById(R.id.Latitude);
        longitude=findViewById(R.id.Longitude);
        b=findViewById(R.id.submit);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Centre c=new Centre(name.getText().toString(),ville.getText().toString(),latitude.getText().toString(),longitude.getText().toString());
                Helper h=new Helper(MainActivity.this);
                h.addCentre(c);
                Intent i=new Intent(MainActivity.this,Affiche.class);
                startActivity(i);
            }
        });
    }

}