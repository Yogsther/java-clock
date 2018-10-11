public class Clock {

    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;

    public Clock(){
        initiate();
    }

    public Clock(int hours, int minutes){
        initiate();
        this.hours.setValue(hours);
        this.minutes.setValue(minutes);
    }

    public void timeTick(){
        minutes.increment();
        if(minutes.getValue() == 0) hours.increment();
        updateDisplay();
    }

    public String getTime(){
        return displayString;
    }

    private void updateDisplay(){
        displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }

    private void initiate(){
        this.hours = new NumberDisplay(24);
        this.minutes = new NumberDisplay(60);
    }


}
