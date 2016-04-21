package com.nscmobileappclass.jmab.habittracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnNewHabit;
    Button btnHabit1;
    Button btnHabit2;
    Button btnHabit3;
    Button btnSummary;

    TextView txtVwCount1;
    TextView txtVwCount2;
    TextView txtVwCount3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNewHabit= (Button)findViewById(R.id.newHabitBtn);
        btnHabit1 = (Button)findViewById(R.id.cigaretteBtn);
        btnHabit2 = (Button)findViewById(R.id.chocolateBtn);
        btnHabit3 = (Button)findViewById(R.id.alcoholBtn);
        btnSummary = (Button)findViewById(R.id.summaryBtn);

        txtVwCount1 = (TextView)findViewById(R.id.textViewCount1);
        txtVwCount2 = (TextView)findViewById(R.id.textViewCount2);
        txtVwCount3 = (TextView)findViewById(R.id.textViewCount3);

        btnHabit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String countValue = txtVwCount1.getText().toString();
                int intCountValue =Integer.parseInt(countValue);
                intCountValue++;

                txtVwCount1.setText(String.valueOf(intCountValue));

            }
        });

        btnHabit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String countValue = txtVwCount2.getText().toString();
                int intCountValue =Integer.parseInt(countValue);
                intCountValue++;

                txtVwCount2.setText(String.valueOf(intCountValue));

            }
        });

        btnHabit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String countValue = txtVwCount3.getText().toString();
                int intCountValue =Integer.parseInt(countValue);
                intCountValue++;

                txtVwCount3.setText(String.valueOf(intCountValue));

            }
        });

    }
}
