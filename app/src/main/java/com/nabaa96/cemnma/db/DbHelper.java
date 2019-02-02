package com.nabaa96.cemnma.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.nabaa96.cemnma.Model.UserWeather;
public class DbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "user_weather0.db";
    private static final int DATABASE_VERSION = 1;
    final String SQL_CREATE_TABLE = "CREATE TABLE " + UserContacts.FavoriteEntry.TABLE_NAME + " ("
            + UserContacts.FavoriteEntry.USER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            UserContacts.FavoriteEntry.TEMP + " TEXT NOT NULL, " +
            UserContacts.FavoriteEntry.CALLEDAPI + " INTEGER , " +
            UserContacts.FavoriteEntry.COUNTRY + " TEXT NOT NULL, " +
            UserContacts.FavoriteEntry.SUN_SET + " TEXT NOT NULL, " +
            UserContacts.FavoriteEntry.COLUMN_DESCRIPTION + " TEXT NOT NULL, " +
            UserContacts.FavoriteEntry.COLUMN_HUMMINITY + " TEXT NOT NULL, " +
            UserContacts.FavoriteEntry.COLUMN_NAME + " TEXT NOT NULL, " +
            UserContacts.FavoriteEntry.POSTER_LASTUPDATE + " TEXT NOT NULL, " +

            UserContacts.FavoriteEntry.TIME + " TEXT NOT NULL " +
            "); ";
    String Query2 = "select * from " + UserContacts.FavoriteEntry.TABLE_NAME;

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(SQL_CREATE_TABLE);

    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int il) {

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + UserContacts.FavoriteEntry.TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public void saveUserWeatherInfo(UserWeather weather) {
        ContentValues values = new ContentValues();
        values.put(UserContacts.FavoriteEntry.TEMP, weather.getTemp());
        values.put(UserContacts.FavoriteEntry.CALLEDAPI, weather.getApiscall());
        values.put(UserContacts.FavoriteEntry.COUNTRY, weather.getCountry());
        values.put(UserContacts.FavoriteEntry.COLUMN_DESCRIPTION, weather.getDescription());
        values.put(UserContacts.FavoriteEntry.POSTER_LASTUPDATE, weather.getLastupdate());
        values.put(UserContacts.FavoriteEntry.TIME, weather.getTime());
        values.put(UserContacts.FavoriteEntry.COLUMN_NAME, weather.getCity());
        values.put(UserContacts.FavoriteEntry.SUN_SET, weather.getTime2());
        values.put(UserContacts.FavoriteEntry.COLUMN_HUMMINITY, weather.getHumidity());
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(UserContacts.FavoriteEntry.TABLE_NAME, null, values);
        db.close();

    }

    public UserWeather getLastUserWeatherInfo() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(Query2, null);
        UserWeather userWeather = new UserWeather();
        if (cursor.moveToFirst()) {
            userWeather.setTime2(cursor.getString(cursor.getColumnIndex(UserContacts.FavoriteEntry.SUN_SET)));
            userWeather.setTime(cursor.getString(cursor.getColumnIndex(UserContacts.FavoriteEntry.TIME)));
            userWeather.setCity(cursor.getString(cursor.getColumnIndex(UserContacts.FavoriteEntry.COLUMN_NAME)));
            userWeather.setHumidity(cursor.getString(cursor.getColumnIndex(UserContacts.FavoriteEntry.COLUMN_HUMMINITY)));
            userWeather.setDescription(cursor.getString(cursor.getColumnIndex(UserContacts.FavoriteEntry.COLUMN_DESCRIPTION)));
            userWeather.setLastupdate(cursor.getString(cursor.getColumnIndex(UserContacts.FavoriteEntry.POSTER_LASTUPDATE)));
            userWeather.setCountry(cursor.getString(cursor.getColumnIndex(UserContacts.FavoriteEntry.COUNTRY)));
            userWeather.setTemp((cursor.getString(cursor.getColumnIndex(UserContacts.FavoriteEntry.TEMP))));
        }
        return userWeather;
    }
}