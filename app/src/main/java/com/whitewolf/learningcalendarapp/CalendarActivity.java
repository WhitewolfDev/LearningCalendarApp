package com.whitewolf.learningcalendarapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class CalendarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        TextView tvGetDate = (TextView) findViewById(R.id.tv_get_date);
        TextView tvOrigDate = (TextView) findViewById(R.id.tv_original_date);
        TextView tvOrigTime = (TextView) findViewById(R.id.tv_original_time);
        TextView tvTimeZone = (TextView) findViewById(R.id.tv_get_timezone);

        StringBuilder dateBuilder = new StringBuilder();

        Calendar calendar = Calendar.getInstance();
        TimeZone tz = TimeZone.getTimeZone("America/Anchorage");
        calendar.setTimeZone(tz);

        String getDate = String.valueOf(calendar.getTime());
        tvGetDate.setText(getDate);

        // Create a formatted date
        String month = String.valueOf(calendar.get(Calendar.MONTH) + 1);
        dateBuilder.append(month);
        dateBuilder.append("/");
        dateBuilder.append(calendar.get(Calendar.DAY_OF_MONTH));
        dateBuilder.append("/");
        dateBuilder.append(calendar.get(Calendar.YEAR));

        StringBuilder timeBuilder = new StringBuilder();

        // Create a formatted date
        String hour = String.valueOf(calendar.get(Calendar.HOUR));
        timeBuilder.append(hour);
        timeBuilder.append(":");
        String minutes = String.valueOf(calendar.get(Calendar.MINUTE));
        timeBuilder.append(minutes);
        timeBuilder.append(":");
        String seconds = String.valueOf(calendar.get(Calendar.SECOND));
        timeBuilder.append(seconds);
        timeBuilder.append(" ");
        int am_pm = calendar.get(Calendar.AM_PM);
        String ampm = "";
        if (am_pm == 0)
            ampm = "AM";
        else
            ampm = "PM";
        timeBuilder.append(ampm);


        // Get a Time Zone
        tvOrigDate.setText(dateBuilder);
        tvOrigTime.setText(timeBuilder);
        tvTimeZone.setText(String.valueOf(calendar.getTimeZone()));

        // Move
    }
}
