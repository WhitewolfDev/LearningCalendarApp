java.util.Date() method

Remember that this is only efficient for getting a simple timestamp or a formatted timestamp with
the java.text.SimpleDateFormat() method.  To extract values from date or manipulate these values, probably
best to use java.util.Calendar

// Instantiate
Date date = new Date();

// NOTE: Remember that the emulator times do not always reflect the time in your time zone.  Mine was an
// hour off and it bugged the crap out of me until i realized what was going on.  So, I set the date
// time manually on the emulator to select my time zone for testing purposes.

// Format the date
SimpleDateFormat format = new SimpleDateFormat("<pattern>");

      // SimpleDateFormat can be used to control the date/time display format:
      //   E (day of week): 3E or fewer (in text xxx), >3E (in full text)
      //   M (month): M (in number), MM (in number with leading zero)
      //              3M: (in text xxx), >3M: (in full text full)
      //   d (day):  D (in number), DD (in number with leading zero)
      //   y/Y (year):  either 'y' or 'Y' seem to work YY (18) or YYYY (2018)
      //   h (hour): h, hh (with leading zero)
      //   m (minute)
      //   s (second)
      //   a (AM/PM)
      //   H (hour in 0 to 23)
      //   z (time zone)


java.util.Calendar:

No constructor, so use the following:
Calendar calendar = Calendar.getInstance();

Supports:
Calendar.getInstance(TimeZone zone);
Calendar.getInstance(Locale aLocale);
Calendar.getInstance(TimeZone zone, Locale aLocale);

A number of "deeper" answers say that it is necessary to use Locale and TimeZone.  To use TimeZone
in a Calendar object, use the following code.

    Calendar calendar = Calendar.getInstance();
    TimeZone tz = TimeZone.getTimeZone("America/Anchorage");
    calendar.setTimeZone(tz);


Here is a webpage with the list of TimeZones:
https://gist.github.com/arpit/1035596


There are a number of properties to use with the get() method to obtain various values from the
Calendar object.

calendar.get(Calendar.DAY_OF_WEEK);   // returns Calendar.SUNDAY (1) through Calendar.SATURDAY (7)
calendar.get(Calendar.YEAR);          // year
calendar.get(Calendar.MONTH);         // returns Calendar.JANUARY (0) to Calendar.DECEMBER (11)
calendar.get(Calendar.DAY_OF_MONTH);  // returns Calendar.DATE (1 to 31)
calendar.get(Calendar.HOUR_OF_DAY);   // returns 0 to 23
calendar.get(Calendar.MINUTE);        // returns 0 to 59
calendar.get(Calendar.SECOND);        // returns 0 to 59
calendar.get(Calendar.MILISECOND);    // returns 0 to 999
calendar.get(Calendar.HOUR);          // returns 0 to 11 (used in conjunction with Calendar.AM or
                                         Calendar.PM
calendar.get(Calendar.AM_PM);         // returns Calendar.AM (0) or Calendar.PM (1)
calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);   // returns week of days (7 days) in number (1)
                                      // days [1 - 7] = 1
                                      // days [8 - 14] = 2
                                      // days [15 - 21] = 3
                                      // days [22 - 28] = 4
                                      // days [29 - 31] = 5
calendar.get(Calendar.DAY_OF_YEAR);   // returns 1 - 366 (guess this includes leap year...)
calendar.get(Calendar.ZONE_OFFSET);   // GMT offset value of the time zone.
calendar.get(Calendar.ERA);           // Indicate AD (GregorianCalendar.AD), BC (GregorianCalendar.BC)
calendar.get();
calendar.get();
calendar.get();
calendar.get();
calendar.get();
calendar.get();
calendar.get();