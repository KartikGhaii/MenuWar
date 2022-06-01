package com.example.mymenu;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity<option> extends AppCompatActivity {

    TextView tv;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
         super.onOptionsItemSelected(item);
         switch(item.getItemId()){
             case R.id.rus:
                 tv.setText("We support Russia");
                 return true;
             case R.id.ukr:
                 tv.setText("We support Ukraine");
                 return true;
             default:
                 tv.setText("Show Your Support");
                 return true;
         }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inf = getMenuInflater();
        inf.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv= findViewById(R.id.textview);

    }
}
