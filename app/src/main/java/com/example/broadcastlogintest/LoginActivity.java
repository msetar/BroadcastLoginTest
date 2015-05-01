package com.example.broadcastlogintest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by lifb on 2015/4/30.
 */
public class LoginActivity extends  BaseActivity{
    private EditText input_username;
    private EditText input_password;
    private Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        input_username = (EditText)findViewById(R.id.input_username);
        input_password = (EditText)findViewById(R.id.input_password);
        btn_login = (Button)findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_username = input_username.getText().toString();
                String str_password = input_password.getText().toString();
                if(str_username.equals("admin")&&str_password.equals("888888"))
                {
                    Intent intent = new Intent(LoginActivity.this,SendBroadcastActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this,"account or password is invilid",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
