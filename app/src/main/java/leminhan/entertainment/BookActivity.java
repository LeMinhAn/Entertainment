package leminhan.entertainment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;

public class BookActivity extends AppCompatActivity {
    RelativeLayout rl_trangchu, rl_thuvien, rl_viettruyen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        initView();
        initAction();
    }


    private void initView() {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }
        changeStatusBarColor();
        rl_trangchu = (RelativeLayout) findViewById(R.id.rl_trangchu);
        rl_thuvien = (RelativeLayout) findViewById(R.id.rl_thuvien);
        rl_viettruyen = (RelativeLayout) findViewById(R.id.rl_viettruyen);
    }

    private void initAction() {
        rl_trangchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it_trangchu = new Intent(BookActivity.this, TrangChuSachActivity.class);
                startActivity(it_trangchu);
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
