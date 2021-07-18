package com.example.whatsappdesign;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import de.hdodenhof.circleimageview.CircleImageView;

public class Chats extends Fragment
{
    ListView listView;
    int[] profile={
            R.drawable.nature1,
            R.drawable.nature2,
            R.drawable.nature3,
            R.drawable.nature4,
            R.drawable.nature5,
            R.drawable.nature6,
            R.drawable.nature7,
            R.drawable.nature8,
            R.drawable.nature1,
            R.drawable.nature2,
            R.drawable.nature3,
            R.drawable.nature4
    };
    String[] name={"Shital","Siddharth","Abhi","Supriya","Pooja","Sayali","Rutuja","Payal","Shital","Siddharth","Abhi","Supriya"};
    int[] delevermsg={
            R.drawable.ic_baseline_check_24,
            R.drawable.ic_baseline_done_all_24,
            R.drawable.ic_baseline_done_all1_24,
            R.drawable.ic_baseline_check_24,
            R.drawable.ic_baseline_done_all_24,
            R.drawable.ic_baseline_check_24,
            R.drawable.ic_baseline_done_all1_24,
            R.drawable.ic_baseline_done_all_24,
            R.drawable.ic_baseline_done_all_24,
            R.drawable.ic_baseline_check_24,
            R.drawable.ic_baseline_done_all1_24,
            R.drawable.ic_baseline_done_all_24
    };
    String[] msg={"Hii","What are you doing?","How are you?","I am Fine","Where are you?","How are you!","Good Morning","Where are you?","Hii","What are you doing?","How are you?","I am Fine"};
    String[] timing={"09:32AM","10:56AM","yesterday","12:30PM","22/3/20","08:02AM","Yesterday","22/5/21","09:32AM","10:56AM","yesterday","12:30PM"};

    ChatsAdaptor chatsAdaptor;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.chats,container,false);
        listView=view.findViewById(R.id.listview);
        chatsAdaptor=new ChatsAdaptor(getContext(),profile,name,delevermsg,msg,timing);
        listView.setAdapter(chatsAdaptor);
        return  view;
    }


}
