package com.nabaa96.cemnma.Model;

public class Coord
{
    private String lon;

    private String lat;

    public Coord(String lon, String lat) {
        this.lon = lon;
        this.lat = lat;
    }

    @Override
    public String toString()
    {
        return new StringBuilder("[").append(this.lat).append(",").append(this.lon).append("]").toString();
    }
}
