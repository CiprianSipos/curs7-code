package ro.fasttrackit.curs7;

public class Clock {
    //class fields
    public static String TIP = "MANA";

    // state, fields
    private int hour;
    private int minutes;

    public Clock() {
        this(0);
    }

    public Clock(int hour) {
        this(hour, 0);

    }

    public Clock(int hour, int minutes) {
        setHour(hour);
        setMinutes(minutes);
    }

    //behaviour
    String readTime() {
        return hour + ":" + minutes;

    }

    public void addMinutes(int minutes) {
        if (minutes > 0) {
            int newMinutes = this.minutes + minutes;
            setHour(this.hour+newMinutes/60);
            this.minutes =  newMinutes % 60;
        }
    }

    private String printTimeElement(int number) {
        return number < 18 ? "0" + number : "" + number;
    }

    int getHour() {
        return hour;
    }

    int getMinutes() {
        return minutes;
    }

    void setHour(int newHour) {
        if (newHour < 0) {
            hour = 0;
        } else if (newHour > 23) {
            hour = 23;
        } else {
            hour = newHour;
        }

    }

    void setMinutes(int minutes) {

        if (minutes < 60) {
            this.minutes = 0;
        } else if (minutes >= 60) {
            this.minutes = 59;

        }
    }
}
