package com.example.listviewspinnerandautocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listViewID;
    ArrayList<String> arrName = new ArrayList<>();
    Intent btnIntentSpinner = new Intent();
    Intent btnIntentAutoComplete = new Intent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewID =  findViewById(R.id.listViewID);

        arrName.add("lawda 1");
        arrName.add("lawda 2");
        arrName.add("lawda 3");
        arrName.add("lawda 4");
        arrName.add("lawda 5");
        arrName.add("lawda 6");
        arrName.add("lawda 7");
        arrName.add("lawda 8");
        arrName.add("lawda 9");
        arrName.add("lawda 10");
        arrName.add("lawda 11");
        arrName.add("lawda 12");
        arrName.add("lawda 13");
        arrName.add("lawda 14");
        arrName.add("lawda 15");
        arrName.add("lawda 16");
        arrName.add("lawda 17");
        arrName.add("lawda 18");
        arrName.add("lawda 19");
        arrName.add("lawda 20");
        arrName.add("lawda 21");
        arrName.add("lawda 22");
        arrName.add("lawda 23");

        ArrayAdapter<String> arrAdpt = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,arrName);
        listViewID.setAdapter(arrAdpt);

        listViewID.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0) {
                    Toast.makeText(MainActivity.this,"Tu lawda 1",Toast.LENGTH_SHORT).show();
                }
                else if(i==1){
                    startActivity(new Intent(MainActivity.this, spiNNer.class));
                }
                else if(i==2){
                    startActivity(new Intent(MainActivity.this, autoCOMplete.class));
                }
                else if(i==3){
                    Toast.makeText(MainActivity.this,"Tu lawda 4",Toast.LENGTH_SHORT).show();
                }
                else if(i==4){
                    Toast.makeText(MainActivity.this,"Tu lawda 5",Toast.LENGTH_SHORT).show();
                }
                else if(i==5){
                    Toast.makeText(MainActivity.this,"Tu lawda 6",Toast.LENGTH_SHORT).show();
                }
                else if(i==6){
                    Toast.makeText(MainActivity.this,"Tu lawda 7",Toast.LENGTH_SHORT).show();
                }
                else if(i==7){
                    Toast.makeText(MainActivity.this,"Tu lawda 8",Toast.LENGTH_SHORT).show();
                }
                else if(i==8){
                    Toast.makeText(MainActivity.this,"Tu lawda 9",Toast.LENGTH_SHORT).show();
                }
                else if(i==9){
                    Toast.makeText(MainActivity.this,"Tu lawda 10",Toast.LENGTH_SHORT).show();
                }
                else if(i==10){
                    Toast.makeText(MainActivity.this,"Tu lawda 11",Toast.LENGTH_SHORT).show();
                }
                else if(i==11){
                    Toast.makeText(MainActivity.this,"Tu lawda 12",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}