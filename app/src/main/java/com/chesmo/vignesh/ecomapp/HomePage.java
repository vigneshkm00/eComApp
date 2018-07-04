package com.chesmo.vignesh.ecomapp;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class HomePage extends AppCompatActivity {
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        mViewPager = (ViewPager) findViewById(R.id.pager);
        ViewPageAdapter viewPageAdapter = new ViewPageAdapter(this);
        mViewPager.setAdapter(viewPageAdapter);
        CardView cardView1 = (CardView) findViewById(R.id.item1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomePage.this,ItemPage1.class);
                startActivity(i);

            }
        });
    }
}
