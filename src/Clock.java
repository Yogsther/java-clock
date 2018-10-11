public class Clock {

    /* Create number displays for hours and minutes */
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;

    public Clock(){
        // Initiate with default values
        initiate();
    }

    public Clock(int hours, int minutes){
        initiate();
        // Set values
        this.hours.setValue(hours);
        this.minutes.setValue(minutes);
    }

    public void timeTick(){
        minutes.increment();
        if(minutes.getValue() == 0) hours.increment();
    }

    public String getTime(){
        updateDisplay(); // Update displayString
        return displayString;
    }

    private void updateDisplay(){
        displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }

    private void initiate(){
        // Initiate default values
        this.hours = new NumberDisplay(24);
        this.minutes = new NumberDisplay(60);
    }
}
