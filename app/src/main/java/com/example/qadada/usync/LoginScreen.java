package com.example.qadada.usync;

import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class LoginScreen extends AppCompatActivity {


    RelativeLayout rellay1;
    ImageView imageView_logo;
    Handler handler = new Handler();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        rellay1 = findViewById(R.id.rellay1);
        TextView login = (TextView) findViewById(R.id.login);
        TextView user = (TextView) findViewById(R.id.user);
        TextView pass = (TextView) findViewById(R.id.pass);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "Cabin.ttf");
        login.setTypeface(typeface);
        user.setTypeface(typeface);
        pass.setTypeface(typeface);
        boolean cancel = false;
        View focusView = null;
        final ImageView imageView_logo = (ImageView) findViewById(R.id.imageView_logo);
        imageView_logo.setBackgroundResource(R.drawable.splash_anim);
        final AnimationDrawable splashAnimation = (AnimationDrawable) imageView_logo.getBackground();

        splashAnimation.start();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                splashAnimation.stop();
                rellay1.setVisibility(View.VISIBLE);
                imageView_logo.setVisibility(View.GONE);
            }
        };
        handler.postDelayed(runnable, 2000);
        Button btn = (Button)findViewById(R.id.createUser);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginScreen.this, RegisterUser.class));
            }
        });
    }



}
