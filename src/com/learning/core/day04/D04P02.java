package com.learning.core.day04;

public class D04P02 {
	public static void main(String[] args)
	{
		//CricketRating c= new CricketRating("john",9.3,9.67,8.7);
		CricketRating c2= new CricketRating("Henry",1,1.5,10);
		try
		{
			//c.calculateavgrating(c.critic1, c.critic2);
			c2.calculateavgrating(c2.critic1, c2.critic2);
			//c.calculateavgrating(c.critic1, c.critic2, c.critic3);
			//c.coins=c.calculatecoins(c.avgrating);
			c2.coins=c2.calculatecoins(c2.avgrating);
			//c.display();
			c2.display();
		}
		catch(NotEligibleException e)
		{
			e.printStackTrace();
		}
		
		
	}

}
