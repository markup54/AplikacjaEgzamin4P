package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> notatki = new ArrayList<>();
        notatki.add("Podłogi");
        notatki.add("Wyczesać psa");
        notatki.add("Kino");
        ListView listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this,
                        android.R.layout.simple_list_item_1,
                        notatki);
        listView.setAdapter(adapter);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = findViewById(R.id.editTextTextPersonName);
                String not = editText.getText().toString();
                notatki.add(not);
                adapter.notifyDataSetChanged();
            }
        });
    }
}