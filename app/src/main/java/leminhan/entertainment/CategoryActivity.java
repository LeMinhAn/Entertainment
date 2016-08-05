package leminhan.entertainment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class CategoryActivity extends AppCompatActivity {
    private ImageView iv_back, iv_edit, iv_logout, iv_music, iv_movie, iv_book, iv_game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        initView();
        intAction();
    }

    private void initView() {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }
        changeStatusBarColor();
        iv_back = (ImageView) findViewById(R.id.iv_back);
        iv_edit = (ImageView) findViewById(R.id.iv_edit);
        iv_logout = (ImageView) findViewById(R.id.iv_logout);
        iv_music = (ImageView) findViewById(R.id.iv_music);
        iv_movie = (ImageView) findViewById(R.id.iv_movie);
        iv_book = (ImageView) findViewById(R.id.iv_book);
        iv_game = (ImageView) findViewById(R.id.iv_game);

    }

    private void intAction() {
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        iv_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        iv_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        iv_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, MusicActivity.class);
                startActivity(intent);
            }
        });
        iv_movie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, MovieActivity.class);
                startActivity(intent);
            }
        });
        iv_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, BookActivity.class);
                startActivity(intent);
            }
        });
        iv_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, GameActivity.class);
                startActivity(intent);
            }
        });

    }

    private void changeStatusBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }
    }
}
