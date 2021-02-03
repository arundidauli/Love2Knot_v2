package com.wingshield.technologies.love2knot_v2.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.wingshield.technologies.love2knot_v2.MainActivity;
import com.wingshield.technologies.love2knot_v2.R;
import com.wingshield.technologies.love2knot_v2.activities.AccountSettingActivity;
import com.wingshield.technologies.love2knot_v2.activities.ChatsListActivity;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecommendedFragment extends Fragment {
    private Context context;


    public RecommendedFragment() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recommended, container, false);
        context = getActivity();

        CircleImageView profile_circle = view.findViewById(R.id.profile_circle);
        ImageView chats = view.findViewById(R.id.chats);

        profile_circle.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), AccountSettingActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });
        chats.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ChatsListActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });

        view.findViewById(R.id.txt_recommended).setOnClickListener(v -> {
            //  ((SaveDetailsActivity)getActivity()).selectIndex(-1);
        });
        view.findViewById(R.id.txt_received).setOnClickListener(v -> {
            ((MainActivity) getActivity()).selectIndex(1);
        });


        /*ViewPager viewPager=view.findViewById(R.id.view_pager);
        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(context,images);
        viewPager.setAdapter(viewPagerAdapter);*/


        return view;

    }

}
