package com.sritechsoftsolutions.toolbarandmenu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Welcome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        supportActionBar?.setHomeButtonEnabled(true)
    }
}
