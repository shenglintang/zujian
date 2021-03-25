package com.lin.common

import com.lin.common.`interface`.ILogin
import com.lin.common.`interface`.IMine

/**
 * Time:2021/3/22
 * Author:lin
 * Description：接口工厂类
 */
class InterfaceFactory {
    companion object {
        val instance = InterfaceFactory()
    }

    var loginImpl: ILogin? = null
    var mineImpl: IMine? = null
}