package com.kedev.dagger2_example.di.module;

import com.kedev.dagger2_example.interactor.IntValueInteractor;
import com.kedev.dagger2_example.interactor.IntValueInteractorImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class InteractorModule {

    @Provides
    @Singleton
    public IntValueInteractor provideInteractor(IntValueInteractorImpl intValueInteractor){
        return intValueInteractor;
    }

}
