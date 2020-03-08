package com.example.drs_alpha2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Dashboard extends Activity {


    private String Username="";
    private String Uid="";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Intent i= getIntent();
        Username = i.getStringExtra("name");
        Uid = i.getStringExtra("uid");
        Toast.makeText(this,Username+ " with ID: "+ Uid,Toast.LENGTH_LONG).show();
    }
}
