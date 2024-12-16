public class Time {
    private int seconds;
    private int hours;
    private int minutes;

    public Time (int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void tick (){
        seconds++;
        if (seconds == 60){
            seconds = 0;
            minutes ++;
        }
        if (minutes == 60){
            minutes = 0;
            hours++;
        }
        if (hours == 24){
            seconds = 0;
            minutes = 0;
            hours = 0;
        }
        //create strings for each to pad value if <10 then use that for toString
    }

    @Override
    public String toString() {
        if (hours<10){
            hours =
        }
        if (hours<10||minutes<10||seconds<10) {
            return "0" + hours + ":0" + minutes + ":0" + seconds;
        }
    }
}
