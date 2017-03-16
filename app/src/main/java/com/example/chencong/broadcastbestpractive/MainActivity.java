package com.example.chencong.broadcastbestpractive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button forceOffline = (Button)findViewById(R.id.force_offline);
        /**点击按钮 发送一个"com.example.chencong.broadcastbestpractive.FORCE_OFFLINE"
         *强制下线的广播 然后在接受这条广播的类（接收器）中进行强制下线的功能
         * 在这里新建一个广播接收器 ForceOfflineReceiver 类 来继承 BroadcastReceiver
         */
        forceOffline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.chencong.broadcastbestpractive.FORCE_OFFLINE");
                sendBroadcast(intent);
            }
        });
    }
}
