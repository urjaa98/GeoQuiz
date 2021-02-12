package com.bignerdranch.android.geoquiz

//import android.support.annotation.StringRes
import androidx.annotation.StringRes

data class Question(@StringRes val textResId: Int, val answer: Boolean)