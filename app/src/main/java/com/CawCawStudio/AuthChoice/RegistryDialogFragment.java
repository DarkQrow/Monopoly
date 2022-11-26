package com.CawCawStudio.AuthChoice;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import com.CawCawStudio.R;

import java.util.Locale;


public class RegistryDialogFragment extends DialogFragment {
    final Calendar datePicker = Calendar.getInstance();
    EditText datePickerEditText;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {


        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = requireActivity().getLayoutInflater();

        View view = inflater.inflate(R.layout.registry_dialog, null);


        datePickerEditText = (EditText) view.findViewById(R.id.datebirth);
        DatePickerDialog.OnDateSetListener date = (view12, year, month, day) -> {
            datePicker.set(Calendar.YEAR, year);
            datePicker.set(Calendar.MONTH, month);
            datePicker.set(Calendar.DAY_OF_MONTH, day);
            updateLabel();
        };
        datePickerEditText.setOnClickListener(view1 -> new DatePickerDialog(view1.getContext(), date, datePicker.get(Calendar.YEAR), datePicker.get(Calendar.MONTH), datePicker.get(Calendar.DAY_OF_MONTH)).show());


        return builder.setView(view).create();


    }

    private void updateLabel() {
        String myFormat = "MM/dd/yy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(myFormat, Locale.US);
        datePickerEditText.setText(dateFormat.format(datePicker.getTime()));
    }


}
