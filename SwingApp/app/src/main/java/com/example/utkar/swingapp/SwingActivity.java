package com.example.utkar.swingapp;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class SwingActivity extends AppCompatActivity {
    private static final int FLIP_DURATION = 2500;
    private ViewFlipper viewFlipper;
    private boolean isSlideshowOn = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swing);

        ActionBar actionBar = getSupportActionBar();
        if(null != actionBar){
            actionBar.hide();
        }
        viewFlipper = (ViewFlipper)findViewById(R.id.image_view_flipper);
        viewFlipper.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_in));
        viewFlipper.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_out));





    }

    @Override
    protected void onStart() {
        super.onStart();
        if(isSlideshowOn){

        }else{
            isSlideshowOn = true;
        }
        if(isSlideshowOn){
            startSlideshow();
            animateSlideshow();
        }else{
            stopSlideshow();
        }
    }

    private void startSlideshow(){
        if(!viewFlipper.isFlipping()){
            viewFlipper.setAutoStart(true);
            viewFlipper.setFlipInterval(FLIP_DURATION);
            viewFlipper.startFlipping();
        }
    }
    private void animateSlideshow() {
        viewFlipper.getInAnimation().setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
    }

    private void stopSlideshow(){
        if(viewFlipper.isFlipping()){
            viewFlipper.stopFlipping();
        }
    }





    public void gogo(View view) {
        Intent i = new Intent(getApplicationContext(),StartAppActivity.class);
        startActivity(i);
    }

    public void onClickok(View view) {
        Intent i = new Intent(getApplicationContext(),StartAppActivity.class);
        startActivity(i);
    }
}
