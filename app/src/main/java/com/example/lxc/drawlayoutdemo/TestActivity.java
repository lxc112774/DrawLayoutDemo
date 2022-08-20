package com.example.lxc.drawlayoutdemo;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class TestActivity extends Activity implements View.OnClickListener {

    private ImageView view1;

    private DrawerLayout drawerLayout;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_test);
        initView();
    }

    private void initView()
    {
        drawerLayout=(DrawerLayout) findViewById(R.id.v4_drawerlayout);
        view1 = (ImageView) findViewById(R.id.left_menu);
        view1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.left_menu:
                if (drawerLayout.isDrawerOpen(Gravity.LEFT)){
                    drawerLayout.closeDrawer(Gravity.LEFT);
                }else{
                    drawerLayout.openDrawer(Gravity.LEFT);
                }
                break;
        }
    }
}