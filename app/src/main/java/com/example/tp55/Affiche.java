package com.example.tp55;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class Affiche extends AppCompatActivity {
    ListView ls;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affiche);
        ls=findViewById(R.id.listView);
        Helper h=new Helper(Affiche.this);
        Cursor c = h.fetchAllCentre();
        SimpleCursorAdapter a = new SimpleCursorAdapter(this,R.layout.item,c,new String[]{c.getColumnName(0),c.getColumnName(1),c.getColumnName(2)},new int[]{R.id.id,R.id.nom,R.id.ville},1);
        ls.setAdapter(a);
    }
}