package deitel.chapter3;

public class Clock {
    private int hour;
    private int minute;
    private int seconds;

    public Clock(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        if (hour < 0 || hour > 23) {
            System.out.println("invalid ");
        }
    }


        public int getSeconds () {
            return seconds;
        }

        public void setSeconds ( int seconds){
            this.seconds = seconds;
            if (seconds < 0 || seconds > 59) {
                System.out.println("invalid ");
            }
        }


        public int getMinute () {
            return minute;
        }

        public void setMinute ( int minute){
            this.minute = minute;
            if (minute < 0 || minute > 59) {
                System.out.println("invalid ");
            }
        }
}