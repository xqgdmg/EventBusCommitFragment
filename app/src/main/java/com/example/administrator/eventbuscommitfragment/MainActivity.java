package com.example.administrator.eventbuscommitfragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.administrator.eventbuscommitfragment.event.MessageEvent;
import com.example.administrator.eventbuscommitfragment.fragment.MainFragment01;
import com.example.administrator.eventbuscommitfragment.fragment.MainFragment02;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class MainActivity extends Activity {

    private TextView tvGoSengActivity;
    private FrameLayout flContainer;
    private TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EventBus.getDefault().register(this);

        initView();
        initFragment();
        initListener();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    /**
     * 替换掉原来的 MainFragment01
     * 并改变 tvShow 的文字
     */
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(MessageEvent event) {
        MainFragment02 mainFragment02 = new MainFragment02();
        getFragmentManager().beginTransaction().replace(R.id.flContainer,mainFragment02).commit();

        tvShow.setText("并改变 tvShow 的文字");
    };

    private void initFragment() {

         // 向 Fragment 传递值
        MainFragment01 mainFragment01 = new MainFragment01("chris");
        getFragmentManager().beginTransaction().replace(R.id.flContainer,mainFragment01).commit();
    }

    private void initListener() {

        tvGoSengActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SendMessageActivity.class));
            }
        });
    }

    private void initView() {

        tvGoSengActivity = (TextView) findViewById(R.id.tvGoSengActivity);
        tvShow = (TextView) findViewById(R.id.tvShow);
        flContainer = (FrameLayout) findViewById(R.id.flContainer);
    }
}
