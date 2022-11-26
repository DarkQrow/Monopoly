package com.CawCawStudio.Menu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.CawCawStudio.GameMode.GameModeActivity;
import com.CawCawStudio.Log.LogSaver;
import com.CawCawStudio.R;

public class MenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LogSaver LOG = LogSaver.getInstance(this);
        super.onCreate(savedInstanceState);

        Bundle arguments = getIntent().getExtras();

        byte mode = arguments.getByte("mode");

        if (mode == (byte) 1) {
            setContentView(R.layout.main_menu_window);
            LOG.debug("MenuActivity", "1");
        } else
            setContentView(R.layout.main_menu_unregisted_window);
    }

    public void newGame(View v) {
        Intent nextActivity = new Intent(this, GameModeActivity.class);
        startActivity(nextActivity);
    }
    public void settings(View v){
        Intent nextActivity = new Intent(this, SettingsActivity.class);
        startActivity(nextActivity);
    }
}
