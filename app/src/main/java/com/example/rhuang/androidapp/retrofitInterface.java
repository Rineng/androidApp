package com.example.rhuang.androidapp;


import java.util.List;

import retrofit2.Retrofit;
import retrofit2.http.GET;

public interface retrofitInterface {
    public static Retrofit retro = null;
    @GET("google.com")
    List<String> reposForUser();


}
