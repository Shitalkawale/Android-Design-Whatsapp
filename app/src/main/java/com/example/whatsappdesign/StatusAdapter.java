package com.example.whatsappdesign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class StatusAdapter extends BaseAdapter {

    Context mContext;
    int[] profile;
    String[] name;
    String[] date;

    public StatusAdapter(Context mContext, int[] profile, String[] name, String[] date) {
        this.mContext = mContext;
        this.profile = profile;
        this.name = name;
        this.date = date;
    }

    @Override
    public int getCount() {
        return profile.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        View myview=null;
        if (myview==null)
        {
            LayoutInflater layoutInflater=LayoutInflater.from(mContext);
            myview=layoutInflater.inflate(R.layout.status_design,null);

        }
        else
        {
            myview=view;
        }

        CircleImageView circleImageView=myview.findViewById(R.id.imgstatus);
        TextView myname=myview.findViewById(R.id.namestatus);
        TextView mydate=myview.findViewById(R.id.datestatus);

        circleImageView.setImageResource(profile[i]);
        myname.setText(name[i]);
        mydate.setText(date[i]);

        return myview;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

