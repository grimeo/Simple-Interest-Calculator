package simpleinterestgui;

public class InputData {
    
    private static int principal;
    private static int rate;
    private static int interest;
    
    InputData(){
        
    }
    
    public int getInterest(){
        return interest;
    }
    public void setInterest(int i){
        interest = i;
    }
    
    public int getRate(){
        return rate;
    }
    public void setRate(int r){
        rate = r;
    }
    
    public int getPrincipal(){
        return principal;
    }
    public void setPrincipal(int p){
        principal = p;
    }
    
}
