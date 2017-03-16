package com.example.chencong.broadcastbestpractive;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 定义父类BaseActivity
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //创建活动时，将其加入管理器中
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //销毁活动时，将其从管理器中移除
        ActivityCollector.removeActivity(this);
    }
}
