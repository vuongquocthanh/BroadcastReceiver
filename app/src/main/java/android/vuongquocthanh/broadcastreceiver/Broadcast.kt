package android.vuongquocthanh.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class Broadcast : BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.d(Broadcast::class.simpleName, "Air Plane Mode")
    }
}