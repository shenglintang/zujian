package com.lin.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lin.common.InterfaceFactory
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        tv_login.text = "跳转到我的页面"
        tv_login.setOnClickListener {
            InterfaceFactory.instance.mineImpl?.launch(this)
        }
    }
}