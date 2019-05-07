package android.vuongquocthanh.broadcastreceiver

import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var broadcast:Broadcast

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        broadcast = Broadcast()
        val intent = IntentFilter("android.intent.action.AIRPLANE_MODE")
        registerReceiver(broadcast, intent)
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(broadcast)
    }
}
