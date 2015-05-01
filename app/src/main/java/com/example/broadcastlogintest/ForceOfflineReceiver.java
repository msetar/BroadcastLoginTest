package com.example.broadcastlogintest;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.WindowManager;

/**
 * Created by lifb on 2015/5/1.
 */
public class ForceOfflineReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(final Context context, Intent intent) {
        AlertDialog.Builder dialogbuild = new AlertDialog.Builder(context);
        dialogbuild.setTitle("Warning");
        dialogbuild.setMessage("You are forced to be offline,Please try to Login again.");
        dialogbuild.setCancelable(false);

        dialogbuild.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ActivityCollector.removeAll();
                        Intent intent = new Intent(context,LoginActivity.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent);
                    }
                });

        AlertDialog alertDialog = dialogbuild.create();
        alertDialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
        alertDialog.show();

    }
}
