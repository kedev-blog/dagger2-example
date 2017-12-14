package com.kedev.dagger2_example.di.component;

import com.kedev.dagger2_example.ExampleApplication;
import com.kedev.dagger2_example.MainActivity;
import com.kedev.dagger2_example.di.module.ApplicationModule;
import com.kedev.dagger2_example.di.module.InteractorModule;
import com.kedev.dagger2_example.di.module.RepositoryModule;

import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = {ApplicationModule.class, InteractorModule.class, RepositoryModule.class})
public interface ExampleApplicationComponent {

    void inject(ExampleApplication application);

    void inject(MainActivity activity);

}