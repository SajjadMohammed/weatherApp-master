package com.nabaa96.cemnma.SavingWeatherInfo;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.nabaa96.cemnma.MainActivity;
import com.nabaa96.cemnma.Model.UserWeather;
import com.nabaa96.cemnma.db.DbHelper;
import static android.content.Context.MODE_PRIVATE;
import static com.nabaa96.cemnma.MainActivity.PREF_NAME;

public class SavingWeatherDetails {
    public static void SaveWeatherDetailsInPref(Context context, UserWeather info) {
        SharedPreferences preferences = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = preferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(info);
        prefsEditor.putString(PREF_NAME, json);
        prefsEditor.apply();
    }

    public static void SaveWeatherDetailsInDB(DbHelper dbHelper, UserWeather info ,String city, String country, String dateNow, String description, String humminty, String sunset, String sunrise, String temp) {
        info.setTemp(temp);
        info.setCity(city);
        info.setCountry(country);
        info.setLastupdate(dateNow);
        info.setDescription(description);
        info.setHumidity(humminty);
        info.setTime(sunset);
        info.setTime2(sunrise);
        dbHelper.saveUserWeatherInfo(info);
    }

    public static void ShowWeatherDetails(Context context ,String city, String country, String dateNow, String description, String humminty, String sunset, String sunrise, String temp) {
        ((MainActivity)context).country.setText(String.format("%s/%s", country,city));
        ((MainActivity)context).currentDate.setText(dateNow);
        ((MainActivity)context).description.setText(description);
        ((MainActivity)context).humidity.setText(humminty);
        ((MainActivity)context).sunRise.setText(sunrise);
        ((MainActivity)context).sunSet.setText(sunset);
        ((MainActivity)context).temperature.setText(String.format("%s C°", temp));
    }

}
