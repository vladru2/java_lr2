package ru.rsatu;

import com.google.gson.Gson;

public class Pr2 {
    public static String intToJson(int x) {
        Gson gson = new Gson();
        return gson.toJson(x);
    }

    public static int jsonToInt(String x) {
        Gson gson = new Gson();
        return gson.fromJson(x, Integer.class);
    }
}
