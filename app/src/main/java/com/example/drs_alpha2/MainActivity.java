package com.example.drs_alpha2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b=(Button)findViewById(R.id.SubmitButton);
        b.setOnClickListener(new SubmitButtonClicked());
    }

    private void submitButtonClicked(){
        Intent dashboardStart = new Intent(this, Dashboard.class);
        dashboardStart.putExtra("name",((TextView)findViewById(R.id.Name)).getText().toString());
        dashboardStart.putExtra("uid",((TextView)findViewById(R.id.UID)).getText().toString());
        startActivity(dashboardStart);

    }


    class SubmitButtonClicked implements View.OnClickListener{

        @Override
        public void onClick(View v)
        {
            submitButtonClicked();
        }
    }

}

