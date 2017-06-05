package com.example.user.tempme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class TempMeActivity extends AppCompatActivity {

    public static double value ;
    EditText temp ;
    RadioButton toF;
    RadioButton toK;
    RadioButton toR;
    Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_me);

        temp = (EditText) findViewById(R.id.editText);
        toF = (RadioButton) findViewById(R.id.toFahrenheit);
        toK = (RadioButton) findViewById(R.id.toKelvin);
        toR = (RadioButton) findViewById(R.id.toReaumur);

        convert = (Button) findViewById(R.id.convert_button);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convert();
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                startActivity(intent);
            }
        });
    }

    public void convert() {
        value = new Double(temp.getText().toString());
        if(toF.isChecked()) {
            value = TemperatureConverter.celsiusToFarenheit(value);
        }else if(toK.isChecked()) {
            value = TemperatureConverter.celsiusToKelvin(value);
        }else if(toR.isChecked()) {
            value = TemperatureConverter.celsiusToReaumur(value);
        }
    }
}
