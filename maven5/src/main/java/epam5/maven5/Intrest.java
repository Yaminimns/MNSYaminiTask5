package epam5.maven5;

public class Intrest {
	 private double p;
	    private double r;
	    private int t;

	    public Intrest(double p, double r, int t) {
	        this.p = p;
	        this.r = r;
	        this.t = t;
	    }

	    public double getSimpleInterest()
	    {
	        return (p*r*t)/100;
	    }
	    public double getCompoundInterest()
	    {
	        return p*Math.pow(1+r/100,t);
	    }

}
