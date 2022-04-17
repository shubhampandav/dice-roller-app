package com.shubhampandav.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.btn);
        var diceimg = findViewById<ImageView>(R.id.diceimg);

        btn.setOnClickListener {

            var rnumber = (1..6).random();
            var diceimages =
                when(rnumber)
                {
                    1-> R.drawable.dice1;
                    2-> R.drawable.dice2;
                    3-> R.drawable.dice3;
                    4->R.drawable.dice4;
                    5->R.drawable.dice5;

                    else -> {R.drawable.dice6}
                }
            diceimg.setImageResource(diceimages);
        }

    }
}

