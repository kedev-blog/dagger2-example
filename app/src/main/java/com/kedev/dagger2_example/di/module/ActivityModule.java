package com.kedev.dagger2_example.di.module;

import android.app.Activity;
import android.content.Context;
import com.kedev.dagger2_example.di.ActivityContext;
import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return activity;
    }

    @Provides
    Activity provideActivity() {
        return activity;
    }
}