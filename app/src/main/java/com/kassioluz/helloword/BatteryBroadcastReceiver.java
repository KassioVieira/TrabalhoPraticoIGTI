package com.kassioluz.helloword;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class BatteryBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        boolean batteryLow = intent.getAction().equals(Intent.ACTION_BATTERY_LOW);
        Log.d("KASSIO", " Battery "+batteryLow);
        Toast.makeText(context, "Atenção!!! Bateria Fraca.", Toast.LENGTH_SHORT).show();

    }
}
