package com.kedev.dagger2_example.di.module;

import android.app.Application;
import android.content.Context;
import com.kedev.dagger2_example.di.ApplicationContext;
import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private final Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    @ApplicationContext
    Context provideContext(){
        return application;
    }

    @Provides
    Application provideApplication() {
        return application;
    }

}
