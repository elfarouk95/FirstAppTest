package com.app.firstapptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Wight;
    EditText Hight;
    TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Wight = findViewById(R.id.edW);
        Hight = findViewById(R.id.edH);
        Result = findViewById(R.id.rsult);
    }


    public void Action(View v) {
        String w = Wight.getText().toString();
        String h = Hight.getText().toString();
        double rw = Double.parseDouble(w);
        double rh = Double.parseDouble(h);
        double r = rw * 5 - rh * 6;
        if (r > 100 && r < 200)
        {
            Result.setText("Red");
        }
        else{

            Result.setText("Blue");
        }
    }
}
