package android.vuongquocthanh.broadcastreceiver.custombroadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class CustomBroadcast : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val intentActivity = Intent(context, ResponseBroadcastReceiverActivity::class.java)
        intentActivity.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        intentActivity.putExtra(CustomBroadcast::class.simpleName, intent?.getStringExtra("string_test"))
        context?.startActivity(intentActivity)
    }
}