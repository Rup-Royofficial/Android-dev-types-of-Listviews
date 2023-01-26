package com.example.listviewspinnerandautocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class spiNNer extends AppCompatActivity {
    Spinner spinnerid;
    ArrayList<String> arraySpinner = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinnerid = findViewById(R.id.spinnerID);

        arraySpinner.add("Aadhar Card");
        arraySpinner.add("Voter Card");
        arraySpinner.add("Pan Card");
        arraySpinner.add("Licence Card");
        arraySpinner.add("ID Card");
        arraySpinner.add("Lawra Card");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(spiNNer.this, android.R.layout.simple_spinner_dropdown_item,arraySpinner);
        spinnerid.setAdapter(spinnerAdapter);

    }
}