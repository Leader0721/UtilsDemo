package com.example.android.utilsdemo.application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.utilsdemo.SharePreferenceUtil;
import com.example.android.utilsdemo.ToastUtil;
import com.example.android.utilsdemo.R;

public class MainActivity extends AppCompatActivity {
    private TextView txtShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Utils.init(this);
        txtShow = (TextView) findViewById(R.id.tv_show);
        txtShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharePreferenceUtil.put(MainActivity.this, "test", "显示测试用例");
                ToastUtil.shortToast(MainActivity.this,  SharePreferenceUtil.get(MainActivity.this, "test", "显示测试用例ddddd") + "" );
            }
        });


    }
}
