package com.example.mvpsignin.View;

public interface IloginView {

    void onLoginSuccess(String msg);
    void onLoginError(String msg);
    void onSetProgressBarVisibility(int visibility);


}
