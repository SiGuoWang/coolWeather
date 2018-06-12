package com.coolweather.android.db;


import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/6/12.
 */
public class country extends DataSupport{
    private int id;
    private String countryName;
    private String weatherid;
    private int cityid;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
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
