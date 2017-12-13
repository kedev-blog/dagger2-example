package com.kedev.dagger2_example;

import android.app.Application;
import android.content.Context;
import com.kedev.dagger2_example.di.component.DaggerExampleComponentApp;

public class ExampleApplication extends Application {

    private DaggerExampleComponentApp applicationComponent;

    public static ExampleApplication get(Context context) {
        return (ExampleApplication) context.getApplicationContext();
    }

    public DaggerExampleComponentApp getComponent() {
        return applicationComponent;
    }
}
