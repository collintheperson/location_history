package models;

import java.util.ArrayList;

/**
 * Created by Guest on 8/9/17.
 */
public class Location {
    private String suitcase;
    private String toiletries;
    private boolean map;
    private static ArrayList<Location> instances = new ArrayList<>();


    public Location(String suitcase, String toiletries, boolean map) {
        this.suitcase = suitcase;
        this.toiletries = toiletries;
        this.map = map;
        instances.add(this);
    }

    public String getSuitcase() {
        return suitcase;
    }

    public static ArrayList<Location> getAll() {
        return instances;
    }

    public String getToiletries() {
        return toiletries;
    }

    public boolean isMap() {
        return map;
    }
}
