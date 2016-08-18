package leminhan.entertainment;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import leminhan.entertainment.fragment.KenhGiaiTriTongHopFragment;
import leminhan.entertainment.fragment.KenhPhimTruyenFragment;
import leminhan.entertainment.fragment.KenhPhoBienFragment;
import leminhan.entertainment.fragment.KenhTheThaoFragment;
import leminhan.entertainment.fragment.KenhThieuNhiFragment;
import leminhan.entertainment.fragment.TruyenHinhQuocTeFragment;

public class PhimActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_tv);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Phim");
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it_back = new Intent(PhimActivity.this, MovieActivity.class);
                startActivity(it_back);
            }
        });

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new TruyenHinhQuocTeFragment(), "PHIM LẺ");
        adapter.addFragment(new KenhPhoBienFragment(), "PHIM BỘ HOT");
        adapter.addFragment(new KenhTheThaoFragment(), "PHIM BỘ VIỆT NAM");
        adapter.addFragment(new KenhPhimTruyenFragment(), "PHIM BỘ HÀN QUỐC");
        adapter.addFragment(new KenhGiaiTriTongHopFragment(), "PHIM BỘ HOA NGỮ");
        adapter.addFragment(new KenhThieuNhiFragment(), "QUỐC GIA KHÁC");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
