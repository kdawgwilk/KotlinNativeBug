package com.kotlinnativebug;

import com.facebook.react.ReactActivity;

import sample.SampleKt;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        SampleKt.hello();
        return "KotlinNativeBug";
    }
}
