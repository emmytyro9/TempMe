package com.example.user.tempme;

/**
 * Created by USER on 5/6/2560.
 */

public class TemperatureConverter {
    public static double celsiusToFarenheit(double celsius) {
        double fahrenheit = 0;
        fahrenheit = 32 +(celsius * 9/5);
        return fahrenheit;
    }

    public static double celsiusToKelvin(double celsius) {
        double kelvin = 0;
        kelvin = celsius + 273.15;
        return kelvin;
    }

    public static double celsiusToReaumur(double celsius) {
        double reaumur = 0;
        reaumur = celsius * 0.8;
        return reaumur;
    }

    public static double fahrenheitToCelsius(double f) {
        double celsius = 0;
        celsius = (f - 32) * 0.556;
        return  celsius;
    }

    public static double fahrenheitToKelvin(double f) {
        double kelvin = 0;
        kelvin = (f + 459.67) *1.8;
        return  kelvin;
    }

    public  static double fahrenheitToReaumur(double f) {
        double reaumur = 0;
        reaumur = (f - 32) *0.44;
        return  reaumur;
    }
}
