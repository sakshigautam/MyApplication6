package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollButton=findViewById()< Button >(R.id.rollButton);
        val resultsTextView=findViewById<TextView>(R.id.resultsTextView);
        val seekBar=findViewById< SeekBar >(R.id.seekBar2);

        rollButton.setOnClickListener() {
            val rand = Random().nextInt(seekBar.progress)
            resultsTextView.text = rand.toString()

        }

    }
}
