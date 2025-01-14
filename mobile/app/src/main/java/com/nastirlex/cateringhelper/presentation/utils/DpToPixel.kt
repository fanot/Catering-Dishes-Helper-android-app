package com.nastirlex.cateringhelper.presentation.utils

import android.content.Context
import android.util.DisplayMetrics

fun Context.dpToPixel(dp: Float): Float {
    return dp * (resources.displayMetrics.densityDpi.toFloat() / DisplayMetrics.DENSITY_DEFAULT)
}