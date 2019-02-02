package com.nabaa96.cemnma.Model;

public class Sys {

    private String country;

    private String sunrise;

    private String sunset;

    private String message;
    public Sys(String country, String sunrise, String sunset, String message) {
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.message = message;
    }


        public String getCountry ()
        {
            return country;
        }


        public String getSunrise ()
        {
            return sunrise;
        }


        public String getSunset ()
        {
            return sunset;
        }


        public String getMessage ()
        {
            return message;
        }

        public void setMessage (String message)
        {
            this.message = message;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [country = "+country+", sunrise = "+sunrise+", sunset = "+sunset+", message = "+message+"]";
        }
    }

