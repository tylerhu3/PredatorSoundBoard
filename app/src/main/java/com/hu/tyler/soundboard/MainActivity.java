package com.hu.tyler.soundboard;
/*
* This is a simple soundboard of consisting of some famous lines from the 1987 Predator Movie
* It's mainly a test project to get use to using sounds. From my youtube research MediaPlayer seeems
* to be the easiest way to play sounds or movies, so I'm going with that MediaPlayer but another
* option is SoundPool but I heard it crashed on some devices running 4.4, namely LG and some Xperia
* so MediaPlayer does seem idea.
*
* The implementation for this project is quite simple, create buttons for each sound and have each
* button be set on a Click Listener and then goes to the onClickMethod to execute a sound play.
* Each sound has it's own media player, I contemplated have a single MediaPlayer and then creating
* an instance each time a onClick occurs but because there isn't too many sounds for this project,
* I left it with just 8 MediaPlayers, perhaps more in the future. */

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends FragmentActivity implements View.OnClickListener {

    //The below is probably bad programming practice, in the future I'll go with just making one
    //MediaPlayer and reuse it over and over, because it seems to be a waste of RAM rn.
    MediaPlayer predator = null;
    MediaPlayer sob = null;
    MediaPlayer faggots = null;
    MediaPlayer choppa = null;
    MediaPlayer ugly = null;
    MediaPlayer notime = null;
    MediaPlayer killit = null;
    MediaPlayer cia = null;
    MediaPlayer pLaugh = null;
    MediaPlayer howling = null;
    MediaPlayer vision = null;
    MediaPlayer predRepeat = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set a reference to each button.
        Button pButton = findViewById(R.id.predButton);
        Button sobButton = findViewById(R.id.sobButton);
        Button fagButton = findViewById(R.id.faggotsButton);
        Button choppaButton = findViewById(R.id.choppaButton);
        Button uglyButton = findViewById(R.id.uglyButton);
        Button notimeButton = findViewById(R.id.nobleedsbutton);
        Button killButton = findViewById(R.id.bleedButton);
        Button ciaButton = findViewById(R.id.ciaButton);
        Button pLaughButton = findViewById(R.id.predatorLaughButton);
        Button predatorHowl = findViewById(R.id.predatorHowlingButton);
        Button predatorVisionButton = findViewById(R.id.predatorVisionButton);
        Button predRepeatButton = findViewById(R.id.predXButton);

        //Set a click listener to all the buttons
        predRepeatButton.setOnClickListener(this);
        predatorVisionButton.setOnClickListener(this);
        predatorHowl.setOnClickListener(this);
        pLaughButton.setOnClickListener(this);
        ciaButton.setOnClickListener(this);
        pButton.setOnClickListener(this);
        sobButton.setOnClickListener(this);
        fagButton.setOnClickListener(this);
        choppaButton.setOnClickListener(this);
        uglyButton.setOnClickListener(this);
        notimeButton.setOnClickListener(this);
        killButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.predButton:
                if(predator == null)
                    predator = MediaPlayer.create(this, R.raw.predator);
                if (predator.isPlaying())
                    predator.seekTo(0);
                predator.start();

                break;
            case R.id.sobButton:
                if(sob == null)
                    sob = MediaPlayer.create(this, R.raw.sob);
                if (sob.isPlaying())
                    sob.seekTo(0);
                sob.start();
                break;
            case R.id.faggotsButton:
                if(faggots == null)
                    faggots = MediaPlayer.create(this, R.raw.faggots);
                if (faggots.isPlaying())
                    faggots.seekTo(0);
                faggots.start();
                break;
            case R.id.choppaButton:
                if(choppa == null)
                    choppa = MediaPlayer.create(this, R.raw.gettochoppa);
                if (choppa.isPlaying())
                    choppa.seekTo(0);
                choppa.start();
                break;
            case R.id.uglyButton:
                if(ugly == null)
                    ugly = MediaPlayer.create(this, R.raw.ugly);
                if (ugly.isPlaying())
                    ugly.seekTo(0);
                ugly.start();
                break;
            case R.id.nobleedsbutton:
                if(notime == null)
                    notime = MediaPlayer.create(this, R.raw.notimetobleed);
                if (notime.isPlaying())
                    notime.seekTo(0);
                notime.start();
                break;
            case R.id.bleedButton:
                if(killit == null)
                    killit = MediaPlayer.create(this, R.raw.bleedskills);
                if (killit.isPlaying())
                    killit.seekTo(0);
                killit.start();
                break;
            case R.id.ciaButton:
                if(cia == null)
                    cia = MediaPlayer.create(this, R.raw.ciapencils);
                if (cia.isPlaying())
                    cia.seekTo(0);
                cia.start();
                break;
            case R.id.predatorLaughButton:
                if(pLaugh == null)
                    pLaugh = MediaPlayer.create(this, R.raw.predatorlaughing);
                if (pLaugh.isPlaying())
                    pLaugh.seekTo(0);
                pLaugh.start();
                break;
            case R.id.predatorHowlingButton:
                if(howling == null)
                    howling = MediaPlayer.create(this, R.raw.predatorhowling);
                if (howling.isPlaying())
                    howling.seekTo(0);
                howling.start();
                break;
            case R.id.predatorVisionButton:
                if(vision ==null)
                    vision = MediaPlayer.create(this, R.raw.predatorvision);
                if (vision.isPlaying())
                    vision.seekTo(0);
                vision.start();
                break;
            case R.id.predXButton:
                if(predRepeat == null)
                {
                    predRepeat = MediaPlayer.create(this,R.raw.predrepeat);
                    predRepeat.setLooping(true);
                }
                if(predRepeat.isPlaying())
                    predRepeat.pause();
                else
                    predRepeat.start();
                break;
        }
    }
}
