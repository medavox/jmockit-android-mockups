package com.medavox.jmockit.mockups;

import android.util.Log;

import com.medavox.util.io.DateTime;

import mockit.Mock;
import mockit.MockUp;

/**
 * @author Adam Howard
 * on 10/02/17
 */
public final class LogMockUp extends MockUp<Log> {
    @Mock
    public static int v(String TAG, String msg) {
        return common("V", TAG, msg);
    }

    @Mock
    public static int d(String TAG, String msg) {
        return common("D", TAG, msg);
    }

    @Mock
    public static int i(String TAG, String msg) {
        return common("I", TAG, msg);
    }

    @Mock
    public static int w(String TAG, String msg) {
        return common("W", TAG, msg);
    }

    @Mock
    public static int e(String TAG, String msg) {
        return common("E", TAG, msg);
    }

    private static int common(String level, String TAG, String msg) {
        String now = DateTime.get(System.currentTimeMillis(), DateTime.TimeFormat.MILLISECONDS);
        String out = level + " @ " + now + ": " + String.format("%23s: ", TAG) + msg;

        if (level.equals("E")) {
            System.err.println(out);
        } else {
            System.out.println(out);
        }
        return -1;
    }

}
