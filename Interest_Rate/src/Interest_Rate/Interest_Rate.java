package Interest_Rate;

public class Interest_Rate {
	public double simple_interest(double pr,double t,double r)
	{
		double interest=(pr*t*r)/100;
		return interest;
	}
	public double compound_interest(double pr,double t,double r)
	{
		double compound_interest=(pr *(Math.pow((1 + r / 100), t))) ;
		return compound_interest;
		}
}
