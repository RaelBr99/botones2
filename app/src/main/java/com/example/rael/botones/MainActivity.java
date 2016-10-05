package com.example.rael.botones;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer broma;
    MediaPlayer batmansong;
    MediaPlayer claxon;
    MediaPlayer imbatman;
    MediaPlayer tortuga;
    MediaPlayer utfl;

    Button but1;
    Button but2;
    Button but3;
    Button but4;
    Button but5;
    Button but6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     broma = MediaPlayer . create(this,R.raw.broma);
        batmansong = MediaPlayer . create(this,R.raw.batmansong);
        claxon = MediaPlayer . create(this,R.raw.claxon);
        imbatman = MediaPlayer . create(this,R.raw.imbatman);
        tortuga = MediaPlayer . create(this,R.raw.tortuga);
        utfl = MediaPlayer . create(this,R.raw.utfl);

    but1 = (Button) findViewById(R.id.button1);
        but2 = (Button) findViewById(R.id.button2);
        but3 = (Button) findViewById(R.id.button3);
        but4 = (Button) findViewById(R.id.button4);
        but5 = (Button) findViewById(R.id.button5);
        but6 = (Button) findViewById(R.id.button6);

    but1.setOnClickListener(new View.OnClickListener(){
        @Override
        public void  onClick(View view) {
        broma.start();
        }
    });
        but2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view) {
                batmansong.start();
            }
        });
        but3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view) {
                claxon.start();
            }
        });
        but4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view) {
                tortuga.start();
            }
        });
        but5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view) {
                utfl.start();
            }
        });
        but6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view) {
                if(broma.isPlaying())
                {
                    broma.start();
                    else{
                    broma.pause();
                }
                }
            }
        });

    }
}
