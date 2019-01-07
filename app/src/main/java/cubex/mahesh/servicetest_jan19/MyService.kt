package cubex.mahesh.servicetest_jan19

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class MyService : Service() {
    override fun onBind(p0: Intent?): IBinder? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    var mPlayer:MediaPlayer? = null

    override fun onCreate() {
        super.onCreate()
        mPlayer = MediaPlayer.create(
            this@MyService,R.raw.dj)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if(mPlayer!=null)
                    mPlayer!!.start()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        if(mPlayer!=null)
            mPlayer!!.stop()
    }


}