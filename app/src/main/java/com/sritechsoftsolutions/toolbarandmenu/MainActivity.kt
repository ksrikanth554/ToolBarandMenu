package com.sritechsoftsolutions.toolbarandmenu

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //supportActionBar?.setTitle("srikanth")
        setSupportActionBar(tbar)
        tbar.setOnClickListener {
            Toast.makeText(this@MainActivity,tbar.edt2.text,Toast.LENGTH_LONG).show()
        }
        tbar.btnnext.setOnClickListener {
            var i=Intent(this@MainActivity,Welcome::class.java)
            startActivity(i)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mymenu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        Toast.makeText(this@MainActivity,item?.title,Toast.LENGTH_SHORT).show()

        return super.onOptionsItemSelected(item)
    }
}
