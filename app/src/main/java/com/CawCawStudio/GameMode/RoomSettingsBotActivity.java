package com.CawCawStudio.GameMode;

import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.CawCawStudio.R;

public class RoomSettingsBotActivity extends AppCompatActivity implements OnSeekBarChangeListener{
    int playerNumberSave = 2;
    SeekBar botNumber;

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
        Log.d("",playerNumberSave+"");
    }

}
