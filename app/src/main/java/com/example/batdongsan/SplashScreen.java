package com.example.batdongsan;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //Splash Screen (chuyển đổi form)
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this,Login.class));//Màn hình chuyển đổi.this, màn hình tiếp theo.class
                finish();
            }
        },1000);//Sau 2 giây sẽ hiện form kế tiếp
    }
}