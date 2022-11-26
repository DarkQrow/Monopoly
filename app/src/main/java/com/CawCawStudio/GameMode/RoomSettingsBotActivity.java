package com.CawCawStudio.GameMode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.CawCawStudio.Game.GameActivity;
import com.CawCawStudio.Log.LogSaver;
import com.CawCawStudio.R;

public class RoomSettingsBotActivity extends AppCompatActivity implements OnSeekBarChangeListener {

    int playerNumberSave = 2;
    SeekBar botNumber;
    LogSaver LOG = LogSaver.getInstance(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.room_settings_bot);
        botNumber = findViewById(R.id.seekBar);
        botNumber.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        playerNumberSave = botNumber.getProgress();
        TextView botNumberControl = findViewById(R.id.botNumberControl);
        botNumberControl.setText(String.valueOf(botNumber.getProgress()));
        LOG.debug("RoomSettingsBotActivity", playerNumberSave + "");
    }
    public void startGame(View view){
        Intent nextActivity = new Intent(this, GameActivity.class);
        startActivity(nextActivity);
    }

}
