package com.example.adamjohns.mvptest;

public class MainPresenterImpl implements MainPresenter, OnDataRetrievedListener {

    private MainView mainView;
    private MainInteractor mainInteractor;

    public MainPresenterImpl(MainView mainView) {
        this.mainView = mainView;
        this.mainInteractor = new MainInteractorImpl();
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
