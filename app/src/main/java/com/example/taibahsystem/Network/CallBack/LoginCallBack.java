package com.example.taibahsystem.Network.CallBack;


import android.content.Context;

import com.example.taibahsystem.Network.Models.Results;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by LEnovo on 19/04/17.
 */

public class LoginCallBack implements Callback<Results> {
    private Context context;

    @Override
    public void onResponse(Call<Results> call, Response<Results> response) {

    }

    @Override
    public void onFailure(Call<Results> call, Throwable t) {

    }
}
