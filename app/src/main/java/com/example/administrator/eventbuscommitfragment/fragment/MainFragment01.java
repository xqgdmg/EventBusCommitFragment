package com.example.administrator.eventbuscommitfragment.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.eventbuscommitfragment.R;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

/**
 * MainActivity 初始显示的 Fragment
 */

public class MainFragment01 extends Fragment {

    public MainFragment01() {
    }

    @SuppressLint("ValidFragment")
    public MainFragment01(String chris) {
        Bundle bundle = new Bundle();
        bundle.putString("string",chris);
        setArguments(bundle);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("chris","onCreate");
        Bundle bundle = getArguments();
        if (bundle != null){
            String getArguments = bundle.getString("string");
            Log.e("chris","getArguments==" + getArguments);
        }

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        Log.e("chris","onCreateView");

        // 这个不能写 container ，否则报 已经添加View，需要先 removeView
        return inflater.inflate(R.layout.fragment_main_01,null);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("chris","onActivityCreated");
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.e("chris","onAttach");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("chris","onAttach");
    }

    @Override
    public void onAttachFragment(Fragment childFragment) {
        super.onAttachFragment(childFragment);
        Log.e("chris","onAttachFragment");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("chris","onDetach");
    }
}
