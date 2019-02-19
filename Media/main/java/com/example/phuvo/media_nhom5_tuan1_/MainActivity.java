package com.example.phuvo.media_nhom5_tuan1_;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    ImageButton imvPlay, imvPause, imvStop, imvNext, imvPrev;
    int numberAudio, length;
    boolean isPause = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this, R.raw.b1);
        numberAudio = 1;
        imvNext = (ImageButton) findViewById(R.id.btnNext);
        imvPrev = (ImageButton) findViewById(R.id.btnPre);
        imvStop = (ImageButton) findViewById(R.id.btnStop);
        imvPause = (ImageButton) findViewById(R.id.btnPause);
        imvPlay = (ImageButton) findViewById(R.id.btnPlay);

        imvPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic();
                if (isPause != true) {
                    imvPlay.setVisibility(view.GONE);
                    imvPause.setVisibility(view.VISIBLE);
                }
            }
        });
//
        imvPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Tạm dừng mediaplayer
                mediaPlayer.pause();
                //Lấy ra thời gian tạm dừng
                length = mediaPlayer.getCurrentPosition();
                //set biến tạm dừng là "true"
                isPause = true;
                imvPlay.setVisibility(view.VISIBLE);
                imvPause.setVisibility(view.GONE);
                //Thông báo
                Toast.makeText(MainActivity.this, "Pausing", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void playMusic() {
        //Hàm Play
        if (isPause) {//Nếu media đang pause thì
            //set biến playing = false
            isPause = false;
            //Nhảy đến vị trí tạm dừng
            mediaPlayer.seekTo(length);
            //Play lại
            mediaPlayer.start();
            //Thông báo
            Toast.makeText(MainActivity.this, "Resume", Toast.LENGTH_SHORT).show();
        } else {//Nếu hàm không phải đang tạm dừng
            if (mediaPlayer.isPlaying()) {//Nếu media là đang chạy
                //thông báo là đang chạy
                Toast.makeText(MainActivity.this, "isPlaying", Toast.LENGTH_SHORT).show();
            } else { //nếu media không phải đang tạm dừng
                //Giải phóng

                mediaPlayer.start();
                //thông báo
                Toast.makeText(MainActivity.this, "Playing", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
