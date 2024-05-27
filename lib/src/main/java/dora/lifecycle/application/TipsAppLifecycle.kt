package dora.lifecycle.application

import android.app.Application
import android.content.Context
import dora.widget.Tips

class TipsAppLifecycle : ApplicationLifecycleCallbacks {

    override fun attachBaseContext(base: Context) {
    }

    override fun onCreate(application: Application) {
        Tips.init(application)
    }

    override fun onTerminate(application: Application) {
    }
}
