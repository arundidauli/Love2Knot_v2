package com.wingshield.technologies.love2knot_v2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.wingshield.technologies.love2knot_v2.adapter.ViewPagerAdapter;
import com.wingshield.technologies.love2knot_v2.fragment.AddPhotosFragment;
import com.wingshield.technologies.love2knot_v2.fragment.BirthdayFragment;
import com.wingshield.technologies.love2knot_v2.fragment.EmailFragment;
import com.wingshield.technologies.love2knot_v2.fragment.FirstAndLastNameFragment;
import com.wingshield.technologies.love2knot_v2.fragment.GenderFragment;
import com.wingshield.technologies.love2knot_v2.fragment.GetOTPFragment;
import com.wingshield.technologies.love2knot_v2.fragment.LoginFragment;
import com.wingshield.technologies.love2knot_v2.fragment.ProfilePictureInfoFragment;
import com.wingshield.technologies.love2knot_v2.fragment.ProfileViewFragment;
import com.wingshield.technologies.love2knot_v2.fragment.VerifyMeFragment;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewpager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new ProfileViewFragment());

        viewPager.setAdapter(adapter);
    }
    public void selectIndex(int i) {
        viewPager.setCurrentItem(viewPager.getCurrentItem() + i, true);
    }
}