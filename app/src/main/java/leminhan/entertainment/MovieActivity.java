package leminhan.entertainment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class MovieActivity extends AppCompatActivity {
    RelativeLayout rl_trangchu, rl_livetv, rl_thethao, rl_phim, rl_tv_show, rl_thieunhi, rl_radio, rl_tonghop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        initView();
        initAction();
    }

    private void initView() {
        rl_trangchu = (RelativeLayout) findViewById(R.id.rl_trangchu);
        rl_livetv = (RelativeLayout) findViewById(R.id.rl_livetv);
        rl_thethao = (RelativeLayout) findViewById(R.id.rl_thethao);
        rl_phim = (RelativeLayout) findViewById(R.id.rl_phim);
        rl_tv_show = (RelativeLayout) findViewById(R.id.rl_tvshow);
        rl_thieunhi = (RelativeLayout) findViewById(R.id.rl_thieunhi);
        rl_radio = (RelativeLayout) findViewById(R.id.rl_radio);
        rl_tonghop = (RelativeLayout) findViewById(R.id.rl_tonghop);

    }

    private void initAction() {
        rl_trangchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it_trangchu = new Intent(MovieActivity.this, TrangChuActivity.class);
                startActivity(it_trangchu);
            }
        });
        rl_livetv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it_livetv = new Intent(MovieActivity.this, LiveTVActivity.class);
                startActivity(it_livetv);
            }
        });
        rl_thethao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it_thethao = new Intent(MovieActivity.this, TheThaoActivity.class);
                startActivity(it_thethao);
            }
        });
        rl_phim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it_phim = new Intent(MovieActivity.this, TrangChuActivity.class);
                startActivity(it_phim);
            }
        });
        rl_tv_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it_tv_show = new Intent(MovieActivity.this, TrangChuActivity.class);
                startActivity(it_tv_show);
            }
        });
        rl_thieunhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it_thieunhi = new Intent(MovieActivity.this, TrangChuActivity.class);
                startActivity(it_thieunhi);
            }
        });
        rl_radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it_radio = new Intent(MovieActivity.this, TrangChuActivity.class);
                startActivity(it_radio);
            }
        });
        rl_tonghop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it_tonghop = new Intent(MovieActivity.this, TrangChuActivity.class);
                startActivity(it_tonghop);
            }
        });
    }


}
