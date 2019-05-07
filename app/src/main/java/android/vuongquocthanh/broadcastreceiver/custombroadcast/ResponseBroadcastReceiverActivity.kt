package android.vuongquocthanh.broadcastreceiver.custombroadcast

import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.vuongquocthanh.broadcastreceiver.R
import android.widget.Toast

class ResponseBroadcastReceiverActivity : AppCompatActivity() {
    private lateinit var customBroadcast : CustomBroadcast

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_response_broadcast_receiver)
        customBroadcast = CustomBroadcast()
        val intentFilter = IntentFilter("custom.Broadcast")
        registerReceiver(customBroadcast, intentFilter)
        val intent = intent
        Log.d(ResponseBroadcastReceiverActivity::class.simpleName, intent.getStringExtra("CustomBroadcast"))
        Toast.makeText(this,  intent.getStringExtra("CustomBroadcast"), Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(customBroadcast)
    }
}
