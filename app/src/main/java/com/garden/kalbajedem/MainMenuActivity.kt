package com.garden.kalbajedem

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton


class MainMenuActivity: AppCompatActivity()     {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu_activity)
        findViewById<MaterialButton>(R.id.gameButton).setOnClickListener{
            startActivity(Intent(this, NikdyJsemGameActivity::class.java))
        }

        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                    WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }


    }

    fun showToast(view: View) {
        Toast.makeText(this,"GAME NOT AVAILABLE! WORK IN PROCESS", Toast.LENGTH_LONG).show();
    }

}