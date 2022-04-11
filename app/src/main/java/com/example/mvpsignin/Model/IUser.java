package com.example.mvpsignin.Model;

public interface IUser {
    String getEmail();
    String getPassword();
    int checkUserValidity();
}
