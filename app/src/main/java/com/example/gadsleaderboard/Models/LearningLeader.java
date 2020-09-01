package com.example.gadsleaderboard.Models;

/**
 * Created by Riadh Laabidi on 31-Aug-20.
 */

public class LearningLeader {

    private String name;
    private int hours;
    private String country;
    private String badgeUrl;

    public LearningLeader(String name, int hours, String country, String badgeUrl) {
        this.name = name;
        this.hours = hours;
        this.country = country;
        this.badgeUrl = badgeUrl;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public String getCountry() {
        return country;
    }

    public String getBadgeUrl() {
        return badgeUrl;
    }
}


