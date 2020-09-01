package com.example.gadsleaderboard.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Riadh Laabidi on 31-Aug-20.
 */

public class LeadersClient {
    public static final String BASE_URL = "https://gadsapi.herokuapp.com/";
    private static Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = builder.build();

    public static <T> T buildService(Class<T> type) {
        return retrofit.create(type);
    }
}


