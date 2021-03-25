package com.lin.login

import android.app.Application
import com.lin.common.ICommonApp
import com.lin.common.InterfaceFactory
import com.lin.login.impl.LoginImpl

/**
 * Time:2021/3/22
 * Author:lin
 * Description：
 */
class LoginApp : Application(), ICommonApp {
    override fun onCreate() {
        super.onCreate()
        initApp(this)
    }

    override fun initApp(application: Application?) {
        app = application
        InterfaceFactory.instance.loginImpl = LoginImpl()
    }

    companion object {
        var app: Application? = null
            private set
    }
}