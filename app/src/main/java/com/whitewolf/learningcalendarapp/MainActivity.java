package com.whitewolf.learningcalendarapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {
    TextView tvRegDate;
    TextView tvFormatDate;
    TextView tvRegDay;
    TextView tvRegDay2;
    TextView tvRegMonth;
    TextView tvRegMonth2;
    TextView tvRegMonth3;
    TextView tvRegMonthM;
    TextView tvRegYear;
    TextView tvRegYear2;
    TextView tvRegHour;
    TextView tvRegHour2;
    TextView tvMilHour;
    TextView tvMilHour2;
    TextView tvRegMinute;
    TextView tvRegMinute2;
    TextView tvRegSecond;
    TextView tvRegSecond2;
    TextView tvRegTimeZone;

    StringBuilder stringBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stringBuilder = new StringBuilder();

        tvRegDate = (TextView) findViewById(R.id.tv_regular_date);
        tvFormatDate = (TextView) findViewById(R.id.tv_formatted_date);
        tvRegDay = (TextView) findViewById(R.id.tv_reg_day_1);
        tvRegDay2 = (TextView) findViewById(R.id.tv_reg_day_2);
        tvRegMonth = (TextView) findViewById(R.id.tv_reg_month_1);
        tvRegMonth2 = (TextView) findViewById(R.id.tv_reg_month_2);
        tvRegMonth3 = (TextView) findViewById(R.id.tv_reg_month_3);
        tvRegMonthM = (TextView) findViewById(R.id.tv_reg_month_M);
        tvRegYear = (TextView) findViewById(R.id.tv_reg_year_1);
        tvRegYear2 = (TextView) findViewById(R.id.tv_reg_year_2);
        tvRegHour = (TextView) findViewById(R.id.tv_reg_hour_1);
        tvRegHour2 = (TextView) findViewById(R.id.tv_reg_hour_2);
        tvMilHour = (TextView) findViewById(R.id.tv_mil_reg_hour_1);
        tvMilHour2 = (TextView) findViewById(R.id.tv_mil_reg_hour_2);
        tvRegMinute = (TextView) findViewById(R.id.tv_reg_minute_1);
        tvRegMinute2 = (TextView) findViewById(R.id.tv_reg_minute_2);
        tvRegSecond = (TextView) findViewById(R.id.tv_reg_second_1);
        tvRegSecond2 = (TextView) findViewById(R.id.tv_reg_second_2);
        tvRegTimeZone = (TextView) findViewById(R.id.tv_reg_time_zone);

        displayItems();

    }

    private void displayItems() {
        Date regDate = new Date();
        // This is the raw unformatted date
        tvRegDate.setText("Date: " + String.valueOf(regDate));

        stringBuilder.append("Date: ");
        SimpleDateFormat format1b = new SimpleDateFormat("MM/dd/yyyy hh:hh:ss z", Locale.US);
        stringBuilder.append(format1b.format(regDate));
        tvFormatDate.setText(stringBuilder);

        stringBuilder = new StringBuilder();
        stringBuilder.append("Day (EEE): ");
        SimpleDateFormat format2a = new SimpleDateFormat("EEE", Locale.US);
        stringBuilder.append(format2a.format(regDate));
        //tvRegDay.setText("Day (EEE): " + String.valueOf(format2a.format(regDate)));
        tvRegDay.setText(stringBuilder);

        stringBuilder = new StringBuilder();
        stringBuilder.append("Day (EEEE): ");
        SimpleDateFormat format2b = new SimpleDateFormat("EEEE", Locale.US);
        stringBuilder.append(format2b.format(regDate));
        tvRegDay2.setText(stringBuilder);


        stringBuilder = new StringBuilder();
        stringBuilder.append("Month (M): ");
        SimpleDateFormat format3a = new SimpleDateFormat("M", Locale.US);
        stringBuilder.append(format3a.format(regDate));
        tvRegMonth.setText(stringBuilder);

        stringBuilder = new StringBuilder();
        stringBuilder.append("Month (MM): ");
        SimpleDateFormat format3b = new SimpleDateFormat("MM", Locale.US);
        stringBuilder.append(format3b.format(regDate));
        tvRegMonth2.setText(stringBuilder);

        stringBuilder = new StringBuilder();
        stringBuilder.append("Month (MMM): ");
        SimpleDateFormat format3c = new SimpleDateFormat("MMM", Locale.US);
        stringBuilder.append(format3c.format(regDate));
        tvRegMonth3.setText(stringBuilder);

        stringBuilder = new StringBuilder();
        stringBuilder.append("Month (MMMM): ");
        SimpleDateFormat format3m = new SimpleDateFormat("MMMM", Locale.US);
        stringBuilder.append(format3m.format(regDate));
        tvRegMonthM.setText(stringBuilder);

        stringBuilder = new StringBuilder();
        stringBuilder.append("Year (YY): ");
        SimpleDateFormat format4a = new SimpleDateFormat("YY", Locale.US);
        stringBuilder.append(format4a.format(regDate));
        tvRegYear.setText(stringBuilder);

        stringBuilder = new StringBuilder();
        stringBuilder.append("Year (YYYY): ");
        SimpleDateFormat format4b = new SimpleDateFormat("yyyy", Locale.US);
        stringBuilder.append(format4b.format(regDate));
        tvRegYear2.setText(stringBuilder);

        stringBuilder = new StringBuilder();
        stringBuilder.append("Hours (h): ");
        SimpleDateFormat format5a = new SimpleDateFormat("h", Locale.US);
        stringBuilder.append(format5a.format(regDate));
        tvRegHour.setText(stringBuilder);

        stringBuilder = new StringBuilder();
        stringBuilder.append("Hours (hh): ");
        SimpleDateFormat format5b = new SimpleDateFormat("hh", Locale.US);
        stringBuilder.append(format5b.format(regDate));
        tvRegHour2.setText(stringBuilder);

        stringBuilder = new StringBuilder();
        stringBuilder.append("Military Hours (H): ");
        SimpleDateFormat format8a = new SimpleDateFormat("H", Locale.US);
        stringBuilder.append(format8a.format(regDate));
        tvMilHour.setText(stringBuilder);

        stringBuilder = new StringBuilder();
        stringBuilder.append("Military Hours (HH): ");
        SimpleDateFormat format8b = new SimpleDateFormat("HH", Locale.US);
        stringBuilder.append(format8b.format(regDate));
        tvMilHour2.setText(stringBuilder);

        stringBuilder = new StringBuilder();
        stringBuilder.append("Minutes (m): " );
        SimpleDateFormat format6a = new SimpleDateFormat("m", Locale.US);
        stringBuilder.append(format6a.format(regDate));
        tvRegMinute.setText(stringBuilder);

        stringBuilder = new StringBuilder();
        stringBuilder.append("Minutes (mm): ");
        SimpleDateFormat format6b = new SimpleDateFormat("mm", Locale.US);
        stringBuilder.append(format6b.format(regDate));
        tvRegMinute2.setText(stringBuilder);

        stringBuilder = new StringBuilder();
        stringBuilder.append("Seconds (s): " );
        SimpleDateFormat format7a = new SimpleDateFormat("s", Locale.US);
        stringBuilder.append(format7a.format(regDate));
        tvRegSecond.setText(stringBuilder);

        stringBuilder = new StringBuilder();
        stringBuilder.append("Seconds (ss): ");
        SimpleDateFormat format7b = new SimpleDateFormat("ss", Locale.US);
        stringBuilder.append(format7b.format(regDate));
        tvRegSecond2.setText(stringBuilder);

        stringBuilder = new StringBuilder();
        stringBuilder.append("Time Zone (z): ");
        SimpleDateFormat format9 = new SimpleDateFormat("z", Locale.US);
        stringBuilder.append(format9.format(regDate));
        tvRegTimeZone.setText(stringBuilder);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.main_action_settings_calendar:
                Intent intent = new Intent(MainActivity.this, CalendarActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
