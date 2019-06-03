public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        this.hours = new BoundedCounter(24);
        this.hours.setValue(hoursAtBeginning);
        this.minutes = new BoundedCounter(60);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds = new BoundedCounter(60);
        this.seconds.setValue(secondsAtBeginning);
    }
    
    public void tick() {
            if(this.seconds.getValue() == 59){
             
            if(this.minutes.getValue() == 59) {
                this.hours.next();
            }
             this.minutes.next();
             this.seconds.next();
         } else {
             this.seconds.next();
         }
    }

    
    public String toString() {
        // returns the string representation
        return hours + ":" + minutes + ":" + seconds;
    }
}
