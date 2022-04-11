package com.example.mvpsignin.View;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.mvpsignin.Presenter.Iloginpentr;
import com.example.mvpsignin.Presenter.loginPresenterimp;
import com.example.mvpsignin.R;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements IloginView{
    private EditText editTextemail,editTextpassword;
    private Button loginbtn;
    private ProgressBar progressBar;

    private Iloginpentr iloginpentr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextemail=findViewById(R.id.editemail);
        editTextpassword=findViewById(R.id.editpassword);
        loginbtn=findViewById(R.id.loginbtn);
        progressBar=findViewById(R.id.progressbar);

        //progressBar.setProgress(View.VISIBLE);

        iloginpentr = new loginPresenterimp(this);
        progressBar.setVisibility(View.INVISIBLE);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               iloginpentr.dologin(editTextemail.getText().toString().trim(),editTextpassword.getText().toString().trim());

            }
        });

    }

    @Override
    public void onLoginSuccess(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginError(String msg) {

    }

    @Override
    public void onSetProgressBarVisibility(int visibility) {
    }
}