package com.lin.zujian

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lin.common.InterfaceFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_main.setOnClickListener {
            //跳转到login页面
            InterfaceFactory.instance.loginImpl?.launch(this)
        }
    }
}