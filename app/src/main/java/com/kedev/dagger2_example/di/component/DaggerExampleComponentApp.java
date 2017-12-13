package com.kedev.dagger2_example.di.component;

import com.kedev.dagger2_example.di.module.ApplicationModule;
import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface DaggerExampleComponentApp {

}