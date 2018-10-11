public class NumberDisplay {

    private int limit; // Declare a limit
    private int value = 0; // Declare the value at zero

    public NumberDisplay(int limit){
        this.limit = limit; // Initiation method
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value) {
        if(value < limit && value > 0) this.value = value;
    }

    public String getDisplayValue(){

        String displayValue = Integer.toString(value); // Convert value to string

        // Format for missing zeroes.
        int missingZeroes = Integer.toString(limit).length() - displayValue.length();
        for(int i = 0; i < missingZeroes; i++){
            displayValue = "0" + displayValue;
        }

        return displayValue; // Return display value i.e, if limit = 100 & value = 3 => "003"
    }

    public void increment(){
        value++; // Increment value by 1
        if(value == limit) value = 0; // If value is over limit, reset it.
    }

}
