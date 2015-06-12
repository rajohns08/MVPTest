package com.example.adamjohns.mvptest;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import javax.inject.Inject;


public class MainActivity extends ActionBarActivity implements MainView {
    private TextView loadingText;

    @Inject MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadingText = (TextView)findViewById(R.id.loadingText);
        mainPresenter.getData();
    }

    @Override
    public void showProgress() {
        loadingText.setText("Loading...");
    }

    @Override
    public void hideProgress() {
        loadingText.setText("");
    }
}
