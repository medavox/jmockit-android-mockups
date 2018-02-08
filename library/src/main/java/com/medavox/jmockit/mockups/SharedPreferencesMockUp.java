package com.medavox.jmockit.mockups;

import android.content.SharedPreferences;
import android.util.Log;

import java.util.HashMap;
import java.util.Map;

import mockit.Mock;
import mockit.MockUp;

/**
 * @author Adam Howard
 * on 21/02/17
 */

public class SharedPreferencesMockUp extends MockUp<SharedPreferences> {
    private static Map<String, String> map = new HashMap<String, String>();

    static Map<String, String> stringMap() {
        return map;
    }


    public void addStringForTesting(String key, String value) {
        map.put(key, value);
    }

    @Mock
    public String getString(String key) {
        if(map.containsKey(key)) {
            return map.get(key);
        }
        Log.i("SharedPreferencesMockUp", "requested string for key:"+key);
        return ""+key;
    }
}
