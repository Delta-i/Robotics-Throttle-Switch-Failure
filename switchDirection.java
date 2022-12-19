public class switchDirection{
 
    private double throttle;
    private double throttle2;
    private double throttle1;
    private int reverseDirectionCount = 0;
 
    public switchDirection(double throttle1, double throttle2){
        this.throttle1 = throttle1;
        this.throttle = throttle1;
        this.throttle2 = throttle2;
    }
    
    public void switchThrottle(){
        reverseDirectionCount++;
        if(reverseDirectionCount % 2 == 0){
            throttle = throttle1;
        }
        else{
            throttle = throttle2;
        }
    }
    public double getThrottle(){
        return throttle;
    }
 
    public void setThrottle1(double throttle){
        this.throttle1 = throttle;
        this.throttle = throttle;
        reverseDirectionCount = 0;
    }

    public void setThrottle2(double throttle){
        this.throttle2 = throttle;
        this.throttle = throttle;
        reverseDirectionCount = 1;
    }
 
    public String toString(){
        return "Throttle: " + throttle;
    }
 
}