package com.example.qadada.usync;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.widget.DatePicker;
import android.widget.TextView;
import com.example.qadada.usync.LoginScreen;


public class PersonalInfo extends AppCompatActivity implements Animation.AnimationListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
        TextView user = (TextView) findViewById(R.id.pi);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "Cabin.ttf");
        user.setTypeface(typeface);
        DatePicker simpleDatePicker = (DatePicker) findViewById(R.id.simpleDatePicker); // initiate a date picker4
        simpleDatePicker.updateDate(2000, 10, 6);
        simpleDatePicker.setSpinnersShown(true);
        simpleDatePicker.setCalendarViewShown(false);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}

