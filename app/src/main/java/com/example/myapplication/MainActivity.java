package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button btn_switch;
    private ImageView iv_open, iv_close;
    private boolean isOpen = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init() {
        btn_switch = findViewById(R.id.btn_switch);
        iv_open = findViewById(R.id.iv_open);
        iv_close = findViewById(R.id.iv_close);
        btn_switch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isOpen) {
                    btn_switch.setText("开灯");
                    btn_switch.setBackgroundResource(R.drawable.btn_close);
                    iv_open.setVisibility(View.GONE);
                    iv_close.setVisibility(View.VISIBLE);
                    isOpen=false;

                    Intent intent = new Intent(MainActivity.this, MyService.class);
                    stopService(intent);
                } else {
                    btn_switch.setText("关灯");
                    btn_switch.setBackgroundResource(R.drawable.btn_open);
                    iv_open.setVisibility(View.VISIBLE);
                    iv_close.setVisibility(View.GONE);
                    isOpen=true;
                    Intent intent = new Intent(MainActivity.this, MyService.class);
                    startService(intent);
                }
            }
        });
    }
}
