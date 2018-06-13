package com.coolweather.android.db;


import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/6/12.
 */
public class County extends DataSupport{
    private int id;
    private String countyName;
    private String weatherid;
    private int cityid;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCountyName() {
        return countyName;
    }
    public void setCountyName(String countryName) {
        this.countyName = countryName;
    }
    public String getWeatherid() {
        return weatherid;
    }
    public void setWeatherid(String weatherid) {
        this.weatherid = weatherid;
    }
    public int getCityid() {
        return cityid;
    }
    public void setCityid(int cityid) {
        this.cityid = cityid;
    }
}
