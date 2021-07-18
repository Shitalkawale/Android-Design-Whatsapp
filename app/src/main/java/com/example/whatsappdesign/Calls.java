package com.example.whatsappdesign;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Calls extends Fragment
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
            R.drawable.ic_baseline_south_west_24,
            R.drawable.ic_baseline_south_west_24,
            R.drawable.ic_baseline_south_west_24,
            R.drawable.ic_baseline_south_west_24,
            R.drawable.ic_baseline_south_west_24,
            R.drawable.ic_baseline_south_west_24,
            R.drawable.ic_baseline_south_west_24,
            R.drawable.ic_baseline_south_west_24,
            R.drawable.ic_baseline_south_west_24,
            R.drawable.ic_baseline_south_west_24,
            R.drawable.ic_baseline_south_west_24,
            R.drawable.ic_baseline_south_west_24


    };

    String[] date={"Today,09:32AM","Today,10:56AM","Today,03:12PM","Yesterday,12:30PM","Yesterday,10:32AM","12/5/21","13/5/21","15/5/21","17/5/21","19/5/21","20/5/21","22/5/21"};

    int[] call={
            R.drawable.ic_baseline_local_phone_24,
            R.drawable.ic_baseline_local_phone_24,
            R.drawable.ic_baseline_local_phone_24,
            R.drawable.ic_baseline_local_phone_24,
            R.drawable.ic_baseline_local_phone_24,
            R.drawable.ic_baseline_local_phone_24,
            R.drawable.ic_baseline_local_phone_24,
            R.drawable.ic_baseline_local_phone_24,
            R.drawable.ic_baseline_local_phone_24,
            R.drawable.ic_baseline_local_phone_24,
            R.drawable.ic_baseline_local_phone_24,
            R.drawable.ic_baseline_local_phone_24,
    };



    CallsAdaptor callsAdaptor;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.calls,container,false);
        listView=view.findViewById(R.id.listview1);
        callsAdaptor= new CallsAdaptor(getContext(),profile,name,delevermsg,date,call);
        listView.setAdapter(callsAdaptor);
        return  view;
    }



}
