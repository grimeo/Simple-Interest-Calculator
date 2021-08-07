
package simpleinterestgui;

public class ProcessData {
    
}

interface SolveProblem{
    public void solve();
}

class SolveInterest implements SolveProblem{

    InputData input = new InputData();
    
    @Override
    public void solve() {
        Double r = input.getRate();
        Double t = input.getTime();
        Double i = input.getInterest();
        
        Double p = (r*t)/i;
    }
    
}

class SolveRate implements SolveProblem{

    InputData input = new InputData();
    
    @Override
    public void solve() {
        
    }
    
}

class SolvePrincipal implements SolveProblem{

    InputData input = new InputData();
    
    @Override
    public void solve() {
        
    }
    
}