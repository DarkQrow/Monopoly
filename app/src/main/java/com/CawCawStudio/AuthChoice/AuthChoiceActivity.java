package com.CawCawStudio.AuthChoice;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.JsonReader;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.CawCawStudio.AuthChoice.data.RegistryDialogFragment;
import com.CawCawStudio.Menu.MenuActivity;
import com.CawCawStudio.R;

public class AuthChoiceActivity extends AppCompatActivity {

    LoginDialogFragment loginDialogFragment = new LoginDialogFragment();
    RegistryDialogFragment registryDialogFragment = new RegistryDialogFragment();

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

        EditText temp = loginDialogFragment.getDialog().findViewById(R.id.username);
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
        temp = loginDialogFragment.getDialog().findViewById(R.id.password);
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