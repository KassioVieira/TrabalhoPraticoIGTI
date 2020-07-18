package com.kassioluz.helloword;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        if(isFirstTime()){
            saveFirstTime();

            Handler handle = new Handler();
            handle.postDelayed(new Runnable() {
                @Override public void run() {
                    showMain();
                }
            }, 4000);

        }else {
            showMain();
        }
    }

    private void showMain() {
        Intent intent = new Intent(SplashScreen.this, MainActivity.class);
        startActivity(intent);
        finish();
    }


    private boolean isFirstTime(){

        sharedPreferences = getSharedPreferences("first", Context.MODE_PRIVATE);
        boolean result = sharedPreferences.getBoolean("first",true);

        return result;
    }

    private void saveFirstTime(){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("first", false);
        editor.commit();
    }

}
