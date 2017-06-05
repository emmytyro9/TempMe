package com.example.user.tempme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.user.tempme.TempMeActivity.value;

public class ResultActivity extends AppCompatActivity {

    public static TextView result;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        result = (TextView) findViewById(R.id.result);
        String txtFormat = String.format("%.1f" , value);
        result.setText(txtFormat);

        button = (Button) findViewById(R.id.suggestion_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SuggestionActivity.class) ;
                startActivity(intent);
            }
        });
    }
}
