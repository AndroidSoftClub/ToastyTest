package com.example.feniltoasty

import android.app.Activity
import android.widget.Toast

object FenilToasty {

    fun Toastfenil(activity: Activity, txt: String) =
        Toast.makeText(activity, txt, Toast.LENGTH_LONG).show()
}