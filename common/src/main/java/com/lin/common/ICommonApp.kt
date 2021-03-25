package com.lin.common

import android.app.Application

/**
 * Time:2021/3/22
 * Author:lin
 * Description： 在每个module的initApp中初始化对应的service
 */
interface ICommonApp {
    fun initApp(application: Application?)
}