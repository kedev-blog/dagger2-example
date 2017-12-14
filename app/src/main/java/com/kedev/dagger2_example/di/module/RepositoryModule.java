package com.kedev.dagger2_example.di.module;

import com.kedev.dagger2_example.repository.DataRepository;
import com.kedev.dagger2_example.repository.DataRepositoryImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RepositoryModule {

    @Provides
    @Singleton
    public DataRepository provideRepository(DataRepositoryImpl repository){
        return repository;
    }

}
