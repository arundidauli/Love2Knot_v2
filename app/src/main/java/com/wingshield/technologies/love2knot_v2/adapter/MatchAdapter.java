package com.wingshield.technologies.love2knot_v2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wingshield.technologies.love2knot_v2.R;
import com.wingshield.technologies.love2knot_v2.model.ChatsUser;

import java.util.List;


public class MatchAdapter extends RecyclerView.Adapter<MatchAdapter.ChatsViewHolder> {

    private final Context context;
    private final List<ChatsUser> chatsUserList;

    public MatchAdapter(Context context, List<ChatsUser> chatsUserList) {
        this.context = context;
        this.chatsUserList = chatsUserList;
    }

    @NonNull
    @Override
    public ChatsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ChatsViewHolder(LayoutInflater.from(context).inflate(R.layout.item_match_row, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ChatsViewHolder chatsViewHolder, int position) {


    }

    @Override
    public int getItemCount() {
        return 10;
    }

    static class ChatsViewHolder extends RecyclerView.ViewHolder {


        ChatsViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
