package com.example.humungus.safaricare.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.humungus.safaricare.R;
import com.example.humungus.safaricare.models.reportsModel;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.Collections;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

import static java.security.AccessController.getContext;

/**
 * Created by humungus on 3/1/18.
 */

public class reportsAdapter extends RecyclerView.Adapter<reportsAdapter.myViewHolder> {

    private LayoutInflater inflator;
    List<reportsModel> data = Collections.emptyList();
    Context mContext;

    public reportsAdapter(Context context, List<reportsModel> data) {
        inflator=LayoutInflater.from(context);
        mContext = context;

        this.data = data;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflator.inflate(R.layout.reports_row,parent,false);
        myViewHolder holder = new myViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {
        reportsModel current = data.get(position);

        Glide.with(mContext)
                .load(current.getThumbnail())
                .into(holder.thumbnail);

        holder.title.setText(current.getUsername());
        holder.date.setText(current.getDate());
        holder.tweets.setText(current.getMatName() + ", " + current.getNoPlate()+", "+ current.getSacco()+ " : " + current.getTweets());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder{
        CircleImageView thumbnail;
        TextView title;
        TextView date;
        TextView tweets;

        public myViewHolder(View itemView) {
            super(itemView);
            thumbnail = itemView.findViewById(R.id.thumbnail);
            title = itemView.findViewById(R.id.username);
            date = itemView.findViewById(R.id.date);
            tweets = itemView.findViewById(R.id.tweets);
        }
    }
}
