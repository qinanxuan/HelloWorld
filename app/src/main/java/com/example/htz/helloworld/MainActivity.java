package com.example.htz.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/*
AppCompatActivity是一种向下兼容的Activity,
可以将Activity在各个系统版本中增加的特性和功能最低兼容到Android2.1系统。
*/

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

//        onCreate是一个活动被创建时必定要执行的方法
        super.onCreate(savedInstanceState);

//        setContentView方法为当前的活动引入一个布局
        setContentView(R.layout.activity_main);

//        Log.v(TAG, "verbose 最低级别 打印琐碎信息");
        Log.d(TAG, "debug 高于verbose 打印调试信息");
//        Log.i(TAG, "info 高于debug 打印比较重要的数据");
//        Log.w(TAG, "warn 高于info 打印警告信息");
//        Log.e(TAG, "error 最高级别 打印错误信息");

    }
}
