package com.decard.mobile.iconbadgedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private final String ACTION_NAME = "launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM";//监听广播Intent 的名称
    private final String className = "com.decard.mobile.iconbadgedemo.MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.btn1);
        Button button2 = (Button) findViewById(R.id.btn2);
        Button button3 = (Button) findViewById(R.id.btn3);
        Button button4 = (Button) findViewById(R.id.btn4);
        Button button5 = (Button) findViewById(R.id.btn5);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                // send 1 message
                Intent mIntent = new Intent(ACTION_NAME);
                mIntent.putExtra("packageName",getPackageName());
                mIntent.putExtra("className",className);
                mIntent.putExtra("notification",1);
                mIntent.putExtra("notificationBadgeState","ON");
                sendBroadcast(mIntent);
                Toast.makeText(this, "已发送1条消息", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn2:
                // send 5 messages
                Intent mIntent2 = new Intent(ACTION_NAME);
                mIntent2.putExtra("packageName",getPackageName());
                mIntent2.putExtra("className",className);
                mIntent2.putExtra("notification",5);
                mIntent2.putExtra("notificationBadgeState","ON");
                sendBroadcast(mIntent2);
                Toast.makeText(this, "已发送5条消息", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn3:
                // send 10 messages
                Intent mIntent3 = new Intent(ACTION_NAME);
                mIntent3.putExtra("packageName",getPackageName());
                mIntent3.putExtra("className",className);
                mIntent3.putExtra("notification",10);
                mIntent3.putExtra("notificationBadgeState","ON");
                sendBroadcast(mIntent3);
                Toast.makeText(this, "已发送10条消息", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn4:
                Intent mIntent4 = new Intent(ACTION_NAME);
                mIntent4.putExtra("packageName",getPackageName());
                mIntent4.putExtra("className",className);
                mIntent4.putExtra("notification",1000);
                mIntent4.putExtra("notificationBadgeState","ON");
                sendBroadcast(mIntent4);
                Toast.makeText(this, "已发送1000条消息", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn5:
                Intent mIntent5 = new Intent(ACTION_NAME);
                mIntent5.putExtra("packageName",getPackageName());
                mIntent5.putExtra("className",className);
                mIntent5.putExtra("notificationBadgeState","OFF");
                sendBroadcast(mIntent5);
                Toast.makeText(this, "消息清零", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}