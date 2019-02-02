package com.nabaa96.cemnma.Model;


/**
 * this  sql table
 */
public class UserWeather {
    private String time;
    private String time2;
    private String description;
    private int apiscall;
    private int id = 0;
    private String humidity;
    private String Country;

    public int getApiscall() {
        return apiscall;
    }

    public void setApiscall(int apiscall) {
        this.apiscall = apiscall;
    }

    private String City;
    private String name;
    private String lastupdate;
    private String temp;
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(String lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public UserWeather(int apiscall,String time, String time2, String description, int id, String humidity, String country, String city, String name, String lastupdate, String temp) {
        this.time = time;
        this.description = description;
        this.id = id;
        this.humidity = humidity;
        Country = country;
        City = city;
        this.apiscall=apiscall;
        this.name = name;
        this.lastupdate = lastupdate;
        this.temp = temp;
    }


    public UserWeather() {
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

    @Override
    public String toString() {
        return "UserWeather{" +
                "time='" + time + '\'' +
                ", time2='" + time2 + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                ", humidity='" + humidity + '\'' +
                ", Country='" + Country + '\'' +
                ", City='" + City + '\'' +
                ", name='" + name + '\'' +
                ", lastupdate='" + lastupdate + '\'' +
                ", temp='" + temp + '\'' +
                '}';
    }
}

