package com.example.administrator.eventbuscommitfragment.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.eventbuscommitfragment.R;

/**
 * MainActivity 接受到EventBus 替换成这个 Fragment
 * tvMainFragment02
 */

public class MainFragment02 extends Fragment {

    public TextView tvMainFragment02;

    public MainFragment02() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        Log.e("chris","onCreateView");
        View rootView = inflater.inflate(R.layout.fragment_main_02, null);
        tvMainFragment02 = (TextView) rootView.findViewById(R.id.tvMainFragment02);
        return rootView;
    }

}
