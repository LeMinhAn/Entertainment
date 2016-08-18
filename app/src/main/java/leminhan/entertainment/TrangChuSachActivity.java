package leminhan.entertainment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.HashMap;

import it.sephiroth.android.library.widget.AdapterView;
import it.sephiroth.android.library.widget.HListView;
import leminhan.entertainment.adapter.NoiBatAdapter;
import leminhan.entertainment.adapter.SachMoiAdapter;
import leminhan.entertainment.slider.Animations.DescriptionAnimation;
import leminhan.entertainment.slider.SliderLayout;
import leminhan.entertainment.slider.SliderTypes.BaseSliderView;
import leminhan.entertainment.slider.SliderTypes.TextSliderView;
import leminhan.entertainment.slider.Tricks.ViewPagerEx;

public class TrangChuSachActivity extends AppCompatActivity implements BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {
    private SliderLayout mDemoSlider;
    private Toolbar toolbar;
    private HListView hlv_sachmoi, hlv_khuyendoc, hlv_vanhocnuocngoai, hlv_vanhoctrongnuoc;
    public static String[] prgmNameList = {"Let Us C", "c++", "JAVA", "Jsp", "Microsoft .Net", "Android", "PHP", "Jquery", "JavaScript"};
    public static int[] prgmImages = {R.drawable.background_test1, R.drawable.background_test2, R.drawable.background_test9, R.drawable.background_test3, R.drawable.background_test4, R.drawable.background_test5, R.drawable.background_test6, R.drawable.background_test7, R.drawable.background_test8};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu_sach);
        mDemoSlider = (SliderLayout) findViewById(R.id.slider);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Trang Chủ");
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it_back = new Intent(TrangChuSachActivity.this, MovieActivity.class);
                startActivity(it_back);
            }
        });

        HashMap<String, String> url_maps = new HashMap<String, String>();
        url_maps.put("Hannibal", "http://static2.hypable.com/wp-content/uploads/2013/12/hannibal-season-2-release-date.jpg");
        url_maps.put("Big Bang Theory", "http://tvfiles.alphacoders.com/100/hdclearart-10.png");
        url_maps.put("House of Cards", "http://cdn3.nflximg.net/images/3093/2043093.jpg");
        url_maps.put("Game of Thrones", "http://images.boomsbeat.com/data/images/full/19640/game-of-thrones-season-4-jpg.jpg");

        HashMap<String, Integer> file_maps = new HashMap<String, Integer>();
        file_maps.put("Hannibal", R.drawable.hannibal);
        file_maps.put("Big Bang Theory", R.drawable.bigbang);
        file_maps.put("House of Cards", R.drawable.house);
        file_maps.put("Game of Thrones", R.drawable.game_of_thrones);

        for (String name : file_maps.keySet()) {
            TextSliderView textSliderView = new TextSliderView(this);
            // initialize a SliderLayout
            textSliderView
                    .description(name)
                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);

            //add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra", name);

            mDemoSlider.addSlider(textSliderView);
        }
        mDemoSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        mDemoSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        mDemoSlider.setCustomAnimation(new DescriptionAnimation());
        mDemoSlider.setDuration(4000);
        mDemoSlider.addOnPageChangeListener(this);

        hlv_sachmoi = (HListView) findViewById(R.id.hlv_sachmoi);
        hlv_khuyendoc = (HListView) findViewById(R.id.hlv_khuyendoc);
        hlv_vanhocnuocngoai = (HListView) findViewById(R.id.hlv_vanhocnuocngoai);
        hlv_vanhoctrongnuoc = (HListView) findViewById(R.id.hlv_vanhoctrongnuoc);
        hlv_sachmoi.setAdapter(new SachMoiAdapter(this, prgmNameList, prgmImages));
        hlv_khuyendoc.setAdapter(new SachMoiAdapter(this, prgmNameList, prgmImages));
        hlv_vanhocnuocngoai.setAdapter(new SachMoiAdapter(this, prgmNameList, prgmImages));
        hlv_vanhoctrongnuoc.setAdapter(new SachMoiAdapter(this, prgmNameList, prgmImages));
        hlv_sachmoi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it_sachmoi = new Intent(TrangChuSachActivity.this, DetailsSachActivity.class);
                startActivity(it_sachmoi);
            }
        });
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onSliderClick(BaseSliderView slider) {

    }
}
