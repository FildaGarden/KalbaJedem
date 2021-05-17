package com.garden.kalbajedem;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        setContentView(R.layout.splash_screen_activity);

        Animation fade = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        ImageView image = findViewById(R.id.splashLogo);
        image.setAnimation(fade);

        final Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(),MainMenuActivity.class);
                startActivity(intent);
                finish();
            }
        } , 5000);
    }
}