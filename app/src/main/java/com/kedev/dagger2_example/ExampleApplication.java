package com.kedev.dagger2_example;

import android.app.Application;
import android.content.Context;

import com.kedev.dagger2_example.di.component.DaggerExampleApplicationComponent;
import com.kedev.dagger2_example.di.component.ExampleApplicationComponent;

public class ExampleApplication extends Application {

    private ExampleApplicationComponent applicationComponent;

    public static ExampleApplication get(Context context) {
        return (ExampleApplication) context.getApplicationContext();
    }

    public ExampleApplicationComponent getComponent() {
        return applicationComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerExampleApplicationComponent
                .builder()
                .build();

        applicationComponent.inject(this);
    }
}
