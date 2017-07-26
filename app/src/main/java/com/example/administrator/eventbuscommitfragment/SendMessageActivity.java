package com.example.administrator.eventbuscommitfragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.eventbuscommitfragment.event.MessageEvent;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by Chris on 2017/7/26.
 */

public class SendMessageActivity extends Activity {

    private TextView tvSendEventBus;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);

        initView();
        initListener();
    }

    private void initListener() {
        tvSendEventBus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new MessageEvent());
                finish();
            }
        });
    }

    private void initView() {
        tvSendEventBus = (TextView) findViewById(R.id.tvSendEventBus);
    }
}
