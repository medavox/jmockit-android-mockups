package com.medavox.jmockit.mockups;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;

import mockit.Mock;
import mockit.MockUp;

/**
 * @author Adam Howard
 * on 21/02/17
 */

public class ContextMockUp extends MockUp<Context> {
    @Mock
    public Resources getResources() {
        new ResourcesMockUp();
        return new ResourcesMockUp().getMockInstance();

    }
    @Mock
    public String getString(int id) {
        //Log.i("ContextMockUp", "requested string for id int:"+id);
        return ""+id;
    }

    @Mock
    public SharedPreferences getSharedPreferences(String name, int mode) {
        return new SharedPreferencesMockUp().getMockInstance();
    }
}
