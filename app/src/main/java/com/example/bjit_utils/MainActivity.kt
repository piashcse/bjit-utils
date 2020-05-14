package com.example.bjit_utils

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.utils.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val heightInPx = 10.dpToPx()
        val heightInDp = 10.pixelsToDp()
        text_view.text = """Height in pixel = $heightInPx 
Height in dp = $heightInDp"""
        showToast("screen height : ${screenHeightInPx()} width : ${screenWidthInPx()}")
    }
}
