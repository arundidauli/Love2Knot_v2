package com.wingshield.technologies.love2knot_v2.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.wingshield.technologies.love2knot_v2.R;
import com.wingshield.technologies.love2knot_v2.fragment.BottomSheetMaritalStatus;

public class PreferenceActivity extends AppCompatActivity {
    private static final String TAG = EditProfileActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preference);

        findViewById(R.id.card_edit1).setOnClickListener(v -> {
            BottomSheetMaritalStatus bottomSheetMaritalStatus = new BottomSheetMaritalStatus();
            bottomSheetMaritalStatus.setCancelable(true);
            bottomSheetMaritalStatus.show(getSupportFragmentManager(), TAG);
        });
    }
}