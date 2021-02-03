package com.wingshield.technologies.love2knot_v2.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.wingshield.technologies.love2knot_v2.R;

public class AccountSettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_setting);

        findViewById(R.id.img_plus).setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), EditProfileActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });
        findViewById(R.id.card_upgrade_plan).setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), UpgradePlanActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });
        findViewById(R.id.card_safety_center).setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), SafetyCenterActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });
        findViewById(R.id.card_preferences).setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), PreferenceActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });
        findViewById(R.id.card_invite).setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), InviteActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });
        findViewById(R.id.card_support).setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), SupportActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });
        findViewById(R.id.card_logout).setOnClickListener(v -> {

        });


    }
}