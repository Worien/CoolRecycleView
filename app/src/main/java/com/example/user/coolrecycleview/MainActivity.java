package com.example.user.coolrecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.example.user.coolrecycleview.recycle.ChildDrawers.InnerRightWheelChildDrawer;
import com.example.user.coolrecycleview.recycle.ChildDrawers.InnerStraightWheelChildDrawer;
import com.example.user.coolrecycleview.recycle.CoolAdapter;
import com.example.user.coolrecycleview.recycle.CoolRecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private CoolRecyclerView rvSimple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvSimple = (CoolRecyclerView) findViewById(R.id.rv_simple);
        rvSimple.setLayoutManager(new LinearLayoutManager(this));
        rvSimple.setChildDrawer(new InnerStraightWheelChildDrawer());
        List<String> items = Arrays.asList(new String[]{"first","second","third", "fourth", "fifth", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "first","second","third", "fourth", "fifth", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "first","second","third", "fourth", "fifth", "six", "seven", "eight", "nine", "ten", "eleven", "twelve"});
        rvSimple.setAdapter(new CoolAdapter(items));
    }
}
