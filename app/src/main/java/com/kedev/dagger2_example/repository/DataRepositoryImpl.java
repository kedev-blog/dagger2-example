package com.kedev.dagger2_example.repository;

import javax.inject.Inject;

public class DataRepositoryImpl implements DataRepository {

    @Inject
    public DataRepositoryImpl() {
    }

    @Override
    public int getValueOne() {
        return 1;
    }

    @Override
    public int getValueTwo() {
        return 2;
    }
}
