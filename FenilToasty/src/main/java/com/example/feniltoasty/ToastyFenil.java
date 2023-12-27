package com.example.feniltoasty;

import android.app.Activity;
import android.widget.Toast;

public class ToastyFenil {
    public static void toastyFenil(Activity activity, String title) {
        Toast.makeText(activity, title, Toast.LENGTH_SHORT).show();
    }
}
