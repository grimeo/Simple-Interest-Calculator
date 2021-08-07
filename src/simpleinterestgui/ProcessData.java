
package simpleinterestgui;

public class ProcessData {
    
}

interface SolveProblem{
    public void solve();
}

class SolveInterest extends InputData implements SolveProblem{

    @Override
    public void solve() {
        
        Double p = getPrincipal();
        Double r = getRate();
        Double t = getTime();
        
        Double rp = p * r;
        Double interest =  rp * t;
        
        setInterest(interest);
    }
    
}

class SolvePrincipal extends InputData implements SolveProblem{

    @Override
    public void solve() {
        
        Double i = getInterest();
        Double r = getRate();
        Double t = getTime();
        
        Double rt = r * t;
        Double p = i / rt;
        
        setPrincipal(p);
        
    }
    
}

class SolveRate extends InputData implements SolveProblem{

    @Override
    public void solve() {
        
        Double i = getInterest();
        Double p = getPrincipal();
        Double t = getTime();
        
        Double pt = p * t;
        Double r = i / pt;
        
        setRate(r);
    }
    
}

class SolveTime extends InputData implements SolveProblem{

    @Override
    public void solve() {
        
        Double i = getInterest();
        Double r = getRate();
        Double p = getPrincipal();
        
        Double rp = r * p;
        Double t = i / rp;
        
        setTime(t);
        
    }
    
}
