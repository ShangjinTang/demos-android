package com.example.broadcastreceiverdemo
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class BootCompletedReceiver : BroadcastReceiver() {
    companion object {
        private const val TAG = "BootCompletedReceiver"
    }

    override fun onReceive(context: Context, intent: Intent) {
        // specify the work to do on receiving broadcast
        Log.d(TAG, "Boot completed")
        Toast.makeText(context, "Boot completed", Toast.LENGTH_LONG).show()
    }
}
