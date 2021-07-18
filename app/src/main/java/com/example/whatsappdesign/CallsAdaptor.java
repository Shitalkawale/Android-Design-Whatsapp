package com.example.whatsappdesign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class CallsAdaptor extends BaseAdapter
{
    Context mContext;
    int[] profile;
    String[] name;
    int[] delevermsg;
    String[] date;
    int[] call;

    public CallsAdaptor(Context mContext, int[] profile, String[] name, int[] delevermsg, String[] date, int[] call) {
        this.mContext = mContext;
        this.profile = profile;
        this.name = name;
        this.delevermsg = delevermsg;
        this.date = date;
        this.call = call;
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
            myview=layoutInflater.inflate(R.layout.calls_design,null);

        }
        else
        {
            myview=view;
        }

        CircleImageView circleImageView=myview.findViewById(R.id.profileimg);
        TextView myname=myview.findViewById(R.id.name);
        ImageView deliverstaus=myview.findViewById(R.id.img1);
        TextView date1=myview.findViewById(R.id.date);
        ImageView call1=myview.findViewById(R.id.img2);


        circleImageView.setImageResource(profile[i]);
        myname.setText(name[i]);
        deliverstaus.setImageResource(delevermsg[i]);
        date1.setText(date[i]);
        call1.setImageResource(call[i]);

        return myview;
    }
}
