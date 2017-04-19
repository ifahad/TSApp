package com.example.taibahsystem.Network;

import com.example.taibahsystem.Network.Models.Results;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by LEnovo on 19/04/17.
 */

public interface ServicerAPI {
    @FormUrlEncoded
    @POST("login.php")
    Call<Results> GETinfo(@Field("Username") String Username,
                          @Field("Password") String Password);
}
