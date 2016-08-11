package leminhan.entertainment;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import leminhan.entertainment.fragment.AlbumFragment;
import leminhan.entertainment.fragment.BaiHatFragment;
import leminhan.entertainment.fragment.DanhMucFragment;
import leminhan.entertainment.fragment.NgheSiFragment;
import leminhan.entertainment.fragment.NoiBatFragment;
import leminhan.entertainment.fragment.PlayListFragment;
import leminhan.entertainment.fragment.TopCaiDatFragment;
import leminhan.entertainment.fragment.YeuThichFragment;

public class NhacOnlineActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private SearchView mSearchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhac_online);
        toolbar = (Toolbar) findViewById(R.id.toolbar_online);
        toolbar.setTitle("Nhạc Online");
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it_back = new Intent(NhacOnlineActivity.this, MusicActivity.class);
                startActivity(it_back);
            }
        });

        viewPager = (ViewPager) findViewById(R.id.viewpager_online);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs_online);
        tabLayout.setupWithViewPager(viewPager);

        mSearchView = (SearchView) findViewById(R.id.mySearchView);
        mSearchView.setLayoutParams(new Toolbar.LayoutParams(Gravity.RIGHT));
        mSearchView.setQueryHint("Search...");

        //*** setOnQueryTextFocusChangeListener ***
        mSearchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                // TODO Auto-generated method stub

            }
        });

        //*** setOnQueryTextListener ***
        mSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {
                // TODO Auto-generated method stub

                startActivity(new Intent(getApplicationContext(), SearchResultActivity.class));

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // TODO Auto-generated method stub

                return false;
            }
        });
    }
    private void setupViewPager(ViewPager viewPager) {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new DanhMucFragment(), "DANH MỤC");
        adapter.addFragment(new NoiBatFragment(), "NỔI BẬT");
        adapter.addFragment(new TopCaiDatFragment(), "TOP CÀI ĐẶT");
        adapter.addFragment(new YeuThichFragment(), "YÊU THÍCH");
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
