package com.nabaa96.cemnma.Model;

import java.util.List;

public class WeatherResponse {

    public WeatherResponse() {
    }

    public WeatherResponse(String dt, Coord coord,  List<Weather> weather, String name, String cod, Main main, Clouds clouds, String id, Sys sys, String base, Wind wind) {
        this.dt = dt;
        this.coord = coord;
        this.weather= weather;
        this.name = name;
        this.cod = cod;
        this.main = main;
        this.clouds = clouds;
        this.id = id;
        this.sys = sys;
        this.base = base;
        this.wind = wind;
    }

    private String dt;

        private Coord coord;

      private List<Weather> weather;

        private String name;

        private String cod;

        private Main main;

        private Clouds clouds;

        private String id;

        private Sys sys;

        private String base;

        private Wind wind;

        public String getDt ()
        {
            return dt;
        }

        public void setDt (String dt)
        {
            this.dt = dt;
        }

        public Coord getCoord ()
        {
            return coord;
        }

        public void setCoord (Coord coord)
        {
            this.coord = coord;
        }


    public List<Weather> getWeathers() {
        return weather;
    }

    public void setWeathers(List<Weather> weather) {
        this.weather = weather;
    }

    public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        public String getCod ()
        {
            return cod;
        }

        public void setCod (String cod)
        {
            this.cod = cod;
        }

        public Main getMain ()
        {
            return main;
        }

        public void setMain (Main main)
        {
            this.main = main;
        }

        public Clouds getClouds ()
        {
            return clouds;
        }

        public void setClouds (Clouds clouds)
        {
            this.clouds = clouds;
        }

        public String getId ()
        {
            return id;
        }

        public void setId (String id)
        {
            this.id = id;
        }

        public Sys getSys ()
        {
            return sys;
        }

        public void setSys (Sys sys)
        {
            this.sys = sys;
        }

        public String getBase ()
        {
            return base;
        }

        public void setBase (String base)
        {
            this.base = base;
        }

        public Wind getWind ()
        {
            return wind;
        }

        public void setWind (Wind wind)
        {
            this.wind = wind;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [dt = "+dt+", coord = "+coord+", weather = "+weather+", name = "+name+", cod = "+cod+", main = "+main+", clouds = "+clouds+", id = "+id+", sys = "+sys+", base = "+base+", wind = "+wind+"]";
        }
    }












