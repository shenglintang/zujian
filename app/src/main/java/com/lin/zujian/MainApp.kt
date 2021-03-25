package com.lin.zujian

import android.app.Application
import com.lin.common.AppConfig
import com.lin.common.ICommonApp

/**
 * Time:2021/3/22
 * Author:lin
 * Description：
 */
internal class MainApp : Application(), ICommonApp {
    companion object {
        var application: MainApp? = null
            private set
    }

    override fun onCreate() {
        super.onCreate()
        initApp(this)
    }

    override fun initApp(app: Application?) {
        application = app as MainApp?
        //通过反射调用每个module的initApp方法
        for (appName in AppConfig.COMPONENTS) {
            try {
                val clazz = Class.forName(appName)
                val `object` = clazz.newInstance()
                if (`object` is ICommonApp) {
                    `object`.initApp(this)
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }


}