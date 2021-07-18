package com.example.whatsappdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Mystatus extends AppCompatActivity {

    CircleImageView img;
    ImageView img1;
    TextView txt1,txt2,txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mystatus);

        img=findViewById(R.id.status1);
        img1=findViewById(R.id.more);
        txt1=findViewById(R.id.views);
        txt2=findViewById(R.id.datestatus);
        txt3=findViewById(R.id.dash);

    }
}