
package simpleinterestgui;

public class ProcessData {
    
}

interface SolveProblem{
    public void solve();
}

class SolveInterest extends InputData implements SolveProblem{

    InputData input = new InputData();
    
    @Override
    public void solve() {
        Double p = input.getPrincipal();
        Double r = input.getRate();
        Double t = input.getTime();
        
        Double rp = p * r;
        Double interest =  rp * t;
        input.setInterest(interest);
    }
    
}

class SolveRate extends InputData implements SolveProblem{

    InputData input = new InputData();
    
    @Override
    public void solve() {
        
    }
    
}


class SolveTime extends InputData implements SolveProblem{

    InputData input = new InputData();
    
    @Override
    public void solve() {
        
    }
    
}

class SolvePrincipal extends InputData implements SolveProblem{

    InputData input = new InputData();
    
    @Override
    public void solve() {
        
    }
    
}