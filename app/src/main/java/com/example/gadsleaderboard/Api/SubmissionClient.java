package com.example.gadsleaderboard.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Riadh Laabidi on 01-Sep-20.
 */

public class SubmissionClient {
    public static final String BASE_URL = "https://docs.google.com/forms/d/e/";
    private static Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = builder.build();

    public static <T> T buildService(Class<T> type) {
        return retrofit.create(type);
    }
}
