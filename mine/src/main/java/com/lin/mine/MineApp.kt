package com.lin.mine

import android.app.Application
import com.lin.common.ICommonApp
import com.lin.common.InterfaceFactory
import com.lin.mine.impl.MineImpl

/**
 *Time:2021/3/22
 *Author:lin
 *Description：
 */
class MineApp : Application(), ICommonApp {
    companion object {
        var app: Application? = null
            private set
    }

    override fun onCreate() {
        super.onCreate()
        app = this
    }

    override fun initApp(application: Application?) {
        app = application
        InterfaceFactory.instance.mineImpl = MineImpl()
    }
}