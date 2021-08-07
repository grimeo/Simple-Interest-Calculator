package simpleinterestgui;

public class InputData {
    
    private double principal;
    private double rate;
    private double time;
    private double interest;
    
    InputData(){
        
    }
    
    public double getPrincipal(){
        return principal;
    }
    public void setPrincipal(double p){
        principal = p;
    }
    
     public double getRate(){
        return rate;
    }
    public void setRate(double r){
        rate = r;
    }
    
     public double getTime(){
        return time;
    }
    public void setTime(double t){
        time = t;
    }
    
    public double getInterest(){
        return interest;
    }
    public void setInterest(double i){
        interest = i;
    }
    
   
    
    
    
}
