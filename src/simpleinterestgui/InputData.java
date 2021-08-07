package simpleinterestgui;

public class InputData {
    
    private double principal;
    private double rate;
    private double interest;
    
    InputData(){
        
    }
    
    public double getInterest(){
        return interest;
    }
    public void setInterest(double i){
        interest = i;
    }
    
    public double getRate(){
        return rate;
    }
    public void setRate(double r){
        rate = r;
    }
    
    public double getPrincipal(){
        return principal;
    }
    public void setPrincipal(double p){
        principal = p;
    }
    
}
