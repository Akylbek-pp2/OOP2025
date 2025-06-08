package practice_2;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        if (hour < 0 || hour > 23) hour = 0;
        if (minute < 0 || minute > 59) minute = 0;
        if (second < 0 || second > 59) second = 0;

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        int h = hour % 12;
        if (h == 0) h = 12;
        String ampm = hour < 12 ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", h, minute, second, ampm);
    }

    public void add(Time t) {
        this.second += t.second;
        this.minute += t.minute + this.second / 60;
        this.second %= 60;
        this.hour += t.hour + this.minute / 60;
        this.minute %= 60;
        this.hour %= 24;
    }
}
