package com.example.buttonclicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bun
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

private var timesClicked = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickMeClick(view: View) {
        timesClicked++
        button.setText(timesClicked.toString())
    }
}