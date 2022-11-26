package com.CawCawStudio.GameMode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.CawCawStudio.R;

public class GameModeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamemode_window);
    }
    public void botGame(View v){
        Intent nextActivity = new Intent(this,RoomSettingsBotActivity.class);
        startActivity(nextActivity);
    }
    public void playerGame(View v){
        Intent nextActivity = new Intent(this,RoomSettingsPlayerActivity.class);
        startActivity(nextActivity);
    }

}
