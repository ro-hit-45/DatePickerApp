package com.example.datepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
//TimePicker timePicker;
DatePicker datePicker;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        datePicker=findViewById(R.id.date);
    Calendar calender=Calendar.getInstance();
        datePicker.init(
                calender.get(calender.YEAR),
               calender.get(calender.MONTH),
                calender.get(calender.DAY_OF_MONTH),
                new DatePicker.OnDateChangedListener() {
                    @Override
                    public void onDateChanged(DatePicker view, int year, int month, int day) {
                        textView.setText("I HAVE SELECTED " + day + "-" + (month +1) + "-" + year);
                    }

                } );
    }
}