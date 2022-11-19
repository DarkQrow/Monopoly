// Generated by view binder compiler. Do not edit!
package com.CawCawStudio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.CawCawStudio.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RoomSettingsBotBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView botNumberControl;

  @NonNull
  public final Spinner gametype;

  @NonNull
  public final SeekBar seekBar;

  private RoomSettingsBotBinding(@NonNull LinearLayout rootView, @NonNull TextView botNumberControl,
      @NonNull Spinner gametype, @NonNull SeekBar seekBar) {
    this.rootView = rootView;
    this.botNumberControl = botNumberControl;
    this.gametype = gametype;
    this.seekBar = seekBar;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RoomSettingsBotBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RoomSettingsBotBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.room_settings_bot, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RoomSettingsBotBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.botNumberControl;
      TextView botNumberControl = ViewBindings.findChildViewById(rootView, id);
      if (botNumberControl == null) {
        break missingId;
      }

      id = R.id.gametype;
      Spinner gametype = ViewBindings.findChildViewById(rootView, id);
      if (gametype == null) {
        break missingId;
      }

      id = R.id.seekBar;
      SeekBar seekBar = ViewBindings.findChildViewById(rootView, id);
      if (seekBar == null) {
        break missingId;
      }

      return new RoomSettingsBotBinding((LinearLayout) rootView, botNumberControl, gametype,
          seekBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}