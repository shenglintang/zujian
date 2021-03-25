package com.lin.mine.impl

import android.content.Context
import android.content.Intent
import com.lin.common.`interface`.IMine
import com.lin.mine.MineActivity

/**
 *Time:2021/3/22
 *Author:lin
 *Description：
 */
internal class MineImpl : IMine {
    override fun launch(context: Context) {
        val intent = Intent(context, MineActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        context.startActivity(intent)
    }
}