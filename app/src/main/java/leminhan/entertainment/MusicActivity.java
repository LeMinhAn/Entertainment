package leminhan.entertainment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class MusicActivity extends AppCompatActivity {
    RelativeLayout rl_baihat, rl_album, rl_nghesi, rl_playlist, rl_danhmuc, rl_noibat, rl_top, rl_yeuthich;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate the mainLayout
        setContentView(R.layout.activity_music);
        initView();
        initAction();

    }

    private void initView() {
        rl_baihat = (RelativeLayout) findViewById(R.id.rl_baihat);
        rl_album = (RelativeLayout) findViewById(R.id.rl_album);
        rl_nghesi = (RelativeLayout) findViewById(R.id.rl_nghesi);
        rl_playlist = (RelativeLayout) findViewById(R.id.rl_playlist);
        rl_danhmuc = (RelativeLayout) findViewById(R.id.rl_danhmuc);
        rl_noibat = (RelativeLayout) findViewById(R.id.rl_noibat);
        rl_top = (RelativeLayout) findViewById(R.id.rl_top);
        rl_yeuthich = (RelativeLayout) findViewById(R.id.rl_yeuthich);
    }

    private void initAction() {
        rl_baihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it_baihat = new Intent(MusicActivity.this, NhacOfflineActivity.class);
                startActivity(it_baihat);
            }
        });
        rl_album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it_album = new Intent(MusicActivity.this, NhacOfflineActivity.class);
                startActivity(it_album);
            }
        });
        rl_playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it_playlist = new Intent(MusicActivity.this, NhacOfflineActivity.class);
                startActivity(it_playlist);
            }
        });
        rl_nghesi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it_nghesi = new Intent(MusicActivity.this, NhacOfflineActivity.class);
                startActivity(it_nghesi);
            }
        });
        rl_danhmuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it_danhmuc = new Intent(MusicActivity.this, NhacOnlineActivity.class);
                startActivity(it_danhmuc);
            }
        });
        rl_noibat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it_noibat = new Intent(MusicActivity.this, NhacOnlineActivity.class);
                startActivity(it_noibat);
            }
        });
        rl_top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it_top = new Intent(MusicActivity.this, NhacOnlineActivity.class);
                startActivity(it_top);
            }
        });
        rl_yeuthich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it_yeuthich = new Intent(MusicActivity.this, NhacOnlineActivity.class);
                startActivity(it_yeuthich);
            }
        });
    }

}
