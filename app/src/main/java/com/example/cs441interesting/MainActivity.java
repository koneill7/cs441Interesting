package com.example.cs441interesting;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    Button wh1;
    Button wh2;
    Button wh3;
    Button wh4;
    Button wh5;
    Button bl1;
    Button bl2;
    Button bl3;
    Button record;
    Button play;
    Button reset;
    boolean rec = false;

    ArrayList<MediaPlayer> song = new ArrayList<MediaPlayer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wh1 = (Button)findViewById(R.id.wh1);
        wh2 = (Button)findViewById(R.id.wh2);
        wh3 = (Button)findViewById(R.id.wh3);
        wh4 = (Button)findViewById(R.id.wh4);
        wh5 = (Button)findViewById(R.id.wh5);
        bl1 = (Button)findViewById(R.id.bl1);
        bl2 = (Button)findViewById(R.id.bl2);
        bl3 = (Button)findViewById(R.id.bl3);
        record = (Button)findViewById(R.id.record);
        play = (Button)findViewById(R.id.play);
        reset = (Button)findViewById(R.id.play);
        final MediaPlayer media = MediaPlayer.create(this, R.raw.c4);
        final MediaPlayer media2 = MediaPlayer.create(this, R.raw.d4);
        final MediaPlayer media3 = MediaPlayer.create(this, R.raw.e4);
        final MediaPlayer media4 = MediaPlayer.create(this, R.raw.f4);
        final MediaPlayer media5 = MediaPlayer.create(this, R.raw.g4);
        final MediaPlayer media6 = MediaPlayer.create(this, R.raw.cs4);
        final MediaPlayer media7 = MediaPlayer.create(this, R.raw.ds4);
        final MediaPlayer media8 = MediaPlayer.create(this, R.raw.fs4);
        record.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                rec = true;
            }
        });
        play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                for(int i =0; i < song.size(); i++){
                    song.get(i).start();
                    try {
                        TimeUnit.MILLISECONDS.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        wh1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                media.start();
                if(rec) song.add(media);
            }
        });
        wh2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                media2.start();
                if(rec) song.add(media2);
            }
        });
        wh3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                media3.start();
                if(rec) song.add(media3);
            }
        });
        wh4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                media4.start();
                if(rec) song.add(media4);
            }
        });
        wh5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                media5.start();
                if(rec) song.add(media5);
            }
        });
        bl1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                media6.start();
                if(rec) song.add(media6);
            }
        });
        bl2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                media7.start();
                if(rec) song.add(media7);
            }
        });
        bl3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                media8.start();
                if(rec) song.add(media8);
            }
        });
    }

}