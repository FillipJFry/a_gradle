package com.goit.fry;

import com.google.gson.Gson;

public class App {
    private final String name;
    private final String lastName;

    public static void main(String[] args) {
        App app = new App();
        Gson gson = new Gson();

        String json = gson.toJson(app);
        System.out.println(json);
    }

    public App() {

        name = "Fillip J";
        lastName = "Fry";
    }
}
