package com.example.batdongsan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
Button btnSignUp,btnLogIn;
ImageView img_fb, img_gmail, img_tiktok, img_twitter;
EditText txt_userName, txt_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        intWidget();
    }

    public void signUpEvent(View view) {
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Cách 1
//                Intent signUpPopUp = new Intent(Login.this, SignUp.class);
//                startActivity(signUpPopUp);
                //Cách 2
                startActivity(new Intent(Login.this, SignUp.class));
            }
        });
    }

    void intWidget(){
        btnSignUp = (Button) findViewById(R.id.btnSignUpId);
        btnLogIn = (Button) findViewById(R.id.btnLoginId) ;
        
        img_fb = (ImageView) findViewById(R.id.img_fbId);
        img_gmail = (ImageView) findViewById(R.id.img_gmailId);
        img_tiktok = (ImageView) findViewById(R.id.img_tiktokId);
        img_twitter = (ImageView) findViewById(R.id.img_twitterId);
        
        txt_userName = (EditText) findViewById(R.id.txt_loginNameId);
        txt_password = (EditText) findViewById(R.id.txt_passwordId);
    }

    public void fbPage(View view) {
        img_fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fbPopUp = new Intent(Intent.ACTION_VIEW, Uri.parse("http://facebook.com/"));
                startActivity(fbPopUp);
            }
        });
    }

    public void gmailPopUp(View view) {
        img_gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fbPopUp = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mail.google.com/"));
                startActivity(fbPopUp);
            }
        });
    }

    public void tiktokPopUp(View view) {
        img_tiktok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fbPopUp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tiktok.com/vi-VN"));
                startActivity(fbPopUp);
            }
        });
    }

    public void twitterPopUp(View view) {
        img_twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fbPopUp = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/?lang=vi"));
                startActivity(fbPopUp);
            }
        });
    }

    public void signInEvent(View view) {
        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt_userName.getText().toString().length() == 0){
                    Toast.makeText(Login.this, "Bạn chưa điền tài khoản", Toast.LENGTH_SHORT).show();
                }
               else if (txt_password.getText().toString().length() == 0)
                   Toast.makeText(Login.this, "Bạn chưa điền mật khẩu", Toast.LENGTH_SHORT).show();
                else
                   Toast.makeText(Login.this, "Bạn đăng nhập thành công", Toast.LENGTH_SHORT).show();
            }
        });
    }
} 