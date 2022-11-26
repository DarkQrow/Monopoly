package com.CawCawStudio.Menu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

import com.CawCawStudio.GameMode.GameModeActivity;
import com.CawCawStudio.Log.LogSaver;
import com.CawCawStudio.R;

public class SettingsActivity extends AppCompatActivity {

    LogSaver LOG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LOG = LogSaver.getInstance(this);
        setContentView(R.layout.settings_window);
    }
    public void affirmIP(View view){
        EditText IP = findViewById(R.id.settings_ip);
        if(IP.toString().equals("")){
            //TODO
        }
        else{
            LOG.debug("Settings",IP.getText().toString());
            Intent nextActivity = new Intent(this, MenuActivity.class);
            startActivity(nextActivity);
        }
    }
}
