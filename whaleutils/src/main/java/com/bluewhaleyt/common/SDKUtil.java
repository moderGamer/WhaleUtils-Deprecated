package com.bluewhaleyt.common;

import android.os.Build;

import androidx.annotation.ChecksSdkIntAtLeast;

public class SDKUtil {

    @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.N)
    public static boolean isAtLeastSDK24() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.N;
    }

    @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.O)
    public static boolean isAtLeastSDK26() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.O;
    }

}
