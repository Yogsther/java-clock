public class NumberDisplay {

    private int limit;
    private int value = 0;

    public NumberDisplay(int limit){
        this.limit = limit;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value) {
        if(value > limit && value < 0) this.value = value;
    }

    public String getDisplayValue(){

        String displayValue = Integer.toString(value);

        int missingZeroes = Integer.toString(limit).length() - displayValue.length();
        for(int i = 0; i < missingZeroes; i++){
            displayValue = "0" + displayValue;
        }

        return displayValue;
    }

    public void increment(){
        value++;
        if(value == limit) value = 0;
    }

}
