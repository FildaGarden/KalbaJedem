package com.garden.kalbajedem;


import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Collections;

public class NikdyJsemGameActivity extends AppCompatActivity {

    private ImageView mImageView;
    private TextView mTextView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            //Fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
            //Start aktivity
        setContentView(R.layout.nikdy_jsem_game_activity);

            //Vyjádření xml elementů pomocí proměnné
        mImageView = (ImageView)findViewById(R.id.imageView);
        mTextView = (TextView)findViewById(R.id.textView);
            //Zavolání funkce na zobrazení nové karty a textu
        showRandomCard();
            //Onclick event karty pro změnu pozadí/karty
        mImageView.setOnClickListener(view -> showRandomCard());
    }
            //Metoda na zobrázení pozadí/karty
        public void showRandomCard() {
        shuffleCards();
        mImageView.setImageResource(cardsArray[0].getmImage());
        mTextView.setText(linesArray[0].getmText());
        }

        //Vytvoření pozadí
    Cards c01 = new Cards(R.drawable.one);
    Cards c02 = new Cards(R.drawable.two);
    Cards c03 = new Cards(R.drawable.three);
    Cards c04 = new Cards(R.drawable.four);
    Cards c05 = new Cards(R.drawable.five);
        //List všech pozadí
    Cards [] cardsArray = new Cards[] {
            c01, c02, c03, c04, c05
    };
        //Vytvoření textu
    Lines l01 = new Lines(R.string.line01);
    Lines l02 = new Lines(R.string.line02);
        //List všech textů
    Lines [] linesArray = new Lines[] {
            l01, l02
    };
        //Metoda na zamíchaní listů
    public void shuffleCards() {
        Collections.shuffle(Arrays.asList(cardsArray));
        Collections.shuffle(Arrays.asList(linesArray));

    }

}