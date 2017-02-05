package com.liang.jpushdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import cn.jpush.android.api.JPushInterface;

public class MainActivity extends AppCompatActivity {

    private EditText mEditText;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化视图
        mEditText = (EditText) findViewById(R.id.editText);
        mButton = (Button) findViewById(R.id.button);
        //设置监听事件
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //设置别名
                if (!TextUtils.isEmpty(mEditText.getText())){
                    JPushInterface.setAlias(MainActivity.this,mEditText.getText().toString(),null);
                    Toast.makeText(MainActivity.this, "SUCCESS，设置别名成功！", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "请设置别名", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
