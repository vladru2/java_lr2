package ru.rsatu;

import com.google.gson.Gson;

public class Main_lr2 {
    public static String getJsonData() {
        Gson gson = new Gson();

        Data data = new Data("Test", 1, TimeLib.getDate());
        return gson.toJson(data, Data.class);
    }

    static class Data {
        String string;
        int number;
        String date;

        public Data(String string, int number, String date) {
            this.string = string;
            this.number = number;
            this.date = date;
        }
    }
}