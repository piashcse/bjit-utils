package com.example.utils

import android.content.Context
import android.content.res.Resources
import android.util.DisplayMetrics
import android.view.WindowManager
import android.widget.Toast

/**
 * Created by Piash on 5/14/20
 * Copyright (c) 2020 bjit. All rights reserved.
 * piash.hassan@bjitgroup.com
 * Last modified $file.lastModified
 */


fun Int.dpToPx(): Int {
    return (this * Resources.getSystem().displayMetrics.density).toInt()
}

fun Int.pixelsToDp(): Int {
    return (this / Resources.getSystem().displayMetrics.density).toInt()
}

fun Context?.showToast(text: String?): Context? {
    if (this == null || text.isNullOrEmpty()) return this
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    return this
}

fun Context?.screenWidthInPx(): Int {
    if (this == null) return 0
    val dm = DisplayMetrics()
    val wm = this.getSystemService(Context.WINDOW_SERVICE) as WindowManager
    wm.defaultDisplay.getMetrics(dm)
    return dm.widthPixels
}

fun Context?.screenHeightInPx(): Int {
    if (this == null) return 0
    val dm = DisplayMetrics()
    val wm = this.getSystemService(Context.WINDOW_SERVICE) as WindowManager
    wm.defaultDisplay.getMetrics(dm)
    return dm.heightPixels
}