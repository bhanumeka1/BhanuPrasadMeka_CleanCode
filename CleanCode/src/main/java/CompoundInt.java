import java.lang.Math;
public class CompoundInt {
double compoundinterest(float p,double r,double t)
{
	double res,y;
	y=Math.pow(1+r/100,t);
	res=(p*y);
	
	return res;
}
}
