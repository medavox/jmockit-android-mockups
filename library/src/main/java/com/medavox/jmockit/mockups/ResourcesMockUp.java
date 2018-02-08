package com.medavox.jmockit.mockups;

import android.content.res.Resources;

import mockit.Mock;
import mockit.MockUp;

/**
 * @author Adam Howard
 * on 21/02/17
 */

public class ResourcesMockUp extends MockUp<Resources> {
    @Mock
    public int getInteger(int id) {
        return id;
    }
}
