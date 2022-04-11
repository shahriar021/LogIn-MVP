package com.example.mvpsignin.Presenter;

import com.example.mvpsignin.Model.IUser;
import com.example.mvpsignin.Model.Userimplentation;
import com.example.mvpsignin.View.IloginView;

public class loginPresenterimp implements Iloginpentr{

    private IloginView iloginView;

    public loginPresenterimp(IloginView iloginView) {
        this.iloginView = iloginView;
    }

    @Override
    public void dologin(String email, String pass) {

        IUser user = new Userimplentation(email,pass);
        int login_code=user.checkUserValidity();

        if (login_code==0){
            iloginView.onLoginError("plz enter your email");
        }
        else if (login_code==1){
            iloginView.onLoginError("plz enter a valid email");
        }
        else if (login_code==2){
            iloginView.onLoginError("plz enter your password");
        }
        else if (login_code==3){
            iloginView.onLoginError("plz enter your password that should be more than 6 character ");
        }

        else{
            iloginView.onLoginSuccess("Login Successful");
        }




    }

    @Override
    public void setProgressBarvisibility(int visibility) {
        iloginView.onSetProgressBarVisibility(visibility);

    }
}
