package com.lin.login.impl

import android.content.Context
import android.content.Intent
import com.lin.common.`interface`.ILogin
import com.lin.login.LoginActivity

/**
 * Time:2021/3/22
 * Author:lin
 * Description：
 */
internal class LoginImpl : ILogin {
    override fun launch(context: Context) {
        val intent = Intent(context, LoginActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        context.startActivity(intent)
    }

}