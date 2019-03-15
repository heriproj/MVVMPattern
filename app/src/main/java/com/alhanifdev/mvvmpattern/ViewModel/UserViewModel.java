package com.alhanifdev.mvvmpattern.ViewModel;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import com.alhanifdev.mvvmpattern.Model.User;

public class UserViewModel {
    public final static String TOAST_MESASSAGE_SUCCSES = "Login Success";
    public final static String TOAST_MESASSAGE_FAILED = "Login Failed";
    private Context context;
    private User user;

    public UserViewModel(Context context, User user) {
        this.context = context;
        this.user = user;
    }

    public void updateModel(String email, String password){
//        user.setEmail(email);
//        user.setPassword(password);
        Log.e("Data Input", email + " - " + password);
    }

    public void validLogin(){
        boolean isValid = true;
        if (TextUtils.isEmpty(user.getEmail()))
            isValid = false;
        if (TextUtils.isEmpty(user.getPassword()))
            isValid = false;
        if (isValid)
            showToast(TOAST_MESASSAGE_SUCCSES);
        else
            showToast(TOAST_MESASSAGE_FAILED);
    }

    private void showToast(String messageToast) {
        Toast.makeText(context, messageToast, Toast.LENGTH_SHORT).show();
    }
}
