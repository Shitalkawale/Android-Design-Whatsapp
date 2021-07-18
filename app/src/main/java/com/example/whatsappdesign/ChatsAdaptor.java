package com.example.whatsappdesign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class ChatsAdaptor extends BaseAdapter
{

    Context mContext;
    int[] profile;
    String[] name;
    int[] delevermsg;
    String[] msg;
    String[] timing;


    public ChatsAdaptor(Context mContext, int[] profile, String[] name, int[] delevermsg, String[] msg, String[] timing) {
        this.mContext = mContext;
        this.profile = profile;
        this.name = name;
        this.delevermsg = delevermsg;
        this.msg = msg;
        this.timing = timing;
    }

    public ChatsAdaptor(Context context, int[] profile, String[] name, int[] delevermsg, String[] date, int[] call) {
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
            myview=layoutInflater.inflate(R.layout.chats_design,null);

        }
        else
        {
            myview=view;
        }

        CircleImageView circleImageView=myview.findViewById(R.id.profile);
        TextView myname=myview.findViewById(R.id.name);
        ImageView deliverstaus=myview.findViewById(R.id.delivermsg);
        TextView msg1=myview.findViewById(R.id.msg);
        TextView time=myview.findViewById(R.id.delevertime);


        circleImageView.setImageResource(profile[i]);
        deliverstaus.setImageResource(delevermsg[i]);
        myname.setText(name[i]);
        msg1.setText(msg[i]);
        time.setText(timing[i]);

        return myview;
    }
}
