/**
 * the Time class represents a given time based on a 24-hour clock with seconds, minutes, and hours
 */
public class Time {
    private int seconds;
    private int hours;
    private int minutes;

    /**
     * Constructor for the Time class creating a new instance based on the below parameters
     * @param hours represents the number of hours on the time
     * @param minutes represents the number of minutes on the time
     * @param seconds represents the number of seconds on the time
     */
    public Time (int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    /**
     * The tick method of the Time class updates the time of an instance by adding a second to the instance variable seconds.
     * If seconds is greater than or equal to 60 the tick method resets seconds to 0 and adds 1 to minutes, and does the same to hours when minutes becomes greater than or equal to 60.
     * If hours equals to 24 then the time resets all instance variables to 0 to represent exact midnight.
     */
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
    }

    /**
     * the add method of the Time class takes the hours, minutes, and seconds instance variables of one
     * given instance of the Time class and adds it to the instance variables of another instance of the
     * Time class respectively.
     * @param time represents another instance of the Time class to be added to another instance
     *             and is not updated by the method
     */
    public void add (Time time){
        //updates this instances values, not updating time object's values
        this.hours+= time.hours;
        this.minutes+= time.minutes;
        this.seconds += time.seconds;

        //Makes sure no values are greater than or equal to 60 and hours are never equal to 24
        if (seconds >= 60){
            minutes += seconds/60;
            seconds = seconds%60;
        }
        if (minutes >= 60){
            hours+=minutes/60;
            minutes = minutes%60;
        }
        if (hours >= 24){
            hours = hours-24;
        }

    }

    /**
     * toString method for the Time class. This method will return a String padding the hours, minutes, and seconds
     * of the instance so that the time is returned in 00:00:00 format
     * @return returns a String in a proper format containing all
     *         the information of hours, minutes, and seconds of a Time
     */
    @Override
    public String toString() {
        //String variables to store instance variables as String values
        String sHours;
        String sMinutes;
        String sSeconds;

        //if hours,minutes,or seconds are not a double-digit value, then a 0 is concatenated in front of the int value
        if (hours<10){
            sHours = "0"+hours;
        }
        else {
            sHours = "" + hours;
        }
        if (minutes<10){
            sMinutes = "0"+minutes;
        }
        else{
            sMinutes = ""+minutes;
        }
        if (seconds<10){
            sSeconds = "0"+seconds;
        }
        else {
            sSeconds = ""+seconds;
        }

        //returns padded values in 24-Hour clock format
        return sHours + ":" + sMinutes+ ":" +sSeconds;
    }
}
