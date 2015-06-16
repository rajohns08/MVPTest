package com.example.adamjohns.mvptest.Retrofit;

import com.google.gson.JsonElement;

import retrofit.Callback;
import retrofit.http.GET;

public interface RestClient {

    @GET("/posts/1")
    void getRandomPlaceholderData(Callback<JsonElement> callback);

}
