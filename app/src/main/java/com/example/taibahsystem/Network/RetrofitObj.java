package com.example.taibahsystem.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by LEnovo on 19/04/17.
 */

public class RetrofitObj {
    private static Retrofit RetrofitObj=null;
    public static void CreateRetrofitObj(){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("http://192.168.8.104:81/gproject/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RetrofitObj=retrofit;

    }
    public static Retrofit getRetrofitObj(){return RetrofitObj;}
}
