package com.CawCawStudio.Game;

import android.app.AlertDialog;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.CawCawStudio.AuthChoice.LoginDialogFragment;
import com.CawCawStudio.R;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.game_window);
        hideSystemUI();


    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN){
            setContentView(R.layout.game_window_action);
        }
        if (keyCode == KeyEvent.KEYCODE_VOLUME_UP){
            setContentView(R.layout.game_window);
        }
        return true;
    }
    public void showMercedesDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_mercedes, null);
        AlertDialog dialog =  builder.setView(dialogView).create();
        dialog.show();
       dialog.getWindow().setLayout(700, 950);
    }
    public void showAudiDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_audi, null);
        AlertDialog dialog =  builder.setView(dialogView).create();
        dialog.show();
        dialog.getWindow().setLayout(700, 950);
    }
    public void showFordDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_ford, null);
        AlertDialog dialog =  builder.setView(dialogView).create();
        dialog.show();
        dialog.getWindow().setLayout(700, 950);
    }
    public void showLandRoverDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_landrover, null);
        AlertDialog dialog =  builder.setView(dialogView).create();
        dialog.show();
        dialog.getWindow().setLayout(700, 950);
    }
    public void showAdidasDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_adidas, null);
        AlertDialog dialog =  builder.setView(dialogView).create();
        dialog.show();
        dialog.getWindow().setLayout(700, 1050);
    }
    public void showPumaDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_puma, null);
        AlertDialog dialog =  builder.setView(dialogView).create();
        dialog.show();
        dialog.getWindow().setLayout(700, 1050);
    }
    public void showLacosteDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_lacoste, null);
        AlertDialog dialog =  builder.setView(dialogView).create();
        dialog.show();
        dialog.getWindow().setLayout(700, 1050);
    }
    public void showHugoBossDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_hugoboss, null);
        AlertDialog dialog =  builder.setView(dialogView).create();
        dialog.show();
        dialog.getWindow().setLayout(700, 1050);
    }
    public void showChanelDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_chanel, null);
        AlertDialog dialog =  builder.setView(dialogView).create();
        dialog.show();
        dialog.getWindow().setLayout(700, 1050);
    }
    public void showFantaDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_fanta, null);
        AlertDialog dialog =  builder.setView(dialogView).create();
        dialog.show();
        dialog.getWindow().setLayout(700, 1050);
    }
    public void showPepsiDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_pepsi, null);
        AlertDialog dialog =  builder.setView(dialogView).create();
        dialog.show();
        dialog.getWindow().setLayout(700, 1050);
    }
    public void showCocaColaDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_cocacola, null);
        AlertDialog dialog =  builder.setView(dialogView).create();
        dialog.show();
        dialog.getWindow().setLayout(700, 1050);
    }
    public void showTwitterDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_twitter, null);
        AlertDialog dialog =  builder.setView(dialogView).create();
        dialog.show();
        dialog.getWindow().setLayout(700, 1050);
    }
    public void showFacebookDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_facebook, null);
        AlertDialog dialog =  builder.setView(dialogView).create();
        dialog.show();
        dialog.getWindow().setLayout(700, 1050);
    }
    public void showVKDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_vk, null);
        AlertDialog dialog =  builder.setView(dialogView).create();
        dialog.show();
        dialog.getWindow().setLayout(700, 1050);
    }
    public void showRockStarDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_rockstar, null);
        AlertDialog dialog =  builder.setView(dialogView).create();
        dialog.show();
        dialog.getWindow().setLayout(700, 850);

    }
    public void showRovioDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_rovio, null);
        AlertDialog dialog =  builder.setView(dialogView).create();
        dialog.show();
        dialog.getWindow().setLayout(700, 850);
    }
    public void showAmericanAirlinesDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_americanailines, null);
        AlertDialog dialog =  builder.setView(dialogView).create();
        dialog.show();
        dialog.getWindow().setLayout(700, 1050);
    }
    public void showLufthansaDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_lufthansa, null);
        AlertDialog dialog =  builder.setView(dialogView).create();
        dialog.show();
        dialog.getWindow().setLayout(700, 1050);
    }
    public void showBritishAirlinesDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_britishairlines, null);
        AlertDialog dialog =  builder.setView(dialogView).create();
        dialog.show();
        dialog.getWindow().setLayout(700, 1050);
    }
    public void showMcDonaldsDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_mcdonalds, null);
        AlertDialog dialog =  builder.setView(dialogView).create();
        dialog.show();
        dialog.getWindow().setLayout(700, 1050);
    }
    public void showBurgerKingDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_burgerking, null);
        AlertDialog dialog =  builder.setView(dialogView).create();
        dialog.show();
        dialog.getWindow().setLayout(700, 1050);
    }
    public void showKFCDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_kfc, null);
        AlertDialog dialog =  builder.setView(dialogView).create();
        dialog.show();
        dialog.getWindow().setLayout(700, 1050);
    }
    public void showHolidayInnDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_holidayinn, null);
        AlertDialog dialog =  builder.setView(dialogView).create();
        dialog.show();
        dialog.getWindow().setLayout(700, 1050);
    }
    public void showRadissonBluDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_radisson, null);
        AlertDialog dialog =  builder.setView(dialogView).create();
        dialog.show();
        dialog.getWindow().setLayout(700, 1050);
    }
    public void showNovotelDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_novotel, null);
        AlertDialog dialog =  builder.setView(dialogView).create();
        dialog.show();
        dialog.getWindow().setLayout(700, 1050);
    }
    public void showApplelDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_apple, null);
        AlertDialog dialog =  builder.setView(dialogView).create();
        dialog.show();
        dialog.getWindow().setLayout(700, 1050);
    }
    public void showNokiaDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_nokia, null);
        AlertDialog dialog =  builder.setView(dialogView).create();
        dialog.show();
        dialog.getWindow().setLayout(700, 1050);
    }




    private void hideSystemUI() {
        View decorView = this.getWindow().getDecorView();
        int uiOptions = decorView.getSystemUiVisibility();
        int newUiOptions = uiOptions;
        newUiOptions |= View.SYSTEM_UI_FLAG_LOW_PROFILE;
        newUiOptions |= View.SYSTEM_UI_FLAG_FULLSCREEN;
        newUiOptions |= View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
        newUiOptions |= View.SYSTEM_UI_FLAG_IMMERSIVE;
        newUiOptions |= View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility(newUiOptions);
    }
}
