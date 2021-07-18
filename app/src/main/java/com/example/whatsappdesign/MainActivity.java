package com.example.whatsappdesign;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ListView listView;
    Toolbar toolbar;

    ViewPager viewPager;
    PageAdapter pageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=findViewById(R.id.tablayout);

        viewPager=findViewById(R.id.viewpager);

        pageAdapter=new PageAdapter(getSupportFragmentManager());

        if(savedInstanceState==null)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.viewpager,new Chats()).commit();

        }

        pageAdapter.add(new Chats(),"CHATS");
        pageAdapter.add(new Status(),"STATUS");
        pageAdapter.add(new Calls(),"CALLS");

        viewPager.setAdapter(pageAdapter);

        tabLayout.setupWithViewPager(viewPager);

        toolbar=findViewById(R.id.mytoolbar);
        setSupportActionBar(toolbar);

//        if(savedInstanceState==null)
//        {
//            getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,new Chats()).commit();
//        }

//        tabLayout.addTab(tabLayout.newTab().setText("CHATS"));
//        tabLayout.addTab(tabLayout.newTab().setText("STATUS"));
//        tabLayout.addTab(tabLayout.newTab().setText("CALLS" +
//                ""));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch(tab.getPosition())
                {
                    case 0:
                        Toast.makeText(MainActivity.this, "Clicked on Chats tab", Toast.LENGTH_SHORT).show();
                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,new Chats()).commit();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "Clicked on Status tab", Toast.LENGTH_SHORT).show();
                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,new Status()).commit();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Clicked on Calls tab", Toast.LENGTH_SHORT).show();
                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,new Calls()).commit();
                        break;
                   // default:
                   //     break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.my_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.search:
                Toast.makeText(getApplicationContext(), "select search", Toast.LENGTH_SHORT).show();
                break;

            case R.id.newgroup:
                Toast.makeText(getApplicationContext(), "select New group", Toast.LENGTH_SHORT).show();
                break;

            case R.id.newbroadcast:
                Toast.makeText(getApplicationContext(), "select New Broadcast", Toast.LENGTH_SHORT).show();
                break;

            case R.id.whatsappweb:
                Toast.makeText(getApplicationContext(), "select WhatsApp Web", Toast.LENGTH_SHORT).show();
                break;

            case R.id.starredmessage:
                Toast.makeText(getApplicationContext(), "select Starred Messages", Toast.LENGTH_SHORT).show();
                break;

            case R.id.payments:
                Toast.makeText(getApplicationContext(), "select Payments", Toast.LENGTH_SHORT).show();
                break;

            case R.id.setting:
                Toast.makeText(getApplicationContext(), "select setting", Toast.LENGTH_SHORT).show();
                break;

        }

        return super.onOptionsItemSelected(item);
    }

}