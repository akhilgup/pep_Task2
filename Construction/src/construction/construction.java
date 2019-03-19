package construction;

public class construction {
	public double construction(int ch,double sqft)
	{
		if(ch==1)
		{
		double res=sqft*1200; //for Standard Materials
				return res;}
		else if(ch==2)
		{
		double res1=sqft*1500; //for Above Standard Materials
				return res1;}
		else if(ch==3) {
		double res2=sqft*1800; //for High Standard Materials
				return res2;}
		else {
		double res3=sqft*2500; //for High Standard Materials and fully automated house
				return res3;}
		}
		
}