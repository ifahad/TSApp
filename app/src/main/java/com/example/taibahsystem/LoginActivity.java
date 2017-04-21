package com.example.taibahsystem;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.taibahsystem.Network.Models.Results;
import com.example.taibahsystem.Network.RetrofitObj;
import com.example.taibahsystem.Network.ServicerAPI;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity{

    private EditText username;
    private EditText password;
    private Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initCommpent();

        submit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                RetrofitObj.CreateRetrofitObj();
                final ServicerAPI loginAPI=RetrofitObj.getRetrofitObj()
                        .create(ServicerAPI.class);
                Call<Results> login= loginAPI
                        .GETinfo(username.getText().toString(),
                                password.getText().toString());
                login.enqueue(new Callback<Results>() {
                    @Override
                    public void onResponse(Call<Results> call, Response<Results> response) {
                       Log.d("message",response.body().getMessage());
                    }

                    @Override
                    public void onFailure(Call<Results> call, Throwable t) {
                        Log.d("error",t.getMessage());
                    }
                });
            }
        });


    }
    private void initCommpent(){
        username= (EditText) findViewById(R.id.username_login);
        password= (EditText) findViewById(R.id.password_login);
        submit= (Button) findViewById(R.id.btnsbumit_login);
    }















    }


