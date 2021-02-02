package com.wingshield.technologies.love2knot_v2.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.wingshield.technologies.love2knot_v2.MainActivity;
import com.wingshield.technologies.love2knot_v2.R;
import com.wingshield.technologies.love2knot_v2.activities.SaveDetailsActivity;
import com.wingshield.technologies.love2knot_v2.adapter.ViewPagerAdapter;

public class LoginFragment extends Fragment {
    private Context context;
    private ViewPagerAdapter viewPagerAdapter;


    public LoginFragment() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        context=getActivity();

        Button btn_continue=view.findViewById(R.id.btn_continue);
        viewPagerAdapter=new ViewPagerAdapter(getFragmentManager());
        btn_continue.setOnClickListener(v -> {
            ((SaveDetailsActivity)getActivity()).selectIndex(1);

        });


        return view;

    }

}
