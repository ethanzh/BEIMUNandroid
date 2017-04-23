package org.beimun.beimun;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.View;
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

            viewPagerListener();
    }

    // Simply initializes the 4 buttons
    public void initializeButtons() {
        m1 = (Button) findViewById(R.id.button_1);
        m2 = (Button) findViewById(R.id.button_2);
        m3 = (Button) findViewById(R.id.button_3);
        m4 = (Button) findViewById(R.id.button_4);
    }

    // Colors for testing purposes
    public void setInitialColors() {
        m1.setBackgroundColor(Color.BLACK);
        m2.setBackgroundColor(Color.WHITE);
        m3.setBackgroundColor(Color.WHITE);
        m4.setBackgroundColor(Color.WHITE);
    }

    public void setAllWhite(){
        m1.setBackgroundColor(Color.WHITE);
        m2.setBackgroundColor(Color.WHITE);
        m3.setBackgroundColor(Color.WHITE);
        m4.setBackgroundColor(Color.WHITE);
    }

    // Starts the View Pager
    public void startViewPager(){
        mViewPager = (ViewPager) findViewById(R.id.pager);
        FragmentManager fragmentManager = getSupportFragmentManager();
        mViewPager.setAdapter(new ViewPagerAdapter(fragmentManager));
        mViewPager.setCurrentItem(0);
    }

    // Listens for changes to the Page Viewer
    public void viewPagerListener(){
        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener(){
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }

            @Override
            public void onPageSelected(int position) {

            }
        });
    }

    public void jumpToDay1(View view){
        setAllWhite();
        m1.setBackgroundColor(Color.BLACK);
        mViewPager.setCurrentItem(0);
    }

    public void jumpToDay2(View view){
        setAllWhite();
        m2.setBackgroundColor(Color.BLACK);
        mViewPager.setCurrentItem(1);
    }

    public void jumpToDay3(View view){
        setAllWhite();
        m3.setBackgroundColor(Color.BLACK);
        mViewPager.setCurrentItem(2);
    }

    public void jumpToDay4(View view){
        setAllWhite();
        m4.setBackgroundColor(Color.BLACK);
        mViewPager.setCurrentItem(3);
    }
}
