package com.example.tablayoutdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    private int[] imgs=new int[]{
            R.drawable.pic_11,
            R.drawable.pic_12,
            R.drawable.pic_11
    };

    private String[] tabs=new String[]{
      "Tab 1",
      "Tab 2",
      "Tab 3",
    };


    private List<ImgFragment> imgFragments=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=findViewById(R.id.tabLayout);
        viewPager=findViewById(R.id.viewpager);

        for (int i = 0; i < imgs.length; i++) {
            imgFragments.add(ImgFragment.newInstance(imgs[i]));
        }

        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int i) {
                return imgFragments.get(i);
            }

            @Override
            public int getCount() {
                return imgFragments.size();
            }

//            @Nullable
//            @Override
//            public CharSequence getPageTitle(int position) {
//                return tabs[position];
//            }
        });

        tabLayout.setupWithViewPager(viewPager);

        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            TabLayout.Tab tab=tabLayout.getTabAt(i);
            tab.setText(tabs[i]);
            tab.setIcon(imgs[i]);
        }

    }


}
