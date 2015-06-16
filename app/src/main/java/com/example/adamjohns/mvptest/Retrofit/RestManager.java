package com.example.adamjohns.mvptest.Retrofit;

import retrofit.RestAdapter;

public final class RestManager {

    private static final RestClient instance = new RestAdapter.Builder()
        .setEndpoint("http://jsonplaceholder.typicode.com/")
        .setLogLevel(RestAdapter.LogLevel.FULL)
        .build()
        .create(RestClient.class);

    private RestManager() {}

    public static RestClient getInstance() {
        return instance;
    }

}
