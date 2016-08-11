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

import leminhan.entertainment.fragment.KenhDiaPhuongFragment;
import leminhan.entertainment.fragment.KenhGiaiTriTongHopFragment;
import leminhan.entertainment.fragment.KenhKhoaGiaoFragment;
import leminhan.entertainment.fragment.KenhPhimTruyenFragment;
import leminhan.entertainment.fragment.KenhPhoBienFragment;
import leminhan.entertainment.fragment.KenhTheThaoFragment;
import leminhan.entertainment.fragment.KenhThieuNhiFragment;
import leminhan.entertainment.fragment.KenhTinTucFragment;
import leminhan.entertainment.fragment.NhomKenhKhacFragment;
import leminhan.entertainment.fragment.TruyenHinhQuocTeFragment;

public class TheThaoActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_tv);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Thể Thao");
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it_back = new Intent(TheThaoActivity.this, MovieActivity.class);
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

        adapter.addFragment(new TruyenHinhQuocTeFragment(), "BÓNG ĐÁ QUỐC TẾ");
        adapter.addFragment(new KenhPhoBienFragment(), "BÓNG ĐÁ VIỆT NAM");
        adapter.addFragment(new KenhTheThaoFragment(), "ĐỐI KHÁNG");
        adapter.addFragment(new KenhPhimTruyenFragment(), "QUẦN VỢT");
        adapter.addFragment(new KenhGiaiTriTongHopFragment(), "TỐC ĐỘ");
        adapter.addFragment(new KenhThieuNhiFragment(), "CÁC MÔN THỂ THAO KHÁC");
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
