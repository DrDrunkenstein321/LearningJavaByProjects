package org.example.practiceLessons.Practice2;

public class Task3 {
    public static void main(String[] args) {
        Time first = new Time(20, 57, 10);

        String res1 = first.convertUniversal();
        String res2 = first.convertStandart();
        System.out.println(res1);
        System.out.println(res2);
        Time second = new Time(10, 10, 20);
        first.add(second);
        System.out.println(first.convertUniversal());
    }
}

class Time {
    int hour;
    int minute;
    int second;
    Time(int h, int m, int s) {
        setTime(h, m, s);
    }

    void setTime(int h, int m, int s) {
        if(h >= 0 && h <= 23) {
            hour = h;
        } else {
            throw new IllegalArgumentException("Wrong range of hours");
        }
        if(m >= 0 && m <= 59) {
            minute = m;
        } else {
            throw new IllegalArgumentException("Wrong range of minutes");
        }
        if(s >= 0 && s <= 59) {
            second = s;
        } else {
            throw new IllegalArgumentException("Wrong range of seconds");
        }
    }
    String convertUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    String convertStandart() {
        String AMPM;
        if(hour < 12) AMPM = "AM";
        else AMPM = "PM";
        int h12 = hour % 12;
        if(h12 == 0) h12 = 12;

        return String.format("%02d:%02d:%02d %s", h12, minute, second, AMPM);
    }
    void add(Time another) { // hour = 1 minute = 20 seconds = 40  new: hour = 2 minute = 40 seconds = 30

        int formatMin = (second + another.second) / 60; // 40 + 30 = 70 / 60 = 1
        second = (second + another.second) % 60;
        int sumMin = minute + another.minute + formatMin; // 20 + 40 + 1 = 61
        minute = sumMin % 60; // minute = 1
        int formatHour = sumMin / 60; // 61 / 60 = 1
        hour = (hour + another.hour + formatHour) % 24;

    }
}
