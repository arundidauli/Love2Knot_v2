package com.wingshield.technologies.love2knot_v2.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.wingshield.technologies.love2knot_v2.R;

/**
 * Created by Arun Kumar on 14/8/20.
 * Copyright (c) 2020 wingshieldtechnologies.com All rights reserved.
 */
public class BottomSheetMaritalStatus extends BottomSheetDialogFragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(STYLE_NORMAL, R.style.AppBottomSheetDialogSimpleTheme);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_marital_status, container, false);


        return view;
    }


}
