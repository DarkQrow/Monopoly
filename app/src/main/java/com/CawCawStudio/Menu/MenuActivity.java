package com.CawCawStudio.Menu;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.CawCawStudio.GameMode.GameModeActivity;
import com.CawCawStudio.R;

public class MenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle arguments = getIntent().getExtras();

        byte mode =  arguments.getByte("mode");

        if (mode == (byte) 1) {
            setContentView(R.layout.main_menu_window);
            Log.d("","1");
        }
        else
            setContentView(R.layout.main_menu_unregisted_window);
    }

    public void newGame(View v) {
        Intent nextActivity = new Intent(this, GameModeActivity.class);
        startActivity(nextActivity);
    }
}
