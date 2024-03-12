package com.learning.core.day4;
public class CricketRating {
	String playername;
	double critic1;
	double critic2;
	double critic3;
	double avgrating;
	String coins;
	
	public CricketRating(String nme,double d, double e, double f)
	{
		playername=nme;
		critic1=d;
		critic2=e;
		critic3=f;
	}
	
	public void calculateavgrating(double critic12,double critic22)
	{
		double sum=critic12+critic22;
		avgrating=sum/2;
	}
	
	public void calculateavgrating(double critic12,double critic22,double critic32)
	{
		double sum=critic12+critic22+critic32;
		avgrating=sum/3;
	}
	
	public String calculatecoins(double avg) throws NotEligibleException
	{
		if(avg>=7)
		{
			coins="Gold";
			return coins;
		}
		else if(avg>=5 && avg<7)
		{
			coins="Silver";
			return coins;
		}
		else if(avg>=2 && avg<5)
		{
			coins="Copper";
			return coins;
		}
		else
		{
			throw new NotEligibleException();
		}
	}
	
	public void display()
	{
		System.out.println(playername+" "+avgrating+" "+coins);
	}
}
