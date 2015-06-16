package com.example.adamjohns.mvptest.MainScreen;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.adamjohns.mvptest.R;

public class MainActivity extends ActionBarActivity implements MainView {

    private TextView loadingText;
    private TextView dataText;
    private MainPresenter mainPresenter;

    // Activity Overrides

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadingText = (TextView)findViewById(R.id.loadingText);
        dataText = (TextView)findViewById(R.id.dataTextView);

        mainPresenter = new MainPresenterImpl(this);
    }

    // MainView Overrides

    @Override
    public void showProgress() {
        loadingText.setText("Loading...");
    }

    @Override
    public void hideProgress() {
        loadingText.setText("");
    }

    @Override
    public void updateDataLabel(String data) {
        dataText.setText(data);
    }

    // XML Actions

    public void getDataButtonTapped(View v) {
        mainPresenter.getDataFromInteractor();
    }

}
