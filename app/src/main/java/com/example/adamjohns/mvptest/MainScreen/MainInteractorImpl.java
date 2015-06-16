package com.example.adamjohns.mvptest.MainScreen;

import com.example.adamjohns.mvptest.Retrofit.RestManager;
import com.google.gson.JsonElement;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainInteractorImpl implements MainInteractor{

    @Override
    public void getData(final OnDataRetrievedListener listener) {

        RestManager.getInstance().getRandomPlaceholderData(new Callback<JsonElement>() {
            @Override
            public void success(JsonElement jsonElement, Response response) {
                listener.onSuccess(jsonElement.toString());
            }

            @Override
            public void failure(RetrofitError error) {
                listener.onFailure();
            }
        });

    }

}
