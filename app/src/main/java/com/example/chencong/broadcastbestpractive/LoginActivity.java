package com.example.chencong.broadcastbestpractive;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends BaseActivity implements View.OnClickListener {


    private EditText accountEdit;
    private EditText passwordEdit;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        //初始化 注册控件
        accountEdit = (EditText)findViewById(R.id.account);
        passwordEdit = (EditText)findViewById(R.id.password);
        loginButton = (Button)findViewById(R.id.login);

        //登录按钮的点击事件
        loginButton.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        String account = accountEdit.getText().toString();
        String password = passwordEdit.getText().toString();
        //在这里进行默认账户为 admin 密码为123456

        if (account.equals("admin") && password.equals("123456")){
            //登录成功后 进入MainActivity  并且在这里面提供强制下线的功能
            Intent intent = new Intent(LoginActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        }else {
            Toast.makeText(LoginActivity.this,"账户和密码不匹配",Toast.LENGTH_SHORT).show();
        }
    }
}
