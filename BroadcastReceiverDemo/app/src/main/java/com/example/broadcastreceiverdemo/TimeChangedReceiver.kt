package com.example.broadcastreceiverdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class TimeChangedReceiver : BroadcastReceiver() {
    companion object {
        private const val TAG = "TimeChangedReceiver"
    }

    override fun onReceive(context: Context, intent: Intent) {
        // specify the work to do on receiving broadcast
        Log.d(TAG, "Time has changed")
        Toast.makeText(context, "Time has changed", Toast.LENGTH_SHORT).show()
    }
}
