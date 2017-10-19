package com.ctech.reaction.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;

import com.ctech.reaction.MainActivity;

/**
 * Created by KenZira on 3/18/17.
 */

public class DisplayUtil {

    public static int dpToPx(int dp) {
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        int dpx = dp * (metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
        Log.i(MainActivity.DEBUG, "dpToPx=" + dpx);
        return dpx;
    }
}
