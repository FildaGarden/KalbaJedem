package com.garden.kalbajedem;


import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NikdyJsemGameActivity extends AppCompatActivity {


    private TextView mTextView;
    private Button mButton;
    private String modeSelected = "text.txt";

    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        setContentView(R.layout.nikdy_jsem_game_activity);


        mButton = (Button) findViewById(R.id.nextClickButton);
        mTextView = (TextView) findViewById(R.id.textView);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String> myDict = new ArrayList<String>();
                try {
                    InputStream is = getAssets().open(modeSelected);
                    BufferedReader r = new BufferedReader(new InputStreamReader(is));
                    String line;
                    while ((line=r.readLine()) != null) {
                        myDict.add(line);
                    }
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
                int index = (int) Math.floor(Math.random() * myDict.size());
                mTextView.setText(myDict.get(index));

            }
        });


    }
}
