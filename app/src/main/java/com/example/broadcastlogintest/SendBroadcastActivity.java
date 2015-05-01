package com.example.broadcastlogintest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by lifb on 2015/4/30.
 */
public class SendBroadcastActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.broadcast_send);

        Button btn_send = (Button)findViewById(R.id.btn_send_broadcast);
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.broadcastlogintest.FORCE_OFFLINE");
                sendBroadcast(intent);
                
            }
        });
    }
}
