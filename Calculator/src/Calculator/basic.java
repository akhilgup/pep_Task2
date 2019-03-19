package Calculator;
public class basic {
	String s="Denominator can't be Zero";
public double  addition(double a,double b)
{
	return a+b;
}
public double  multiplication(double a,double b)
{
	return a*b;
}
public double  division(double a,double b)
{
	if(b==0) {
		throw new IllegalArgumentException("Can't divide with Zero");
	}
	else {
		return a/b;
	}
}
}
