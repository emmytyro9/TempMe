package com.example.user.tempme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SuggestionActivity extends AppCompatActivity {

    TextView suggestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion);
        suggestion = (TextView) findViewById(R.id.sg) ;
        suggestion.setText( goodWeather() + "\n\n" + tooHotWeather() + "\n\n" + tooColdWeather());
    }


    public String goodWeather() {
        return "If it's a good weather. It is one of the secrets of Nature in its mood of mockery that fine " +
                "weather lays heavier weight on the mind and hearts of the depressed and " +
                "the inwardly tormented than does a really bad day with dark rain sniveling " +
                "continuously and sympathetically from a dirty sky";
    }

    public String tooHotWeather() {
        return "If it's too hot already! Without any doubts, heat is draining physical and mental energy. " +
                "Being in the sun makes everybody lazy and incapable of contemplating " +
                "about important daily tasks. A yummy ice cream or tasty cold drink will " +
                "make you refreshed. And in order to make your hot weather feel less " +
                "stressed and bored, we have collected 25 hot weather quotes for you. " +
                "Some of them are so funny that will make you smile in this hot day. ";
    }

    public String tooColdWeather() {
        return "If it's too cold already! It's easier to change your body temperature than " +
                "room temperature, not to mention more eco-friendly. Instead of turning up the " +
                "heat, put on another layer of clothing.";
    }
}
