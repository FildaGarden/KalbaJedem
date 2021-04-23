package com.garden.kalbajedem

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowInsets
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.google.android.material.button.MaterialButton
import com.google.android.material.shape.MaterialShapeDrawable
import com.google.android.material.textview.MaterialTextView

class BeforeMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide();
        findViewById<ImageView>(R.id.splashLogo).animate().alpha(0.0f).setDuration(5000)

        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                    WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }

            Handler().postDelayed({
                val intent = Intent(this, MainMenuActivity::class.java)
                startActivity(intent);
                finish();

            }, 5000)




            }


    }

