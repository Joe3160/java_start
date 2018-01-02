package day31;

public class Time {
    private int hour;
    private int min;
    private int second;
    
    public int getHour() {
        return hour;
    }
    
    public void setHour(int hour) {
        if (hour > 24 || hour < 0) {
            this.hour = -1;
        } else {
            this.hour = hour;
        }
    }
    
    public int getMin() {
        return min;
    }
    
    public void setMin(int min) {
        this.min = min;
    }
    
    public int getSecond() {
        return second;
    }
    
    public void setSecond(int second) {
        this.second = second;
    }
}
