package android.vuongquocthanh.broadcastreceiver.custombroadcast

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.vuongquocthanh.broadcastreceiver.R
import kotlinx.android.synthetic.main.activity_send_broadcast.*

class SendBroadcastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_broadcast)
        btSendBroadcast.setOnClickListener {
            val intent = Intent()
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.setAction("custom.Broadcast")
            intent.putExtra("string_test", "Hello")
            sendBroadcast(intent)

            val intentActivity = Intent(this, ResponseBroadcastReceiverActivity::class.java)
            startActivity(intentActivity)
        }
    }
}
