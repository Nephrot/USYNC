package com.example.qadada.usync;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


import com.facebook.shimmer.ShimmerFrameLayout;

public class JoinUsync extends SwipeGestureDetector implements Animation.AnimationListener {

    ImageView header;
    Animation animFadeIn;
    private GestureDetector gestureDetector;
    View.OnTouchListener gestureListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_usync);
        header = (ImageView) findViewById(R.id.background);
        // load the animation
        animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_in);

        // set animation listener
        animFadeIn.setAnimationListener(this);
        header.setVisibility(View.VISIBLE);
        header.startAnimation(animFadeIn);
        ShimmerFrameLayout container =
                (ShimmerFrameLayout) findViewById(R.id.shimmer_view_container);
        container.startShimmer();


    }

    @Override
    protected void onSwipeLeft() {
        startActivity(new Intent(JoinUsync.this, PersonalInfo.class));
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    @Override
    public void onAnimationEnd(Animation animation) {
    }

    @Override
    public void onAnimationRepeat(Animation animation) {
        // TODO Auto-generated method stub

    }


    @Override
    public void onAnimationStart(Animation animation) {
        // TODO Auto-generated method stub

    }



}
