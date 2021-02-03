package com.wingshield.technologies.love2knot_v2.activities;

import android.content.Context;
import android.os.Bundle;
import android.view.animation.DecelerateInterpolator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wingshield.technologies.love2knot_v2.R;
import com.wingshield.technologies.love2knot_v2.adapter.MatchAdapter;
import com.wingshield.technologies.love2knot_v2.model.ChatsUser;

import java.util.ArrayList;
import java.util.List;

import jp.wasabeef.recyclerview.adapters.ScaleInAnimationAdapter;
import jp.wasabeef.recyclerview.adapters.SlideInRightAnimationAdapter;

public class ChatsListActivity extends AppCompatActivity {
    private static final String TAG = EditProfileActivity.class.getSimpleName();
    private Context context;
    private List<ChatsUser> chatsUserList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chats_list);
        context = ChatsListActivity.this;
        chatsUserList = new ArrayList<>();
        setRecyclerView();
    }

    private void setRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.rv_match);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        SlideInRightAnimationAdapter alphaInAnimationAdapter = new SlideInRightAnimationAdapter(new MatchAdapter(context, chatsUserList));
        alphaInAnimationAdapter.setDuration(1000);
        alphaInAnimationAdapter.setInterpolator(new DecelerateInterpolator());
        alphaInAnimationAdapter.setFirstOnly(false);
        recyclerView.setAdapter(new ScaleInAnimationAdapter(alphaInAnimationAdapter));
        recyclerView.setAdapter(alphaInAnimationAdapter);
    }
}