package com.kedev.dagger2_example.interactor;

import com.kedev.dagger2_example.repository.DataRepository;

import java.util.Random;

import javax.inject.Inject;

public class IntValueInteractorImpl implements IntValueInteractor {

    private DataRepository repository;

    @Inject
    public IntValueInteractorImpl(DataRepository repository) {
        this.repository = repository;
    }

    @Override
    public int getValue() {
        Random random = new Random();
        int chance = random.nextInt(2);
        if (chance == 0) {
            return repository.getValueOne();
        }
        return repository.getValueTwo();
    }
}
