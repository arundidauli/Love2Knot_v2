package com.wingshield.technologies.love2knot_v2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.wingshield.technologies.love2knot_v2.adapter.ViewPagerAdapter;
import com.wingshield.technologies.love2knot_v2.fragment.ReceivedFragment;
import com.wingshield.technologies.love2knot_v2.fragment.RecommendedFragment;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewpager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new RecommendedFragment());
        adapter.addFragment(new ReceivedFragment());

        viewPager.setAdapter(adapter);
    }
    public void selectIndex(int i) {
        viewPager.setCurrentItem(viewPager.getCurrentItem() + i, true);
    }
}