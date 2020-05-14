package com.example.utils

import android.content.Context
import android.content.res.Resources
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