package com.CawCawStudio.AuthChoice;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.CawCawStudio.AuthChoice.data.RetrofitAPI;
import com.CawCawStudio.AuthChoice.data.loginModel;
import com.CawCawStudio.Log.LogSaver;
import com.CawCawStudio.Menu.MenuActivity;
import com.CawCawStudio.R;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AuthChoiceActivity extends AppCompatActivity {
    LogSaver LOG = LogSaver.getInstance(this);
    LoginDialogFragment loginDialogFragment = new LoginDialogFragment();
    RegistryDialogFragment registryDialogFragment = new RegistryDialogFragment();
    EditText userName;
    EditText userPassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auth_choose_window);



    }


    public void showLoginDialog(View view) {
        loginDialogFragment = new LoginDialogFragment();
        loginDialogFragment.show(getSupportFragmentManager(), "custom");
    }


    public void loginDialogPositive(View view) {

        userName = loginDialogFragment.getDialog().findViewById(R.id.username);
        //чисто админские штуки
        String adminLogin = "";
        String adminPassword = "";

        boolean loginCheck = false;
        boolean passwordCheck = false;
        if (userName.getText().toString().equals("")) {
            userName.setText("");
            userName.setHint("Логин введен неверно!");
            userName.setHintTextColor(Color.RED);
        } else {
            loginCheck = true;
            adminLogin = userName.getText().toString();
        }
        userPassword = loginDialogFragment.getDialog().findViewById(R.id.password);
        if (userPassword.getText().toString().length() < 6) {
            userPassword.setText("");
            userPassword.setHint("Пароль меньше шести символов!");
            userPassword.setHintTextColor(Color.RED);
        } else {
            passwordCheck = true;
            adminPassword = userPassword.getText().toString();
        }
        if (loginCheck && passwordCheck) {
            if (adminLogin.equals("DarkQrow") && adminPassword.equals("123456")) {
                Intent intent = new Intent(this, MenuActivity.class);
                intent.putExtra("mode", (byte) 1);
                startActivity(intent);
                loginDialogFragment.getDialog().cancel();
            }
            if (userName.getText().toString().isEmpty() && userPassword.getText().toString().isEmpty()) {
                Toast.makeText(AuthChoiceActivity.this, "Please enter both the values", Toast.LENGTH_SHORT).show();
                return;
            }
            // calling a method to post the data and passing our name and job.
            postData(userName.getText().toString(), userPassword.getText().toString());
        }
    }
    private void postData(String name, String password) {

        // below line is for displaying our progress bar.

        // on below line we are creating a retrofit
        // builder and passing our base url
        Retrofit retrofit = new Retrofit.Builder()
                // .baseUrl("https://login1.requestcatcher.com")
                .baseUrl("https://reqres.in/api/")
                // as we are sending data in json format so
                // we have to add Gson converter factory
                .addConverterFactory(GsonConverterFactory.create())
                // at last we are building our retrofit builder.
                .build();
        // below line is to create an instance for our retrofit api class.
        RetrofitAPI retrofitAPI = retrofit.create(RetrofitAPI.class);

        // passing data from our text fields to our modal class.
        loginModel modal = new loginModel(name, password);

        // calling a method to create a post and passing our modal class.
        Call<loginModel> call = retrofitAPI.createPost(modal);

        // on below line we are executing our method.
        call.enqueue(new Callback<loginModel>() {
            @Override
            public void onResponse(Call<loginModel> call, Response<loginModel> response) {
                // this method is called when we get response from our api.

                // on below line we are setting empty text
                // to our both edit text.
                userName.setText("");
                userPassword.setText("");

                // we are getting response from our body
                // and passing it to our modal class.
                loginModel responseFromAPI = response.body();

                // on below line we are getting our data from modal class and adding it to our string.
                String responseString = "Response Code : " + response.code()
                        + "\nlogin : " + responseFromAPI.getLogin() + "\n"
                        + "password : " + responseFromAPI.getPassword()+"\n"
                        + "botToken : "+ responseFromAPI.getBotToken();

                // below line we are setting our
                // string to our text view.
                Toast.makeText(AuthChoiceActivity.this,responseString,Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<loginModel> call, Throwable t) {
                // setting text to our text view when
                // we get error response from API.
                Toast.makeText(AuthChoiceActivity.this,"Error found is : " + t.getMessage(),Toast.LENGTH_LONG).show();
            }
        });
    }

    public void loginDialogNegative(View view) {
        loginDialogFragment.getDialog().cancel();
    }

    public void showRegistryDialog(View view) {
        registryDialogFragment = new RegistryDialogFragment();
        registryDialogFragment.show(getSupportFragmentManager(), "custom");
    }

    public void registryDialogPositive(View view) {

        EditText temp = registryDialogFragment.getDialog().findViewById(R.id.username);
        //чисто админские штуки
        String adminLogin = "";
        String admonPassword = "";

        boolean loginCheck = false;
        boolean passwordCheck = false;
        if (temp.getText().toString().equals("")) {
            temp.setText("");
            temp.setHint("Логин введен неверно!");
            temp.setHintTextColor(Color.RED);
        } else {
            loginCheck = true;
            adminLogin = temp.getText().toString();
        }
        temp = registryDialogFragment.getDialog().findViewById(R.id.password);
        if (temp.getText().toString().length() < 6) {
            temp.setText("");
            temp.setHint("Пароль меньше шести символов!");
            temp.setHintTextColor(Color.RED);
        } else {
            passwordCheck = true;
            admonPassword = temp.getText().toString();
        }
        if (loginCheck && passwordCheck) {
            if (adminLogin.equals("DarkQrow") && admonPassword.equals("123456")) {
                Intent intent = new Intent(this, MenuActivity.class);
                intent.putExtra("mode", (byte) 1);
                startActivity(intent);
                loginDialogFragment.getDialog().cancel();
            }

            //TODO Вот тут типа отправка запроса для нее даже есть пара классов
        }
    }

    public void registryDialogNegative(View view) {
        registryDialogFragment.getDialog().cancel();
    }


    public void guestLogin(View view) {
        Intent nextActivity = new Intent(this, MenuActivity.class);
        nextActivity.putExtra("mode", (byte) 0);
        startActivity(nextActivity);
    }


}