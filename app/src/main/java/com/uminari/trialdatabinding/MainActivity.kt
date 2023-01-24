package com.uminari.trialdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uminari.trialdatabinding.views.InputTextFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, InputTextFragment())
        fragmentTransaction.commit()
    }
}