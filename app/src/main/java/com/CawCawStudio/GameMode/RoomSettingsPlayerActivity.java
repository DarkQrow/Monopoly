package com.CawCawStudio.GameMode;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.CawCawStudio.Log.LogSaver;
import com.CawCawStudio.R;

public class RoomSettingsPlayerActivity extends AppCompatActivity {
    int playerNumberSave = 2;
    int botNumberSave = 0;
    SeekBar playerNumber;
    SeekBar botNumber;
    CheckBox botChecker;
    CheckBox tokenCheck;
    CheckBox regPlayerCheck;
    EditText token;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogSaver LOG = LogSaver.getInstance(this);
        setContentView(R.layout.room_settings_player);

        botChecker = findViewById(R.id.botOnOff);
        tokenCheck = findViewById(R.id.tokenOnOff);
        regPlayerCheck = findViewById(R.id.playerRegisty);

        playerNumber = findViewById(R.id.seekBarPlayer);
        playerNumber.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                playerNumberSave = playerNumber.getProgress();
                if (botChecker.isChecked() && (botNumberSave + playerNumberSave) > 6) {
                    playerNumber.setProgress(6 - botNumberSave);
                    botNumber.setProgress(6 - playerNumberSave);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                playerNumberSave = playerNumber.getProgress();
                TextView playerNumberControl = findViewById(R.id.playerNumberControl);
                playerNumberControl.setText(String.valueOf(playerNumber.getProgress()));
                //LogSaver.debug("RoomSettingsPlayerActivity", playerNumberSave + "");
            }
        });

        token = findViewById(R.id.token);
        token.setEnabled(false);
        tokenCheck.setOnCheckedChangeListener((compoundButton, b) -> {
            token.setEnabled(tokenCheck.isChecked());
        });


        botNumber = findViewById(R.id.seekBarBot);
        botNumber.setEnabled(false);
        botChecker.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                botNumber.setEnabled(true);
                botNumberSave = 1;
                botNumber.setProgress(1);

            } else
                botNumber.setEnabled(false);
        });
        botNumber.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                botNumberSave = botNumber.getProgress();
                if (botChecker.isChecked() && (botNumberSave + playerNumberSave > 6)) {
                    botNumber.setProgress(6 - playerNumberSave);
                    playerNumber.setProgress(6 - botNumberSave);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                botNumberSave = botNumber.getProgress();
                TextView botNumberControl = findViewById(R.id.botNumberControl);
                botNumberControl.setText(String.valueOf(botNumber.getProgress()));
                LOG.debug("RoomSettingsPlayerActivity", botNumberSave + "");
            }
        });


    }
}
