package com.magung.ramal_app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText date;
    DatePickerDialog datePickerDialog;
    EditText tName;
    private Object MoveWithDataActivity;

    public int r_day = 0;
    public int r_month = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tName = (EditText) findViewById(R.id.nama);
        date = (EditText) findViewById(R.id.date);
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar c = Calendar.getInstance();
                int mYear = c.get(Calendar.YEAR);
                int mMonth = c.get(Calendar.MONTH);
                int mDay = c.get(Calendar.DAY_OF_MONTH);

                datePickerDialog = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                                date.setText(dayOfMonth + "/" + (month + 1) + "/" + + year);
                                r_day = dayOfMonth;
                                r_month = month + 1;
                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });

        Button btnMoveActivity = findViewById(R.id.bt_ramal);
        btnMoveActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_ramal:
                Intent moveIntent = new Intent(MainActivity.this, RamalActivity.class);
                moveIntent.putExtra(RamalActivity.NAME, tName.getText().toString());
                moveIntent.putExtra(RamalActivity.R_DAY, r_day);
                moveIntent.putExtra(RamalActivity.R_MONTH, r_month);
                startActivity(moveIntent);
                break;
        }
    }
}
