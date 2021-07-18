package com.example.whatsappdesign;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Status extends Fragment
{
    ListView listView;
    int[] profile={
            R.drawable.nature1,
            R.drawable.nature2,
            R.drawable.nature3,
            R.drawable.nature4,
            R.drawable.nature5,

    };
    String[] name={"Siddharth","Abhi","Pooja","Sayali","Rutuja"};
    String[] date={"Today,09:32AM","Today,10:56AM","Today,03:12PM","Today,12:30PM","Today,10:32AM"};

    StatusAdapter statusAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.status,container,false);
        listView=view.findViewById(R.id.listview3);
        statusAdapter= new StatusAdapter(getContext(),profile,name,date);
        listView.setAdapter((ListAdapter) statusAdapter);
        return view;
    }
}
