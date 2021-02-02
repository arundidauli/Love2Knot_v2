package com.wingshield.technologies.love2knot_v2.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.wingshield.technologies.love2knot_v2.MainActivity;
import com.wingshield.technologies.love2knot_v2.R;
import com.wingshield.technologies.love2knot_v2.activities.SaveDetailsActivity;

public class AddPhotosFragment extends Fragment {
    private Context context;


    public AddPhotosFragment() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_photos, container, false);
        context=getActivity();

        /*ViewPager viewPager=view.findViewById(R.id.view_pager);
        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(context,images);
        viewPager.setAdapter(viewPagerAdapter);*/


        Button btn_continue=view.findViewById(R.id.btn_continue);

        btn_continue.setOnClickListener(v -> {
            ((SaveDetailsActivity)getActivity()).selectIndex(1);
        });
        ImageView back_arrow=view.findViewById(R.id.back_arrow);
        back_arrow.setOnClickListener(v -> {
            ((SaveDetailsActivity)getActivity()).selectIndex(-1);

        });

        return view;

    }
}
