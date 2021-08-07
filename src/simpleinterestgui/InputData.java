package simpleinterestgui;

public class InputData {
    
    private static double principal;
    private static double rate;
    private static double time;
    private static double interest;
    
    InputData(){
        
    }
    
//****** Encapsulation *********************************************************
    
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
    
//****** Strategy ****************************************************************    
    
    SolveProblem sp;
    
    public void solveProb(){
        sp.solve();
    }
    
    public void changeFormula(SolveProblem formula){
        this.sp = formula;
    }
}
