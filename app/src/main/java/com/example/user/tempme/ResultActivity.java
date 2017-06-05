package com.example.user.tempme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.user.tempme.TempMeActivity.value;

public class ResultActivity extends AppCompatActivity {

    public static TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        result = (TextView) findViewById(R.id.result);
        result.setText(value + "");
    }




}
