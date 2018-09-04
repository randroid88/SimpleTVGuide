package io.winf.simpletvguide.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.winf.simpletvguide.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.container, MainFragment())
        ft.commit()
    }
}
