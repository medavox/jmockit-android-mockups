package com.medavox.jmockit.mockups;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import mockit.Mock;
import mockit.MockUp;

/**
 * @author Adam Howard
 * on 23/02/17
 */

public class ToastMockUp extends MockUp<Toast> {
    private CharSequence msg;
    private int msgID = -1;
    private int duration;

    public ToastMockUp() {
        //welp
    }

    @Mock
    public static Toast makeText(Context c, int resID, int toastLength) {
        return new ToastMockUp(resID, toastLength).getMockInstance();
    }

    @Mock
    public static Toast makeText(Context c, CharSequence msg, int toastLength) {
        return new ToastMockUp(msg, toastLength).getMockInstance();
    }

    private ToastMockUp(int id, int duration) {
        msgID = id;
        this.duration = duration;
    }

    private ToastMockUp(CharSequence msg, int duration) {
        this.msg = msg;
        this.duration = duration;
    }



    @Mock
    public void show() {
        String output = (msg == null ? (msgID == -1 ? "" : ""+msgID ) : ""+msg);
        Log.d("ToastMockUp", "toast message: \""+output+"\"; duration: "+duration);
    }

    //Toast.makeText(Application.getContext(), R.string.demo_intended_dose_list_generated_toast, Toast.LENGTH_LONG).show();
}
