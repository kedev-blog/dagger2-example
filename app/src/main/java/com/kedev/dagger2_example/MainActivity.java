package com.kedev.dagger2_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.kedev.dagger2_example.interactor.IntValueInteractor;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    IntValueInteractor interactor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        ExampleApplication.get(this).getComponent().inject(this);

        showSomeValue();
    }

    private void showSomeValue(){
        int value = interactor.getValue();
        Toast.makeText(this, String.valueOf(value) , Toast.LENGTH_SHORT).show();
    }

}
