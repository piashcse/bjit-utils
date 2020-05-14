package com.example.utils

import android.content.res.Resources

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