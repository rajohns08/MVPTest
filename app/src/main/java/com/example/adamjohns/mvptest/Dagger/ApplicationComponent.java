package com.example.adamjohns.mvptest.Dagger;

import com.example.adamjohns.mvptest.MainPresenter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by adamjohns on 6/12/15.
 *
 */
@Singleton
@Component(modules = PresenterModule.class)
public interface ApplicationComponent {

    MainPresenter provideMainpresenter();

}
