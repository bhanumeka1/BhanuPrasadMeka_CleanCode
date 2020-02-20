import java.lang.Math;
public class CostOfHouse {
float costis(int type,float area)
{
	float res=0;
	if(type==1)
	{
		res= (float)(1200*area);
	}
	else if(type==2)
	{
		res= (float)(1500*area);
	}
	else if(type==3)
	{
		res= (float)(1800*area);
	}
	else if(type==4)
	{
		res= (float)(2500*area);
	}
	return Math.round(res);
}
}
