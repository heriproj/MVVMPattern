package com.alhanifdev.mvvmpattern.View;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.alhanifdev.mvvmpattern.R;
import com.alhanifdev.mvvmpattern.ViewModel.UserViewModel;

public class MainActivity extends AppCompatActivity {
    private EditText inputEmail, inputPassword;
    private Button btnLogin;
    public UserViewModel userViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputEmail = findViewById(R.id.eEmail);
        inputPassword = findViewById(R.id.ePassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = inputEmail.getText().toString();
                String password = inputPassword.getText().toString();
                Log.e("Data Input", email + " - " + password);
                //userViewModel.updateModel(inputEmail.getText().toString(), inputPassword.getText().toString());
                userViewModel.validLogin();
            }
        });
    }
}
