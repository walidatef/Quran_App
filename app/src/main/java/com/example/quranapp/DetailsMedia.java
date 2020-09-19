package com.example.quranapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailsMedia extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    private ImageView imagePlay;
    private int lastMedia;

    @Override
    public void onBackPressed() {
        super.onBackPressed();


        imagePlay.setImageResource(R.drawable.play);
        mediaPlayer.stop();


    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.details_media);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        TextView textView = (TextView) findViewById(R.id.title);


        ImageView imageView2 = (ImageView) findViewById(R.id.image_soura);
        imageView2.setImageResource(R.drawable.mosque);

        imagePlay = (ImageView) findViewById(R.id.play_media);


        textView.setText(getIntent().getStringExtra("SORA_NAME"));


        mediaPlayer = MediaPlayer.create(DetailsMedia.this, getIntent().getIntExtra("MEDIA_SOURA", 11));


        imagePlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (!mediaPlayer.isPlaying()) {

                    lastMedia = getIntent().getIntExtra("MEDIA_SOURA", 11);
                    imagePlay.setImageResource(R.drawable.ic_baseline_pause_24);
                    mediaPlayer.start();

                } else {

                    imagePlay.setImageResource(R.drawable.play);
                    mediaPlayer.pause();

                }

            }
        });


    }


}
