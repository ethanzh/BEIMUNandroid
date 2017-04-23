package org.beimun.beimun;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.widget.Button;

public class MainActivity extends FragmentActivity{

    Button m1;
    Button m2;
    Button m3;
    Button m4;
    ViewPager mViewPager;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            initializeButtons();

            setInitialColors();

            startViewPager();

    }

    public void initializeButtons() {
        m1 = (Button) findViewById(R.id.button_1);
        m2 = (Button) findViewById(R.id.button_2);
        m3 = (Button) findViewById(R.id.button_3);
        m4 = (Button) findViewById(R.id.button_4);
    }


    public void setInitialColors() {
        m1.setBackgroundColor(Color.BLACK);
        m2.setBackgroundColor(Color.WHITE);
        m3.setBackgroundColor(Color.WHITE);
        m4.setBackgroundColor(Color.WHITE);
    }


    public void startViewPager(){
        mViewPager = (ViewPager) findViewById(R.id.pager);
        FragmentManager fragmentManager = getSupportFragmentManager();
        mViewPager.setAdapter(new ViewPagerAdapter(fragmentManager));
        //mViewPager.setCurrentItem(1);
    }

}
