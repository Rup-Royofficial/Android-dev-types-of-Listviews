package com.example.listviewspinnerandautocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class autoCOMplete extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextViewID;
    ArrayList<String> arrayautocompleteTextView = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);

        autoCompleteTextViewID = findViewById(R.id.autocompleteTextView);

        arrayautocompleteTextView.add("C");
        arrayautocompleteTextView.add("C++");
        arrayautocompleteTextView.add("C++14");
        arrayautocompleteTextView.add("C++20");
        arrayautocompleteTextView.add("C#");
        arrayautocompleteTextView.add("Python");
        arrayautocompleteTextView.add("Java");
        arrayautocompleteTextView.add("Haskell");
        arrayautocompleteTextView.add("Rust");

        ArrayAdapter<String> autocompleteTextViewADT = new ArrayAdapter<>(autoCOMplete.this, android.R.layout.simple_list_item_1,arrayautocompleteTextView);
        autoCompleteTextViewID.setAdapter(autocompleteTextViewADT);
        autoCompleteTextViewID.setThreshold(1);
    }
}