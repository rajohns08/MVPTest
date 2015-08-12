package com.example.adamjohns.mvptest.MainScreen;

public class MainPresenterImpl implements MainPresenter, OnDataRetrievedListener {

    private MainView mainView;
    private MainInteractor mainInteractor;

    public MainPresenterImpl(MainView mainView, MainInteractor mainInteractor) {
        this.mainView = mainView;
        this.mainInteractor = mainInteractor;
    }

    // MainPresenter Overrides

    @Override
    public void getDataFromInteractor() {
        mainView.showProgress();
        mainView.updateDataLabel("");
        mainInteractor.getData(this);
    }

    // OnDataRetrievedListener Overrides

    @Override
    public void onSuccess(String data) {
        mainView.hideProgress();
        mainView.updateDataLabel(data);
    }

    @Override
    public void onFailure() {
        mainView.hideProgress();
        mainView.updateDataLabel("An error occurred.");
    }

}
