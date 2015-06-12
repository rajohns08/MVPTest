package com.example.adamjohns.mvptest.Dagger;

import com.example.adamjohns.mvptest.MainPresenter;
import com.example.adamjohns.mvptest.MainPresenterImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by adamjohns on 6/12/15.
 *
 */

@Module
public class PresenterModule {

    @Provides @Singleton
    public MainPresenter provideMainPresenter() {
        return new MainPresenterImpl();
    }

}
