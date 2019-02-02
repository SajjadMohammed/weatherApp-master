package com.nabaa96.cemnma.Model;

public class Main
{

    private String temp;

    private String temp_min;

    private String grnd_level;

    private String humidity;

    private String pressure;

    private String sea_level;

    private String temp_max;

    public Main(String temp, String temp_min, String grnd_level, String humidity, String pressure, String sea_level, String temp_max) {
        this.temp = temp;
        this.temp_min = temp_min;
        this.grnd_level = grnd_level;
        this.humidity = humidity;
        this.pressure = pressure;
        this.sea_level = sea_level;
        this.temp_max = temp_max;
    }

    public String getTemp ()
    {
        return temp;
    }
    public String getHumidity ()
    {
        return humidity;
    }
    @Override
    public String toString()
    {
        return "ClassPojo [temp = "+temp+", temp_min = "+temp_min+", grnd_level = "+grnd_level+", humidity = "+humidity+", pressure = "+pressure+", sea_level = "+sea_level+", temp_max = "+temp_max+"]";
    }
}
