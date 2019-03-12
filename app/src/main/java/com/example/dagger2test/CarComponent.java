package com.example.dagger2test;

import dagger.Component;

@Component
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
